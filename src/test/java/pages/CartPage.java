package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage clickContinue(){
        driver.findElement(By.linkText("continuar")).click();
        return new CartPage(driver);
    }

    public String verifyBag(){
        return driver.findElement(By.className("BasketPage-title")).getText();
    }

    public String verifyProduct(){
        return driver.findElement(By.className("BasketItemProduct-info-sku")).getText();
    }
}
