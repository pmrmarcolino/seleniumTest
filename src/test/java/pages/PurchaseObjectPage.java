package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseObjectPage extends BasePage {
    public PurchaseObjectPage(WebDriver driver) {
        super(driver);
    }

    public CartPage clickAddCart(){
        driver.findElement(By.xpath("//*[text()='Adicionar à sacola']")).click();
        return new CartPage(driver);
    }

    public String returnObjectforClassName(){
        return driver.findElement(By.className("header-product__title")).getText();
    }
}
