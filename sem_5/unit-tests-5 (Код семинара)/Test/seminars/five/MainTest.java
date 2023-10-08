package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    //5.1.
    // Создайте два модуля. Первый модуль генерирует список случайных чисел. Второй модуль находит
    //максимальное число в этом списке.
    //Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный
    //тест, который проверяет, что оба модуля работают вместе правильно
    @Test
    void testGenerateNumbers() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        assertThat(randomNumberModule.generateList(5).size()).isEqualTo(5);
    }

    @Test
    void testMaxNumber() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        assertThat(maxNumberModule.takeMaxNumber(Arrays.asList(1, 4, 6, 3, 8))).isEqualTo(8);
    }

    @Test
    void integrationTest() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        ArrayList<Integer> listNumbers = randomNumberModule.generateList(5);
        assertThat(maxNumberModule.takeMaxNumber(listNumbers)).isEqualTo(Collections.max(listNumbers));
    }

//    5.2. У вас есть два класса - UserService и UserRepository. UserService использует UserRepository для
//    получения информации о пользователе. Ваша задача - написать интеграционный тест, который
//    проверяет, что UserService и UserRepository работают вместе должным образом.


    @Test
    void integration2Test() {
        UserRepository repo = new UserRepository();
        UserService service = new UserService(repo);
        int userID = 3;
        String expectedUserName = "User " + userID;
        String actualUserName = service.getUserName(userID);

        assertEquals(expectedUserName, actualUserName);
    }


    //5.3. У вас есть сервис по обработке заказов, состоящий из двух классов: OrderService и
    //PaymentService. Класс OrderService обрабатывает заказы и делает вызовы к
    //PaymentService для обработки платежей. Ваша задача - написать интеграционный тест,
    //который проверяет, что OrderService и PaymentService взаимодействуют корректно

    @Test
    void payTest() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        String orderId = "0012";
        double amount = 500.0;

        assertTrue(orderService.placeOrder(orderId, amount));
//        assertFalse(orderService.placeOrder(orderId, amount));


    }

}