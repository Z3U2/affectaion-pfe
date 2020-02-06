package gl.group.pfe.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gl.group.pfe.domain.User.UserId;

/**
 * StudentTest
 */
public class StudentTest {

    private Student student;

    @BeforeEach
    void initStudent() {
        UserId id = new UserId((long) 1);
        student = Student.makeInstance(id, "Mohammed Ilyass", "Nasr", new ArrayList<UserId>());
    }

    @Test
    void editListWithEmptyListPasses(){
        try {
            ArrayList<UserId> list = new ArrayList<>();
            student.editList(list);
            assertEquals(list, student.getPriorityList());
        } catch (Exception exception) {
            fail(exception);
        }
    }

    @Test
    void editListWithNullFails() {
        IllegalArgumentException exception =  assertThrows(IllegalArgumentException.class, () -> {
            student.editList(null);
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
            student.editList(list);
        });
        assertEquals(exception.getMessage(), "Input list is larger than specified capacity");
    }

    @Test
    void setCapacityFails() {
        UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
            student.setCapacity(0);
        });
        assertEquals(exception.getMessage(), "Student can't set capacity");
    }

}