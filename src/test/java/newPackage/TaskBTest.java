package newPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskBTest extends BaseTest {

    @Test
    public void addProductToFav() {
        webDriver.get("https://shop.demoqa.com/");

        HomePageObject homePageObject = new HomePageObject(webDriver);
        WishlistPageObject wishlistPageObject = new WishlistPageObject(webDriver);

        homePageObject.addTokyoTalkiesToFav();
        homePageObject.waitProdAddedConfirmationMessage();
        homePageObject.clickMyWishlistMenuButton();
        Assert.assertTrue(wishlistPageObject.verifyTokyoTalkiesInTheFavorites());


    }
}
