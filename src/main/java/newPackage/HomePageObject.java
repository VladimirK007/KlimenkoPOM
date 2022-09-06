package newPackage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {

    private final By addTokyoTalkiesToFavBtn = By.xpath("//a[@data-product-id='704']");
    private final By myWishlistMenuButton = By.xpath("//a[contains(.,\"My Wishlist\")]");
    private final By prodAddedToWishlistMessage = By.xpath("//div[@id='yith-wcwl-message']");


    private final By pinkDropShoulderOversizedTShirt = By.xpath("//div[@class='noo-product-item noo-product-sm-4 " +
            "not_featured post-1497 product type-product status-publish has-post-thumbnail product_cat-t-shirt " +
            "product_tag-t-shirt product_tag-women has-featured first instock shipping-taxable " +
            "purchasable product-type-variable']");
    private final By chooseColorDrp = By.xpath("//select[@id='pa_color']");
    private final By colorPink = By.xpath("//option[@value='pink']");
    private final By chooseSizeDrp = By.xpath("//select[@id='pa_size']");
    private final By size37 = By.xpath("//option[@value='37']");
    private final By qtyInput = By.xpath("//input[@name='quantity']");
    private final By addToCartBtn = By.xpath("//button[text()='Add to cart']");
    private final By viewCartBtn = By.xpath("//a[@class='button wc-forward']");
    private final By productInCart = By.xpath("//a[contains(.,'pink drop shoulder oversized t shirt - Pink')]");

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
