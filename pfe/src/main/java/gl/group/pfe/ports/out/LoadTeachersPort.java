package gl.group.pfe.ports.out;

import java.util.List;

import gl.group.pfe.domain.Teacher;
import gl.group.pfe.domain.User.UserId;

/**
 * LoadTeachersPort
 */
public interface LoadTeachersPort {

    List<Teacher> loadTeachers(List<UserId> list) throws Exception;

}