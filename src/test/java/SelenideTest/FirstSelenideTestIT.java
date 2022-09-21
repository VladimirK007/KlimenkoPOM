package SelenideTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FirstSelenideTestIT {

    @Test
    public void buildYourComputer() {
        open("https://demo.nopcommerce.com/build-your-own-computer");
        $(By.xpath("//select[@id='product_attribute_1']")).
                selectOption("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");

        $(By.xpath("//select[@id='product_attribute_2']")).
                selectOption("8GB [+$60.00]");

        $(By.xpath("//input[@id='product_attribute_3_6']")).click();

        $(By.xpath("//input[@id='product_attribute_4_8']")).click();
        $(By.xpath("//button[@id='add-to-cart-button-1']")).click();
        $(By.xpath("//p[@class='content']" +
                "[contains(.,'The product has been added to your ')]")).should(disappear);
        $(By.xpath("//span[@class='cart-label']")).click();
        $(By.xpath("//td[@class='product']//div[@class='attributes'][contains(.,'RAM: 8GB')]")).shouldBe(visible);
        $(By.xpath("//td[@class='product']//div[@class='attributes'][contains(.,'HDD: 320 GB')]")).shouldBe(visible);

    }

}