package swaglabs.pageobjects;

import org.openqa.selenium.By;

public class LogInPageObjects {

    public static By userNameField = By.id("user-name");

    public static String validUserName = "standard_user";

    public static By passwordField = By.id("password");

    public static String validPassword = ("secret_sauce");

    public static By logInButton = By.id("login-button");

    public static By errorMessage = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]");

}
