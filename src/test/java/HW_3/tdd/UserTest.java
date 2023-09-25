package HW_3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {
    private User user1;

    @BeforeEach
    void setUp() {
        user1 = new User("Ivan", "123456", false);
    }

    @Test
    void test_positive_authenticate() {
        assertTrue(user1.authenticate("Ivan", "123456"));
        assertTrue(user1.isAuthenticate);
    }

    @Test
    void test_negative_authenticate_invalid_name() {
        assertFalse(user1.authenticate("Ivanov", "123456"));
        assertFalse(user1.isAuthenticate);

}
    @Test
    void test_negative_authenticate_invalid_password() {
        assertFalse(user1.authenticate("Ivan", "123457"));
        assertFalse(user1.isAuthenticate);
    }
}