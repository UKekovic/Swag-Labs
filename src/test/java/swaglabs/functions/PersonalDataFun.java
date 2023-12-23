package swaglabs.functions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swaglabs.pageobjects.PaymentInformationPageObjects;
import swaglabs.pageobjects.PersonalDataPageObjets;


public class PersonalDataFun {



    public static void PersonalData(WebDriver driver, WebDriverWait wait) {


        //Click on FirstName Field
        driver.findElement(PersonalDataPageObjets.firstNameField).click();
        //Insert First Name
        driver.findElement(PersonalDataPageObjets.firstNameField)
                .sendKeys(PersonalDataPageObjets.firstName);
        //Click on LastName field
        driver.findElement(PersonalDataPageObjets.lastNameField).click();
        //Insert Last Name
        driver.findElement(PersonalDataPageObjets.lastNameField)
                .sendKeys(PersonalDataPageObjets.lastName);
        //Click on ZipCode field
        driver.findElement(PersonalDataPageObjets.ZipCodeField).click();
        //Insert ZipCode
        driver.findElement(PersonalDataPageObjets.ZipCodeField)
                .sendKeys(PersonalDataPageObjets.ZipCode);
        //Click "Continue" button
        driver.findElement(PersonalDataPageObjets.continueButton).click();
        //Check if you go to PaymentInformation Tab
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PaymentInformationPageObjects.verifyText));


    }
}
