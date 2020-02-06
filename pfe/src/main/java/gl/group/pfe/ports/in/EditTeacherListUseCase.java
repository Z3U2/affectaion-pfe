package gl.group.pfe.ports.in;

import java.util.List;

import gl.group.pfe.domain.User.UserId;
import lombok.Value;

/**
 * EditTeacherListUseCase
 */
public interface EditTeacherListUseCase {

    void editList(EditTeacherListCommand command) throws Exception;

    @Value
    public class EditTeacherListCommand {
        UserId id;
        List<UserId> list;
    }

}