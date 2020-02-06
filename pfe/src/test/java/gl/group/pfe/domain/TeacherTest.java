package gl.group.pfe.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gl.group.pfe.domain.User.UserId;

/**
 * TeacherTest
 */
public class TeacherTest {

    private Teacher teacher;

    @BeforeEach
    void initTeacher() {
        UserId id = new UserId((long) 1);
        teacher = Teacher.makeInstance(id, "Mohammed Ilyass", "Nasr", 3, new ArrayList<UserId>());
    }

    @Test
    void editListWithEmptyListPasses() {
        try {
            ArrayList<UserId> list = new ArrayList<>();
            teacher.editList(list);
            assertEquals(list, teacher.getPriorityList());
        } catch (Exception exception) {
            fail(exception);
        }
    }

    @Test
    void editListWithNullFails() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            teacher.editList(null);
        });
        assertEquals(exception.getMessage(), "Input list can't be null");
    }

    @Test
    void editListwithListTooBigFails() {
        ArrayList<UserId> list = new ArrayList<>();
        list.add(new UserId((long) 3));
        list.add(new UserId((long) 4));
        list.add(new UserId((long) 5));
        list.add(new UserId((long) 6));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            teacher.editList(list);
        });
        assertEquals(exception.getMessage(), "Input list is larger than specified capacity");
    }

    @Test
    void setCapacityBiggerThanListSizePasses() {
        try {
            teacher.setCapacity(4);
            assertEquals(4, teacher.getCapacity());
        }
        catch (Exception exception) {
            fail(exception);
        }
    }

    @Test
    void setCapacitySmallerThanListSizeFails() {
        Exception exception = assertThrows(CapacityTooSmallException.class, () -> {
            ArrayList<UserId> list = new ArrayList<>();
            list.add(new UserId((long) 3));
            list.add(new UserId((long) 4));
            list.add(new UserId((long) 5));
            teacher.editList(list);
            teacher.setCapacity(2);
        });
        assertEquals(exception.getMessage(), "Capacity Too Small");
    }

    @Test
    void setCapacityNullFails() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            teacher.setCapacity(null);
        });
        assertEquals(exception.getMessage(), "Capacity can't be null"); 
    }

}