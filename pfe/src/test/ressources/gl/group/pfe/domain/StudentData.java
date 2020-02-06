package gl.group.pfe.domain;

import java.util.ArrayList;
import java.util.List;

import gl.group.pfe.domain.User.UserId;

/**
 * StudentData
 */
public class StudentData {

    static private Student testStudentFromId(UserId id) {
        return Student.makeInstance(id, "firstName", "lastName", new ArrayList<>());    
    }

    static public Student defaultStudent() {
        return testStudentFromId(new UserId((long) 1));
    }

    static public List<Student> defaultStudentList() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(testStudentFromId(new UserId((long) 1)));
        list.add(testStudentFromId(new UserId((long) 2)));
        list.add(testStudentFromId(new UserId((long) 3)));
        list.add(testStudentFromId(new UserId((long) 4)));
        return list;
    }
    
}