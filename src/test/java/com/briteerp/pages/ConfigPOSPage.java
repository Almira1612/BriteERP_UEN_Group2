package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ConfigPOSPage{
    public ConfigPOSPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static @FindBy(xpath = "//div[@class='o_list_buttons']/button[1]")
    WebElement createElement;

    public static @FindBys(@FindBy(className = "o_data_row"))
    List<WebElement> allPOSList;



}
