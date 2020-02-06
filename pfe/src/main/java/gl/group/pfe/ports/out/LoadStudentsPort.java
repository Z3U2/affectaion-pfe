package gl.group.pfe.ports.out;

import java.util.List;

import gl.group.pfe.domain.Student;
import gl.group.pfe.domain.User.UserId;

/**
 * LoadStudentsPort
 */
public interface LoadStudentsPort {

    List<Student> loadStudents(List<UserId> list) throws Exception;

}