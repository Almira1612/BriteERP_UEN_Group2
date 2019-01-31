package com.briteerp.pages;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {


    @FindBy(id = "login")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passWordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    public void login(){
        emailInput.sendKeys(ConfigurationReader.getProperty("username"));
        passWordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }



}
