package gl.group.pfe.ports.out;

import gl.group.pfe.domain.Teacher;
import gl.group.pfe.domain.User.UserId;

/**
 * LoadTeacherPort
 */
public interface LoadTeacherPort {

    Teacher loadTeacher(UserId id) throws Exception;

}