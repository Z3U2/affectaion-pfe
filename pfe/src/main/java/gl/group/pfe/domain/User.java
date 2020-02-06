package gl.group.pfe.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

/**
 * User
 */
@RequiredArgsConstructor
public abstract class User {

    @Getter private final UserId id;
    @Getter private final String firstName;
    @Getter private final String lastName;


    /**
     * UserId
     */
    @Value
    public static class UserId {

        Long id;

    }
    
}