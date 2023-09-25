package HW_3.tdd;


import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (!findByName(user.name)) {
            data.add(user);
        } else throw new RuntimeException("Пользователь с таким именем существует");
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logout() {
        for (User user : data) {
            if (!user.isAdmin && user.isAuthenticate) {
                user.isAuthenticate = false;
            }
        }

    }

}
