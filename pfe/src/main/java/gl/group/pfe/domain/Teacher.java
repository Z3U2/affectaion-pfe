package gl.group.pfe.domain;

import java.util.List;

/**
 * Teacher
 */
public class Teacher extends AffectableUser {

    private Teacher(
        UserId id,
        String firstName,
        String lastName,
        Integer capacity,
        List<UserId> priorityList) {
            super(id, firstName, lastName, capacity, priorityList);
        }

    public static Teacher makeInstance(UserId id, String firstName, String lastName, Integer capacity, List<UserId> list) {
        return new Teacher(id, firstName, lastName, capacity, list);
    }

    @Override
    public void setCapacity(Integer capacity) throws IllegalArgumentException, CapacityTooSmallException {
        if (capacity == null) {
            throw new IllegalArgumentException("Capacity can't be null");
        }
        if (priorityList.size() > capacity) {
            throw new CapacityTooSmallException("Capacity Too Small");
        }
        this.capacity = capacity;
    }

}