package gl.group.pfe.ports.out;

import gl.group.pfe.domain.Student;

/**
 * UpdateStudentPort
 */
public interface UpdateStudentPort {

    void updateStudent(Student user) throws Exception;

}