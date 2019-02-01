package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POSHomePage {

    public POSHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    static public @FindBy(xpath = "//div[@class='oe_secondary_menu_section active']//span[@class='oe_menu_text'][contains(text(),'Dashboard')]")
    WebElement dashBoardElement;

    static public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[8]")
    WebElement ordersOrdersElement;

    static public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[9]")
    WebElement ordersSessionsElement;

    static public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[10]")
    WebElement catalogProductsElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[11]")
     WebElement catalogPriceListElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[12]")
     WebElement reportingOrdersElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[13]")
     WebElement reportingSalesDetailsElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[14]")
     WebElement configPosElement;

    static  public  @FindBy(xpath = "//span[contains(text(),'PoS Categories')]")
     WebElement POSCategoriesElement;




}
