package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrincipalPage extends BasePage{

    public PrincipalPage(WebDriver driver){
        super(driver);
    }

    public PrincipalPage setSeach(String seach){
        driver.findElement(By.id("inpHeaderSearch")).sendKeys(seach);
        return this;
    }

    public PurchasingObjectPage clickSeach(){
        driver.findElement(By.id("btnHeaderSearch")).click();
        return new PurchasingObjectPage(driver);
    }

    public PurchasingObjectPage seachItem(String seach){
        driver.findElement(By.id("inpHeaderSearch")).sendKeys(seach);
        driver.findElement(By.id("btnHeaderSearch")).click();
        return new PurchasingObjectPage(driver);
    }
}
