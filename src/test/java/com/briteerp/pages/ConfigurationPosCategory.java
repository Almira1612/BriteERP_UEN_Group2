package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ConfigurationPosCategory {
    public ConfigurationPosCategory(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    public static @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[4]/li[2]/a/span")
    WebElement Productclick;

    public static @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[4]/li[2]/ul/li/a/span" )
    WebElement Poscategory;

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[3]")
    WebElement anycategory;

    public static @FindBy (xpath ="/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[2]")
    WebElement kanbanviewOptionElement;

    public static @FindBy(xpath= "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[1]/div/input" )
    WebElement checkAll;

    public static @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div")
    WebElement checkFirst;

    public static @FindBy (xpath="/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[2]/td[1]/div/input")
    WebElement  checksecond;

    public static @FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    WebElement ActionBox;

    public static @FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[2]/a")
    WebElement deleteOption;

    public static @FindBy (xpath= "/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement conformDelete;

    public static @FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1] ")
    WebElement formtoWritenames;

    public static @FindBy(xpath= "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement createButton;

    public static @FindBy(xpath= "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement fullName;

    public static @FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    WebElement saveButton;

    public static @FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]")
    WebElement actionButton;

    public static @FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/ul/li[2]/a")
    WebElement DuplicateButton;

    public static @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    WebElement AddAttachment;

    public static @FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li/div/form/input[3]")
    WebElement AddbuttonforAttach;





}
