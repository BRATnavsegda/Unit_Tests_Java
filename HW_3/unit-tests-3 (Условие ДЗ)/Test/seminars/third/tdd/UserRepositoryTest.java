package seminars.third.tdd;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import java.rmi.server.ExportException;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository repository;
    User user;

    @BeforeEach
    void prepareData() {
        repository = new UserRepository();
        user = new User("Roman", "qwerty", true);
        user.authenticate("Roman", "qwerty");

    }

    @Test
    void addUserSuccessfullyTest() throws ExportException {
        repository.addUser(user);
        assertThat(repository.data.size()).isEqualTo(1);
    }

    @Test
    void addUserExceptionTest() throws ExportException {
        user.isAuthenticate = false;
        assertThatThrownBy( () -> repository.addUser(user) ).isInstanceOf(ExportException.class);

    }

    @Test
    void findByNameTrueTest() throws ExportException {
        repository.addUser(user);
        assertTrue(repository.findByName("Roman"));
    }
    @Test
    void findByNameFalseTest() throws ExportException {
        repository.addUser(user);
        assertFalse(repository.findByName("Roma"));
    }

    @Test
    void logoutUserTest() throws ExportException {
        repository.addUser(user);
        repository.logoutUser();
        assertThat(repository.data.size()).isEqualTo(1);
    }
}