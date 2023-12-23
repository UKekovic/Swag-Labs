package swaglabs.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swaglabs.pageobjects.PlpPageObjects;
import swaglabs.pageobjects.YourCartPageObject;


public class AddProductToCartFun {


    public static void addToCart(WebDriver driver, WebDriverWait wait) throws InterruptedException {


        //Add product to Cart
        driver.findElement(PlpPageObjects.addToCartButton).click();

        String plpText = driver.findElement(PlpPageObjects.plpProductName).getText();
        Assert.assertEquals(plpText,"Sauce Labs Backpack");


        //Click on Cart Logo
        driver.findElement(PlpPageObjects.cartLogo).click();
        //Check if product is added to Cart
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(YourCartPageObject.yourCartText));

        ///Check text !!!


        String prodText = driver.findElement(PlpPageObjects.productName).getText();
        Assert.assertEquals(prodText, "Sauce Labs Backpack");

        //Click on CheckOut button
        driver.findElement(YourCartPageObject.checkOutButton).click();

    }
}
