package gl.group.pfe.domain;

import java.util.ArrayList;
import java.util.List;

import gl.group.pfe.domain.User.UserId;

/**
 * TeacherData
 */
public class TeacherData {

    static private Teacher testTeacherFromId(UserId id) {
        return Teacher.makeInstance(id, "firstName", "lastName", 3, new ArrayList<>());
    }

    static public Teacher defaultTeacher() {
        return testTeacherFromId(new UserId((long) 1));
    }

    static public List<Teacher> defaultTeacherList() {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(testTeacherFromId(new UserId((long) 1)));
        list.add(testTeacherFromId(new UserId((long) 2)));
        list.add(testTeacherFromId(new UserId((long) 3)));
        list.add(testTeacherFromId(new UserId((long) 4)));
        return list;
    }

}