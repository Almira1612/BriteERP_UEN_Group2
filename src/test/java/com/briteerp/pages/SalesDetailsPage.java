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


}
