import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PackagePage extends BasePage {

    private final By tokyoTalkiesToFav = By.xpath("//a[@data-product-id='704']");
    private final By myWishlistMenuButton = By.xpath("//a[contains(.,\"My Wishlist\")]");
    private final By prodAddedToWishlistMessage = By.xpath("//div[@id='yith-wcwl-message']");
    private final By wishListPageForm = By.xpath("//form[contains(.,\"Tokyo Talkies\")]");


    public PackagePage(WebDriver driver) {

        super(driver);
    }

    public void toFav() {

        click(tokyoTalkiesToFav);

    }

    public void prodAddedToWishlistWait() {

        waitForElementVisibility(prodAddedToWishlistMessage, 5);

    }

    public void myWishlistMenuButton() {
        click(myWishlistMenuButton);

    }

    public void itemIsDisplayed() {
        elementDisplayed(wishListPageForm);
    }


}
