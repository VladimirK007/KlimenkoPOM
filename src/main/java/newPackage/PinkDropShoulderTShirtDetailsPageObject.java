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

    @Step("Choose Pink color from the color dropdown")
    public void chooseColor() {
        click(chooseColorDrp);
        click(colorPink);
    }
    @Step("Choose 37 size from the size dropdown")
    public void chooseSize() {
        click(chooseSizeDrp);
        click(size37);
    }

    @Step("Select 3 in the QTY selector")
    public void qtyInput(String input) {
        click(qtyInput);
        sendKeys(qtyInput, input);
    }

    @Step("Click on the Add To Cart button")
    public void addToCart() {
        click(addToCartBtn);
    }

    @Step("Click on the View Cart button")
    public void viewCart() {
        click(viewCartBtn);
    }

}
