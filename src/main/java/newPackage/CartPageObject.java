package newPackage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageObject extends BasePage {

    private final By productInCart = By.xpath("//a[contains(.,'pink drop shoulder oversized t shirt - Pink')]");

    public CartPageObject(WebDriver driver) {
        super(driver);
    }

    public boolean verifyProductInTheCart() {

          return elementDisplayed(productInCart);
    }

}
