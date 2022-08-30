import org.testng.annotations.Test;

public class TaskBTest extends BaseTest {

    @Test
    public void firstTest() {
        webDriver.get("https://shop.demoqa.com/");

        PackagePage packagePage = new PackagePage(webDriver);
        packagePage.toFav();
        packagePage.prodAddedToWishlistWait();
        packagePage.myWishlistMenuButton();
        packagePage.itemIsDisplayed();

    }
}
