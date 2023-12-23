package swaglabs.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swaglabs.pageobjects.HamburgerMenuObjects;
import swaglabs.pageobjects.LogInPageObjects;
import swaglabs.pageobjects.PlpPageObjects;

public class MyAccountFun {
    public static void LogInWithEmptyUserNameField(WebDriver driver) throws InterruptedException {

        //Click on Password field
        driver.findElement(LogInPageObjects.passwordField).click();
        //Insert Password
        driver.findElement(LogInPageObjects.passwordField)
                .sendKeys(LogInPageObjects.validPassword);
        //Click on LogIn Button
        driver.findElement(LogInPageObjects.logInButton).click();


        ///// Check if error message is present
        String errorText = driver.findElement(LogInPageObjects.errorMessage).getText();
        Assert.assertEquals(errorText, "Epic sadface: Username is required");

        Thread.sleep(2000);

    }

    public static void validLogIn(WebDriver driver, WebDriverWait wait) {

        //Click on UserNameField
        driver.findElement(LogInPageObjects.userNameField).click();
        //Insert valid UserName
        driver.findElement(LogInPageObjects.userNameField)
                .sendKeys(LogInPageObjects.validUserName);
        //Click on Password field
        driver.findElement(LogInPageObjects.passwordField)
                .sendKeys(LogInPageObjects.validPassword);
        //Click on LogIn button
        driver.findElement(LogInPageObjects.logInButton).click();

//

        //Check if you are logged in
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PlpPageObjects.textVerification));
    }

    public static void LogOut(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //Click on Hamburger Menu
        driver.findElement(HamburgerMenuObjects.hamburgerMenu).click();
        //Click on "LogOut"
        driver.findElement(HamburgerMenuObjects.logOut).click();

        //Verify if you are Logged Out
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LogInPageObjects.logInButton));

        Thread.sleep(2000);


    }
}
