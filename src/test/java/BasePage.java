import org.testng.annotations.Test;

public class BasePage extends BaseTest {

    @Test
    public void firstTest(){
        webDriver.get("https://shop.demoqa.com/");

        PackagePage packagePage = new PackagePage(webDriver);
        packagePage.toFav();
        packagePage.myWishlist();


    }
}
