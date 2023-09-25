package HW_3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserRepositoryTest {

    private User user1;
    private User user2;

    private final UserRepository repository = new UserRepository();
    @BeforeEach
    void setUp() {
        user1 = new User("Ivan", "123456", true);
        user2 = new User("Oleg", "7890", false);
        user1.authenticate("Ivan", "123456");
        user2.authenticate("Igor", "123456");

    }

    @Test
    void test_positive_addUser(){
        repository.addUser(user1);
        assertTrue(repository.findByName("Ivan"));
    }

    @Test
    void test_negative_addUser(){
        repository.addUser(user2);
        assertFalse(repository.findByName("Ivan"));
        assertFalse(repository.findByName("Oleg"));
        assertFalse(repository.findByName("Igor"));

    }


}