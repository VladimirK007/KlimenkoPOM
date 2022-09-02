package Task1;

import org.testng.annotations.Test;

public class TaskBTest extends BaseTest {

    @Test
    public void firstTest() {
        webDriver.get("https://shop.demoqa.com/");

        PackagePage packagePage = new PackagePage(webDriver);

        packagePage.addTokyoTalkiesToFav();
        packagePage.waitProdAddedConfirmationMessage();
        packagePage.clickMyWishlistMenuButton();
        packagePage.verifyTokyoTalkiesInTheFavorites();

    }
}
