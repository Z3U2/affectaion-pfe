package gl.group.pfe.services;

import java.util.List;

import gl.group.pfe.common.exceptions.NotFoundException;
import gl.group.pfe.domain.Student;
import gl.group.pfe.domain.Teacher;
import gl.group.pfe.domain.User.UserId;
import gl.group.pfe.ports.in.EditStudentListUseCase;
import gl.group.pfe.ports.in.EditTeacherListUseCase;
import gl.group.pfe.ports.out.LoadStudentPort;
import gl.group.pfe.ports.out.LoadStudentsPort;
import gl.group.pfe.ports.out.LoadTeacherPort;
import gl.group.pfe.ports.out.LoadTeachersPort;
import gl.group.pfe.ports.out.UpdateStudentPort;
import gl.group.pfe.ports.out.UpdateTeacherPort;
import lombok.RequiredArgsConstructor;

/**
 * EditListService
 */
@RequiredArgsConstructor
public class EditListService implements EditStudentListUseCase, EditTeacherListUseCase {

    // Student Persistence Ports
    private final LoadStudentPort loadStudentPort;
    private final UpdateStudentPort updateStudentPort;
    private final LoadStudentsPort loadStudentsPort;
    
    // Teacher Persistence Ports
    private final LoadTeacherPort loadTeacherPort;
    private final UpdateTeacherPort updateTeacherPort;
    private final LoadTeachersPort loadTeachersPort;


    @Override
    public void editList(EditStudentListCommand command) throws Exception {
        Student student = loadStudentPort.loadStudent(command.getId());
        List<UserId> idList = command.getList();
        List<Teacher> teacherList=loadTeachersPort.loadTeachers(idList);
        if (teacherList.size() != idList.size()) {
            throw new NotFoundException("Some of the specified teachers do not exist");
        }
        student.editList(idList);
        updateStudentPort.updateStudent(student);
    }

    @Override
    public void editList(EditTeacherListCommand command) throws Exception {
        Teacher teacher = loadTeacherPort.loadTeacher(command.getId());
        List<UserId> idList = command.getList();
        List<Student> studentList = loadStudentsPort.loadStudents(idList);
        if (studentList.size() != idList.size()) {
            throw new NotFoundException("Some of the specified teachers do not exist");
        }
        teacher.editList(command.getList());
        updateTeacherPort.updateTeacher(teacher);
    }

    
}