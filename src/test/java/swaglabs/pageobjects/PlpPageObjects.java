package swaglabs.pageobjects;

import org.openqa.selenium.By;

public class PlpPageObjects {

    public static By textVerification = By.xpath("//body[1]/div[1]");

    public static By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    public static By plpProductName = By.className("inventory_item_name");

    public static By productName = By.className("inventory_item_name");

    public static By cartLogo = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]");

    public static By sortingMenu = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/select[1]");
     public static By lowToHighSorting = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/select[1]/option[3]");


}
