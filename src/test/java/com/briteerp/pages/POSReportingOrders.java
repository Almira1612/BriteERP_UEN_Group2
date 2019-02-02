package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POSReportingOrders {

    public POSReportingOrders(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-bar-chart o_cp_switch_graph active']")
    WebElement graphElement;

    public static @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-table o_cp_switch_pivot']")
    WebElement pivotElement;

    public static @FindBy(xpath = "//div[@class='o_graph']")
    WebElement graphImageElement;

    public static @FindBy(xpath = "//div[@class='o_view_manager_content']")
    WebElement pivotImageElement;

    static  public String currentTitle = "Orders Analysis - Odoo";


}
