package gl.group.pfe.ports.out;

import gl.group.pfe.domain.Teacher;

/**
 * UpdateTeacherPort
 */
public interface UpdateTeacherPort {

    void updateTeacher(Teacher user) throws Exception;

}