package com.briteerp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

        @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li[6]//a[1]")
        public WebElement pointOfSaleElement;

        @FindBy(xpath = "//div[@class='oe_secondary_menu_section active']//span[@class='oe_menu_text'][contains(text(),'Dashboard')]")
        public WebElement dashBoardElement;

        @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[8]")
        public WebElement ordersOrdersElement;

        @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[9]")
        public WebElement ordersSessionsElement;

        @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[10]")
        public WebElement catalogProductsElement;

        @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[11]")
        public WebElement catalogPriceListElement;

        @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[12]")
        public WebElement reportingOrdersElement;

        @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[13]")
        public WebElement reportingSalesDetailsElement;

        @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[14]")
        public WebElement configPosElement;

        @FindBy(xpath = "//span[contains(text(),'PoS Categories')]")
        public WebElement POSCategoriesElement;




}
