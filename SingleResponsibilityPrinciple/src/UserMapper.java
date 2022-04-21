import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserMapper extends ObjectMapper{

    private String userJson;

    public UserMapper(){
    }

    public User readUser(String userJson) throws IOException {
        return readValue(userJson,User.class);
    }

}
