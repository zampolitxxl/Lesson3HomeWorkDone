import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task3Test {

    @Test
    public  void unloginUserTrue(){
        //Добавляем 1 пользователя
        User user1 = new User( "login","123456", false);
        user1.auth("login","123456");
        UserRepository repository= new UserRepository();
        repository.addUser(user1);
        //Добавляем 2 пользователя админа
        User user2 = new User( "login2","123456", true);
        user2.auth("login","123456");
        repository.addUser(user2);
        //разлогиниваем всех
        repository.unLogin();

        assertFalse(user1.isAuth);

    }

    @Test
    public  void unloginAdminFalse(){
        //Добавляем 1 пользователя
        User user1 = new User( "login","123456", false);
        user1.auth("login","123456");
        UserRepository repository= new UserRepository();
        repository.addUser(user1);
        //Добавляем 2 пользователя админа
        User user2 = new User( "login2","123456", true);
        user2.auth("login2","123456");
        repository.addUser(user2);
        //разлогиниваем всех
        repository.unLogin();

        assertTrue(user2.isAuth);

    }
}
