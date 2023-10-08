package seminars.five;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
// 1. Открывает главную страницу Google.
//2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//3. В результатах поиска ищет ссылку на официальный сайт Selenium
//(https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
//результатов поиска.

public class SeleniumTest {

    @Test
    public void checkBrowserTest() {

        // Установите путь к драйверу Chrome
        // System.setProperty("webdriver.edge.driver", "C:/Users/Artur Kalimullin/IdeaProjects/Testing/msedgedriver.exe");

        boolean a = false;

        // Создайте экземпляр драйвера Chrome
        WebDriver driver = new ChromeDriver(); // new EdgeDriver();

        // Откройте главную страницу Google
        driver.get("http://www.google.com/");

        // Найдите элемент поисковой строки и введите "Selenium"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        searchBox.submit();

        // Проверьте, что ссылка на официальный сайт Selenium присутствует в результатах поиска
        List<WebElement> seleniumLink = driver.findElements(By.cssSelector("div"));
        for (WebElement webElement : seleniumLink) {
            if (webElement.getText().contains("https://www.selenium.dev")) {
                a = true;
                break;
            }
        }
        assertTrue(a);

        // Закройте браузер
        driver.quit();
    }
}

