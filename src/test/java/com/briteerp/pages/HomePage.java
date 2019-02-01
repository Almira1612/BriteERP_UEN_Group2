package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


   public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




   public static  @FindBy(xpath = "//a[@href='/web#menu_id=484&action=']")
    WebElement pointOfSaleElement;



    static public String currentTitle = "#Inbox - Odoo";
}
