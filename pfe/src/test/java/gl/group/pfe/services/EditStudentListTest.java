package gl.group.pfe.services;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import gl.group.pfe.domain.Student;
import gl.group.pfe.domain.StudentData;
import gl.group.pfe.domain.TeacherData;
import gl.group.pfe.domain.User.UserId;
import gl.group.pfe.ports.in.EditStudentListUseCase;
import gl.group.pfe.ports.in.EditStudentListUseCase.EditStudentListCommand;
import gl.group.pfe.ports.out.LoadStudentPort;
import gl.group.pfe.ports.out.LoadStudentsPort;
import gl.group.pfe.ports.out.LoadTeacherPort;
import gl.group.pfe.ports.out.LoadTeachersPort;
import gl.group.pfe.ports.out.UpdateStudentPort;
import gl.group.pfe.ports.out.UpdateTeacherPort;

/**
 * EditStudentListTest
 */
public class EditStudentListTest {

    EditStudentListUseCase editStudentListUseCase;
    
    // Student Persistence Ports
    @Mock private LoadStudentPort loadStudentPort;
    @Mock private UpdateStudentPort updateStudentPort;
    @Mock private LoadStudentsPort loadStudentsPort;

    // Teacher Persistence Ports
    @Mock private LoadTeacherPort loadTeacherPort;
    @Mock private UpdateTeacherPort updateTeacherPort;
    @Mock private LoadTeachersPort loadTeachersPort;

    @BeforeAll
    void initUseCase() throws Exception {
        editStudentListUseCase = new EditListService(loadStudentPort, updateStudentPort, loadStudentsPort,
                loadTeacherPort, updateTeacherPort, loadTeachersPort);
    }

    @Test
    void callsloadStudent() {
        
        // EditStudentListCommand command = new EditStudentListCommand(id, list)
        // editStudentListUseCase.editList(command);
    }


}