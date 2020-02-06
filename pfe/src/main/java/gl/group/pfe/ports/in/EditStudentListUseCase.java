package gl.group.pfe.ports.in;

import java.util.List;

import gl.group.pfe.domain.User.UserId;
import lombok.Value;

/**
 * EditStudentListUseCase
 */
public interface EditStudentListUseCase {

    void editList(EditStudentListCommand command) throws Exception;

    @Value
    public class EditStudentListCommand {
        UserId id;
        List<UserId> list;
    }

}