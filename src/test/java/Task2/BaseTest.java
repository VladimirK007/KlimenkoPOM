package Task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    protected WebDriver webDriver;

    @BeforeMethod
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @AfterMethod
    public void closeDriver() {
        webDriver.quit();
    }
}
