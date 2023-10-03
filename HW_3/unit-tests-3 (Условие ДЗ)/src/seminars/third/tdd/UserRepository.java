package seminars.third.tdd;

import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей

    // Добавьте класс UserRepository для управления пользователями. В этот класс должен быть включен метод
    //addUser, который добавляет пользователя в систему, если он прошел аутентификацию. Покройте тестами новую
    //функциональность

    List<User> data = new ArrayList<>();

    public void addUser(User user) throws ExportException {
        if (user.isAuthenticate) {
            data.add(user);
        } else {
            throw new ExportException("Can't add user");
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutUser() {
        for (User user : data) {
            if (!user.isAdmin) {
                user.logout();
            }
        }
    }

}