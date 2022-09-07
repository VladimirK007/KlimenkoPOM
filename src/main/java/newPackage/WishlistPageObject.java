package newPackage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPageObject extends BasePage {

    private final By wishListContainsTokyoTalkies = By.xpath("//form[contains(.,\"Tokyo Talkies\")]");

    public WishlistPageObject(WebDriver driver) {
        super(driver);
    }

    @Step("Tokyo Talkies is displayed in the Wishlist")
    public boolean verifyTokyoTalkiesInTheFavorites() {

        return elementDisplayed(wishListContainsTokyoTalkies);
    }
}


