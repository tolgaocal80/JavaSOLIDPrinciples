import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    // This class must only handle creating users not checking if they are valid, this only violates Single Responsibility Principle.
    // ObjectMapper can also be in a different class, violates SRP.
    // Rather than storing user directly, we can create a class called UserPersistenceService to ensure we can add more storing classes in the future.

    //Store used by controller
    private UserPersistenceService userPersistenceService = new UserPersistenceService();
    // User mapping controlled by separate class
    private final UserMapper userMapper = new UserMapper();
    private final UserValidator userValidator = new UserValidator();

    //Create a new user
    public String createUser(String userJson) throws IOException {

        User user = userMapper.readUser(userJson);

        boolean validation = userValidator.validate(user);

        if(!validation) {
            return "ERROR";
        }

        userPersistenceService.store(user);

        return "SUCCESS";
    }





}