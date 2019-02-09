package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesDetailsPage {

    public SalesDetailsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    static public @FindBy(xpath = "//div[@class='modal-content']//button[@class='btn btn-sm btn-primary']")
    WebElement SalesDetailsPage;

    static public @FindBy(xpath = "//*[@id=modal_471]/div/div/div[2]/div/div/div/table[2]/tbody/tr[2]/td/div/div[2]"
                                   + "/table/tbody/tr[5]/td[2]/button")
    WebElement DeleteElement;


    static public @FindBy(xpath = "//*[@id=modal_471]/div/div/div[2]/div/div/div")
    WebElement AfterDeletedPageElement;


    static public @FindBy(xpath = "//*[@id=modal_471]/div/div/div[3]/div/footer/button[1]")
    WebElement PrintElement;


    static public @FindBy(xpath =  "//*[@id=wrapwrap]/main")
    WebElement AfterPrintedPageElement;


    static public @FindBy(xpath =  "//*[@id=o_field_input_58]")
    WebElement StartDate;

    static public @FindBy(xpath =  "//*[@id=o_field_input_58]")
    WebElement StartTime;

    static public @FindBy(xpath =  "//*[@id=o_field_input_59]")
    WebElement EndDate ;

    static public @FindBy(xpath =  "//*[@id=o_field_input_59]")
    WebElement EndTime;

    static public @FindBy(xpath =  "//*[@id=o_field_input_59]")
    WebElement ClosePicker;

    static public @FindBy(xpath =  "//*[@id=modal_61]/div/div/div[2]/div/div/div/table[2]/tbody/tr[" +
                                      "2]/td/div/div[2]/table/tbody/tr[10]/td/a")
    WebElement AddAnItem;

    static public @FindBy(xpath =  "//*[@id=/modal_63/]/div/div/div[3]/button[2]/span")
    WebElement Create;

    static public @FindBy(xpath =  "//*[@id=/o_field_input_83/]")
    WebElement PointOfSaleNameBox;

    static public @FindBy(xpath =  "//*[@id=/o_field_input_142/]")
    WebElement SelectOperationType;

    static public @FindBy(xpath =  "//*[@id=/ui-id-29/]/a")
    WebElement  DeliveryOrders;

    static public @FindBy(xpath =  "//*[@id=/modal_318/]/div/div/div[3]/button[1]/span")
    WebElement SaveAndClose;

    static public @FindBy(xpath =  "//*[@id=/modal_318/]/div/div/div[3]/button[2]/span")
    WebElement SaveAndNew;

    static public @FindBy(xpath =  "//*[@id=/modal_61/]/div/div/div[2]/div/div/div/table[2]" +
                                       "/tbody/tr[2]/td/div/div[2]/table/tbody/tr[10]/td[1]")
    WebElement Zara;

    static public @FindBy(xpath =  "//*[@id=/modal_402/]/div/div/div[3]/button[1]/span")
    WebElement SaveAfterEdit;






}
