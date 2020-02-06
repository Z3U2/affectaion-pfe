package gl.group.pfe.ports.out;

import gl.group.pfe.domain.Student;
import gl.group.pfe.domain.User.UserId;

/**
 * LoadStudentPort
 */
public interface LoadStudentPort {

    Student loadStudent(UserId id) throws Exception;

}