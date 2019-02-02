package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationPosCategory {
    public ConfigurationPosCategory(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    public static @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[4]/li[2]/a/span")
    WebElement Productclick;

    public static @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[4]/li[2]/ul/li/a/span" )
    WebElement Poscategory;

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]")
    WebElement anycategory;

    public static @FindBy (xpath ="/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[2]")
    WebElement kanbanviewOptionElement;




}
