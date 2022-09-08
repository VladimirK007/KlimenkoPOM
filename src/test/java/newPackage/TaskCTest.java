package newPackage;

import io.qameta.allure.Step;
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

        log("Click on the Pink Drop Shoulder Oversized T Shirt item");
        homePageObject.clickProductPinkDropShoulderOversizedTShirt();

        log("Choose Pink color from the color dropdown");
        pinkDropShoulderTShirtDetailsPageObject.chooseColor();

        log("Choose 37 size from the size dropdown");
        pinkDropShoulderTShirtDetailsPageObject.chooseSize();

        log("Select 3 in the QTY selector");
        pinkDropShoulderTShirtDetailsPageObject.qtyInput("3");

        log("Click on the Add To Cart button");
        pinkDropShoulderTShirtDetailsPageObject.addToCart();

        log("Click on the View Cart button");
        pinkDropShoulderTShirtDetailsPageObject.viewCart();

        log("Pink Drop Shoulder Oversized T Shirt product is present in the Cart");
        Assert.assertTrue(cartPageObject.verifyProductInTheCart());

    }
}
