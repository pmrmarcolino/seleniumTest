package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome (){
        System.setProperty("webdriver.gecko.driver","/home/tqi_llamounier/Desktop/driver/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.magazineluiza.com.br/");
        return driver;
    }
}
