package seminars.five;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SauceDemoLoginTest {
    @Test
    void sauceLoginTest() {

        // Создайте экземпляр драйвера Chrome
        WebDriver driver = new ChromeDriver();

        // Откройте страницу https://www.saucedemo.com/
        driver.get("https://www.saucedemo.com/");

        // Найдите элементы логина и введите данные для входа
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Отправьте форму логина
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.submit();

        // Проверьте, что на странице отображаются продукты
        WebElement productsLabel = driver.findElement(By.className("title"));

        assertEquals("Products", productsLabel.getText());

        // Закройте браузер
        driver.quit();
    }
}

/*
Задание 1.
Представьте, что вы работаете над разработкой простого приложения для записной книжки,
которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения.
Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

Ответ
Юнит-тест: testAddContact Проверяет функциональность добавления нового контакта в записную книжку.
Юнит-тест: testEditContact Проверяет возможность редактирования данных существующего контакта.
Юнит-тест: testDeleteContact Проверяет функциональность удаления контакта из записной книжки.
Юнит-тест: testGetAllContacts Проверяет, что метод getAllContacts возвращает все контакты из записной книжки.
Юнит-тест: testGetContactByFirstName Проверяет, что метод getContactByFirstName возвращает контакт с заданным именем.
Юнит-тест: testGetContactByLastName Проверяет, что метод getContactByLastName возвращает контакт с заданной фамилией.
Юнит-тест: testGetContactByPhoneNumber Проверяет, что метод getContactByPhoneNumber возвращает контакт с заданным номером телефона.

Интеграционный тест: testAddAndDeleteContact Проверяет взаимодействие между методами добавления и удаления контакта. Проверяет, что после удаления контакта он больше не отображается в записной книжке.
Интеграционный тест: testEditContactDetails Проверяет взаимодействие между методами редактирования контакта. Проверяет, что после редактирования контакт содержит измененные данные.

Сквозной тест: testAddEditDeleteContactFlow Проверяет полный цикл работы с контактом: добавление, редактирование и удаление контакта. Проверяет, что контакт успешно добавляется, редактируется и удаляется без ошибок.



Задание 2.
Ниже список тестовых сценариев.
Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.

Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.
Ответ: юнит-тест (проверка одного метода)

Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.
Ответ: интеграционный тест (проверка сразу пользовательского интерфейса и списка контактов)

Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.
Ответ: сквозной тест (Проверка полного цикла работы с контактом)

 */
