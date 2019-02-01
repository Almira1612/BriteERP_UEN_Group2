package com.briteerp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {




    static public @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][contains(text(),'Point of Sale')]")
    WebElement pointOfSaleElement;


    static public String currentTitle = "#Inbox - Odoo";
}
