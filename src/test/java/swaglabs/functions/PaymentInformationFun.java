package swaglabs.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swaglabs.pageobjects.FinishPagePageObjects;
import swaglabs.pageobjects.PaymentInformationPageObjects;

public class PaymentInformationFun {

    public static void PaymentInformation(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //Click on Finish Button
        driver.findElement(PaymentInformationPageObjects.finishButton).click();
        //Verify if you are on Finish Page
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FinishPagePageObjects.completeCheckoutText));
        //Verify if is right text
        String finishText = driver.findElement(FinishPagePageObjects.completeCheckoutText).getText();
        Assert.assertEquals(finishText, "Thank you for your order!");
        Thread.sleep(3000);

    }

}
