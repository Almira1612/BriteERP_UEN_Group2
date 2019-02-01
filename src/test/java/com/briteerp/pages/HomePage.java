package com.briteerp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {




    static public @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li[6]//a[1]")
    WebElement pointOfSaleElement;


    static public String currentTitle = "#Inbox - Odoo";
}
