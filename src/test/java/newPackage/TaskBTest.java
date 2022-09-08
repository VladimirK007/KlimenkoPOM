package newPackage;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskBTest extends BaseTest {

    @Test
    public void addProductToFav() {
        webDriver.get("https://shop.demoqa.com/");

        HomePageObject homePageObject = new HomePageObject(webDriver);
        WishlistPageObject wishlistPageObject = new WishlistPageObject(webDriver);

        homePageObject.addTokyoTalkiesToFav();
        log("Add Tokyo Talkies to Favorites");


        homePageObject.waitProdAddedConfirmationMessage();
        log("Product Added confirmation message is displayed");


        homePageObject.clickMyWishlistMenuButton();
        log("Click My Wishlist menu button");


        Assert.assertTrue(wishlistPageObject.verifyTokyoTalkiesInTheFavorites());
        log("Tokyo Talkies is displayed in the Wishlist");



    }
}
