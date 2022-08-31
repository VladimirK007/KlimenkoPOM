import org.testng.annotations.Test;

public class TaskCTest extends BaseTest {

    @Test
    public void firstTest() {
        webDriver.get("https://shop.demoqa.com/");

        PackagePage packagePage = new PackagePage(webDriver);
        packagePage.chooseProductPinkDropShoulderOversizedTShirt();
        packagePage.chooseColor();
        packagePage.chooseSize();
        packagePage.qtyInput("3");
        packagePage.addToCart();
        packagePage.viewCart();
        packagePage.pinkDropShoulderInTheCart();

    }
}
