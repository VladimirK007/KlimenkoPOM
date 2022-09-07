package newPackage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {

    private final By addTokyoTalkiesToFavBtn = By.xpath("//div[@data-fragment-ref=\"704\"]");
    private final By myWishlistMenuButton = By.xpath("//a[contains(.,\"My Wishlist\")]");
    private final By prodAddedToWishlistMessage = By.xpath("//div[@id='yith-wcwl-message']");


    private final By pinkDropShoulderOversizedTShirt = By.xpath("//div[@class='noo-product-item noo-product-sm-4 " +
            "not_featured post-1497 product type-product status-publish has-post-thumbnail product_cat-t-shirt " +
            "product_tag-t-shirt product_tag-women has-featured first instock shipping-taxable " +
            "purchasable product-type-variable']");

    public HomePageObject(WebDriver driver) {
        super(driver);
    }

    @Step("Add Tokyo Talkies to Favorites")
    public void addTokyoTalkiesToFav() {

        click(addTokyoTalkiesToFavBtn);
    }

    @Step("Product Added confirmation message is displayed")
    public void waitProdAddedConfirmationMessage() {

        waitForElementVisibility(prodAddedToWishlistMessage, 5);
    }

    @Step("Click My Wishlist menu button")
    public void clickMyWishlistMenuButton() {
        click(myWishlistMenuButton);
    }

    @Step("Click on the Pink Drop Shoulder Oversized T Shirt item")
    public void clickProductPinkDropShoulderOversizedTShirt() {
        click(pinkDropShoulderOversizedTShirt);
    }
}
