import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PackagePage extends BasePage {

    private final By addTokyoTalkiesToFavBtn = By.xpath("//a[@data-product-id='704']");
    private final By myWishlistMenuButton = By.xpath("//a[contains(.,\"My Wishlist\")]");
    private final By prodAddedToWishlistMessage = By.xpath("//div[@id='yith-wcwl-message']");
    private final By wishListContainsTokyoTalkies = By.xpath("//form[contains(.,\"Tokyo Talkies\")]");


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
    private final By viewCartBtn = By.xpath("//i[@class='icon_bag_alt']");
    private final By productInCart = By.xpath("//a[contains(.,'pink drop shoulder oversized t shirt - Pink')]");

    public PackagePage(WebDriver driver) {

        super(driver);
    }

    public void addTokyoTalkiesToFav() {

        click(addTokyoTalkiesToFavBtn);
    }

    public void waitProdAddedConfirmationMessage() {

        waitForElementVisibility(prodAddedToWishlistMessage, 5);
    }

    public void clickMyWishlistMenuButton() {
        click(myWishlistMenuButton);
    }

    public void verifyTokyoTalkiesInTheFavorites() {

        elementDisplayed(wishListContainsTokyoTalkies);
    }

    public void clickProductPinkDropShoulderOversizedTShirt() {
        click(pinkDropShoulderOversizedTShirt);
    }

    public void chooseColor() {
        click(chooseColorDrp);
        click(colorPink);
    }

    public void chooseSize() {
        click(chooseSizeDrp);
        click(size37);
    }

    public void qtyInput(String input) {
        click(qtyInput);
        sendKeys(qtyInput, input);
    }

    public void addToCart() {
        click(addToCartBtn);
    }

    public void viewCart() {
        click(viewCartBtn);
    }

    public void verifyProductInTheCart() {
        elementDisplayed(productInCart);
    }

}
