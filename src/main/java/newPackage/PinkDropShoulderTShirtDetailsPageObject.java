package newPackage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PinkDropShoulderTShirtDetailsPageObject extends BasePage {

    private final By chooseColorDrp = By.xpath("//select[@id='pa_color']");
    private final By colorPink = By.xpath("//option[@value='pink']");
    private final By chooseSizeDrp = By.xpath("//select[@id='pa_size']");
    private final By size37 = By.xpath("//option[@value='37']");
    private final By qtyInput = By.xpath("//input[@name='quantity']");
    private final By addToCartBtn = By.xpath("//button[text()='Add to cart']");
    private final By viewCartBtn = By.xpath("//a[@class='button wc-forward']");

    public PinkDropShoulderTShirtDetailsPageObject(WebDriver driver) {
        super(driver);
    }

    public void chooseColor() {
        click(chooseColorDrp);
        click(colorPink);
    }
    public void chooseSize() {
        click(chooseSizeDrp);
        click(size37);
    }

    public void qtyInput(String input) {
        click(qtyInput);
        sendKeys(qtyInput, input);
    }

    public void addToCart() {
        click(addToCartBtn);
    }

    public void viewCart() {
        click(viewCartBtn);
    }

}
