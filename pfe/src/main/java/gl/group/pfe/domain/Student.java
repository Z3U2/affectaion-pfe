package gl.group.pfe.domain;

import java.util.List;

/**
 * Student
 */
public class Student extends AffectableUser {

    private Student(
        UserId id,
        String firstName,
        String lastName,
        List<UserId> priorityList) {
            super(id, firstName, lastName, 3, priorityList);
        }

    public static Student makeInstance(UserId id, String firstName, String lastName,
            List<UserId> list) {
        return new Student(id, firstName, lastName, list);
    }

    @Override
    public void setCapacity(Integer capacity) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Student can't set capacity");
    }

}