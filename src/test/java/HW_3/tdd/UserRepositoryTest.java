package HW_3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserRepositoryTest {

    private User user1;
    private User user2;
    private User user3;
    private User user4;
    private UserRepository repository;

    @BeforeEach
    void setUp() {
        user1 = new User("Ivan", "123456", true);
        user2 = new User("Oleg", "7890", false);
        user3 = new User("Oleg", "7890", false);
        user4 = new User("Igor", "7744", false);
        repository = new UserRepository();

    }

    @Test
    void test_positive_addUser() {
        repository.addUser(user1);
        repository.addUser(user2);
        assertTrue(repository.findByName("Ivan"));
        assertTrue(repository.findByName("Oleg"));
    }

    @Test
    void test_negative_addUser() {
        repository.addUser(user2);
        assertThatThrownBy(() -> repository.addUser(user3))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Пользователь с таким именем существует");
    }

    @Test
    void test_logout(){
        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user4);
        user1.authenticate("Ivan", "123456");
        user2.authenticate("Oleg", "7890");
        user3.authenticate("Igor", "7744");
        repository.logout();
        assertTrue(repository.data.get(0).isAuthenticate);
        assertFalse(repository.data.get(1).isAuthenticate);
        assertFalse(repository.data.get(2).isAuthenticate);


    }



}