package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class POSReportingOrders {

    public POSReportingOrders(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    static  public String currentTitle = "Orders Analysis - Odoo";


}
