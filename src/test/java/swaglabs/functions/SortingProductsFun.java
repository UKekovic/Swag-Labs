package swaglabs.functions;

import org.openqa.selenium.WebDriver;
import swaglabs.pageobjects.PlpPageObjects;

public class SortingProductsFun {

    public static void sortingProducts(WebDriver driver) throws InterruptedException {

        //Sorting product low to high
        driver.findElement(PlpPageObjects.sortingMenu).click();
        driver.findElement(PlpPageObjects.lowToHighSorting).click();

        Thread.sleep(2000);

    }

}
