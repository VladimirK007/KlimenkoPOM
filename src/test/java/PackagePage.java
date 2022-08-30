import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PackagePage {

    private WebDriver driver;



    private final By tokyoTalkiesToFav = By.xpath("//a[@data-product-id='704']");
    private final By myWishlistMenuButton = By.xpath("//a[contains(.,\"My Wishlist\")]");
    private final By wishListPageForm = By.xpath("//form[contains(.,\"Tokyo Talkies\")]");


    public PackagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void toFav(){
        driver.findElement(tokyoTalkiesToFav).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement productAddedMessage;
        productAddedMessage = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//div[@id='yith-wcwl-message']")));
        productAddedMessage.isDisplayed();

    }

    public void myWishlist(){
        driver.findElement(myWishlistMenuButton).click();
        driver.findElement(wishListPageForm).isDisplayed();
    }


}
