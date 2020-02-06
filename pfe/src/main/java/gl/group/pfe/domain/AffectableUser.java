package gl.group.pfe.domain;

import java.util.List;

import lombok.Getter;

/**
 * AffectableUser
 */
public abstract class AffectableUser extends User {

    @Getter protected Integer capacity;
    @Getter final List<UserId> priorityList;

    public AffectableUser(
        UserId id,
        String firstName,
        String lastName,
        Integer capacity,
        List<UserId> priorityList) {
            super(id, firstName, lastName);
            this.priorityList = priorityList;
            this.capacity = capacity;
    }

    public void editList(final List<User.UserId> list) throws Exception {
        if (list == null) {
            throw new IllegalArgumentException("Input list can't be null");
        }
        int size = list.size();
        if (size > capacity) {
            throw new IllegalArgumentException("Input list is larger than specified capacity");
        }
        priorityList.clear();
        priorityList.addAll(list);
    }

    public abstract void setCapacity(Integer capacity) throws CapacityTooSmallException, UnsupportedOperationException;

}