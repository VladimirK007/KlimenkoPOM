package newPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskCTest extends BaseTest {

    @Test
    public void addProductToCart() {
        webDriver.get("https://shop.demoqa.com/");

        HomePageObject homePageObject = new HomePageObject(webDriver);
        PinkDropShoulderTShirtDetailsPageObject pinkDropShoulderTShirtDetailsPageObject =
                new PinkDropShoulderTShirtDetailsPageObject(webDriver);
        CartPageObject cartPageObject = new CartPageObject(webDriver);

        homePageObject.clickProductPinkDropShoulderOversizedTShirt();
        pinkDropShoulderTShirtDetailsPageObject.chooseColor();
        pinkDropShoulderTShirtDetailsPageObject.chooseSize();
        pinkDropShoulderTShirtDetailsPageObject.qtyInput("3");
        pinkDropShoulderTShirtDetailsPageObject.addToCart();
        pinkDropShoulderTShirtDetailsPageObject.viewCart();
        Assert.assertTrue(cartPageObject.verifyProductInTheCart());

    }
}
