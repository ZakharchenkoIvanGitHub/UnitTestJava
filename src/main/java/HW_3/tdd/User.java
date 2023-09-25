package HW_3.tdd;

import java.util.Objects;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (Objects.equals(this.name, name) && Objects.equals(this.password, password)) {
            this.isAuthenticate = true;
            return true;
        }
        return false;
    }


}