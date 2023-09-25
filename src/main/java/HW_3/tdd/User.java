package HW_3.tdd;

import java.util.Objects;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return Objects.equals(this.name, name) && Objects.equals(this.password, password);
    }

}