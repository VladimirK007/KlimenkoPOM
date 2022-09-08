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

        log("Add Tokyo Talkies to Favorites");
        homePageObject.addTokyoTalkiesToFav();

        log("Product Added confirmation message is displayed");
        homePageObject.waitProdAddedConfirmationMessage();

        log("Click My Wishlist menu button");
        homePageObject.clickMyWishlistMenuButton();

        log("Tokyo Talkies is displayed in the Wishlist");
        Assert.assertTrue(wishlistPageObject.verifyTokyoTalkiesInTheFavorites());


    }
}
