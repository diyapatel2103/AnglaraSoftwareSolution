package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    public WebDriver driver;

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openApp() {
        driver.get("https://www.saucedemo.com");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}