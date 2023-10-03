package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {
    User user;

    @BeforeEach
    void prepareData() {
        user = new User("Roman", "qwerty", true);
    }

    @Test
    void authenticateTrueTest() {
        assertTrue(user.authenticate("Roman", "qwerty"));
    }

    @Test
    void authenticateFalseTest() {
        assertFalse(user.authenticate("Roma", "qwerty"));
    }


    @Test
    void logoutTest() {
        user.authenticate("Roman", "qwerty");
        user.logout();
        assertFalse(user.isAuthenticate);
    }
}