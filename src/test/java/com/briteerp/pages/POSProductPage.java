package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.XpiDriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.security.cert.X509Certificate;

public class POSProductPage {
    public POSProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div/span[2]/button[2]")
            WebElement nexButtonIcon;

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div/span[2]/button[1]")
            WebElement backButtonIcon;

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div/span[1]/span[1]")
            WebElement PageValue;

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[2]")
            WebElement listButtonIcon;

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[1]")
            WebElement canbanButtonIcon;

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[3]")
    WebElement displayInternalRefrence;

}
