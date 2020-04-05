package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasingObjectPage extends BasePage{
    public PurchasingObjectPage(WebDriver driver) {
        super(driver);
    }

    public PurchaseObjectPage clickObject(String object){
        driver.findElement(By.id(object)).click();
        return new PurchaseObjectPage(driver);
    }

}
