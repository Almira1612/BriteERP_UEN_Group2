package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    public OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[2]")
    WebElement kanbanButton;

    public static @FindBy(xpath = "//button[contains(text(),'Create')]")
    WebElement creatButton;

    public static @FindBy(xpath = "//tr[@class='o_data_row']//td[@class='o_data_cell o_readonly_modifier'][contains(text(),'Order 00005-008-0015')]")
    WebElement Prodect0006;

    public static  @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    WebElement ReturnProduct;

    public static @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[16]/td[2]")
    WebElement Prodect0001;

    public static @FindBy(xpath = "//button[contains(text(),'Action')]")
    WebElement ActionButton;

    public static @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/ul[1]/li[1]/a[1]")
    WebElement DeleteButton;

    public static @FindBy(xpath = "//span[contains(text(),'Ok')]")
    WebElement OkButton;

    public static @FindBy(xpath = "//a[contains(text(),'Orders')]")
    WebElement OrderButton;

    public static @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/span[2]/button[1]")
    WebElement PreviousIcon;

    public static @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/span[2]/button[2]")
    WebElement NextIcon;

    public static @FindBy(xpath = "//button[@class='btn btn-sm oe_stat_button']")
    WebElement InvoiceButton;

    public static @FindBy(xpath = "(//div[@class='o_input_dropdown'])[1]")
    WebElement SelectButton;
    public static @FindBy(id = "ui-id-147")
    WebElement SelectCustomer;

    public static @FindBy(xpath = "//button[contains(text(),'Edit')]")
    WebElement EdtiButton;

    public static @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]")
    WebElement SaveButton;

    public static @FindBy(xpath = "//button[contains(text(),'Create')]")
    WebElement CreateButton;





}
