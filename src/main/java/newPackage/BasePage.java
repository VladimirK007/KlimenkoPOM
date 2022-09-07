package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {

        return driver.findElement(locator);
    }

    public void click(By locator) {

        getElement(locator).click();
    }

    public void waitForElementVisibility(By locator, int i) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public boolean elementDisplayed(By locator) {

        return getElement(locator).isDisplayed();
    }

    public void sendKeys(By locator, String input) {
        getElement(locator).clear();
        getElement(locator).sendKeys(input);

    }

}
