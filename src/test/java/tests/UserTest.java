package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.PrincipalPage;
import suport.Web;

public class UserTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = Web.createChrome();
    }

    @Test
    public void objectSeachSuccessfully(){
        String idProduct ="215568800";
        String descProduct = "Monitor para PC LG 20M37AA 19,5” LED - Widescreen HD";
              String returnObject = new PrincipalPage(driver).
                setSeach(idProduct).
                clickSeach().
                      clickObject("nm-product-"+idProduct).
                      returnObjectforClassName();

        Assert.assertEquals(descProduct, returnObject);
    }

    @Test
    public void shoppingCart() throws InterruptedException {
        String idProduct ="213488600";
        String typeProduct = "Monitor";

        CartPage cart = new PrincipalPage(driver).
                seachItem(typeProduct).
                clickObject("nm-product-"+idProduct+"").
                clickAddCart().
                clickContinue();
        Assert.assertEquals("Sacola",cart.verifyBag());
        Assert.assertEquals("Código do produto: "+idProduct,cart.verifyProduct());
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
