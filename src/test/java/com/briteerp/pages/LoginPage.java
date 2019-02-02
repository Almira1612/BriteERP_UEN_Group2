package com.briteerp.pages;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    static  public @FindBy(id = "login")
     WebElement emailInput;

    static @FindBy(id = "password")
     WebElement passWordInput;

    static  public @FindBy(xpath = "//button[@type='submit']")
     WebElement loginButton;

    static public String currentTitle ="Login | Website localhost";

    public static void login() {
        emailInput.sendKeys(ConfigurationReader.getProperty("username"));
        passWordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }


}
