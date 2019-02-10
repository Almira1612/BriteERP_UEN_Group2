package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

// -------------------------------   Almira   -----------------------------------------------------------

public class ConfigPOSPage{
    public ConfigPOSPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static @FindBy(xpath = "//div[@class='o_list_buttons']/button[1]")
    WebElement createElement;

    public static @FindBys(@FindBy(className = "o_data_row"))
    List<WebElement> allPOSList;

    public static @FindBy(xpath = "//div[@class='o_form_view o_form_editable']//div[@id='title']/h1/input")
    WebElement POSinputElement;

    public static @FindBy(xpath = "//div[@class='o_form_view o_form_editable']//div[@id='inventory_location']//input")
    WebElement TypeSelectElement;

    public static @FindBy(xpath = "//div[@class='o_form_buttons_edit']/button[1]")
    WebElement POSSaveButton;

    public static @FindBy(xpath = "//ol/li[@class='active']")
    WebElement NewPOSTitleElement;

    public static @FindBy(xpath = "//div[@class='o_control_panel o_breadcrumb_full']//div[@class=\"o_form_buttons_view\"]/button[1]")
    WebElement EditElement;

    public static @FindBy(xpath = "//div[@class='o_control_panel']//div[@class=\"o_form_buttons_view\"]/button[1]")
    WebElement Edit2Element;

    public static @FindBy(xpath = "//div[@name='module_pos_restaurant']/input")
    WebElement BarCheckElement;

    public static @FindBy(xpath = "//div[@class='o_content']//button[@class='btn btn-sm oe_stat_button']")
    WebElement ArchiveElement;

    public static @FindBy(xpath = "//div[@class='o_content']//div[@class='o_stat_info o_field_widget']")
    WebElement ArchiveButtonText;

    public static String ExpectedTitle = "Point of Sale - Odoo";

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//a[@name='picking_type_id']")
    WebElement TypeDisplayElement;

    public static @FindBy(linkText = "PoS Orders")
    WebElement posOrdertypeLink;

    public static @FindBy(linkText = "Chicago Warehouse: Receipts")
    WebElement CWRtypeLink;

    public static @FindBy(linkText = "clothes")
    WebElement CategoryName;

    public static void UnSelect(){
        if(BarCheckElement.isSelected())
            BarCheckElement.click();
    }

    public static @FindBy(xpath = "//div[@class='o_notification_manager']/div[@class='o_notification undefined o_error']")
    WebElement errorAlertMethod;

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//div[@name='start_category']/input")
    WebElement startCategoryCheckBox;

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//div[@class='o_input_dropdown']/input")
    WebElement startCategoryDropDown;

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//div[@class='content-group mt16']/a")
    WebElement CatagoryDisplay;

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//div[@name='is_header_or_footer']/input")
    WebElement HeaderFooterCheckBox;

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//textarea[@name='receipt_header']")
    WebElement HeaderTextarea;

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//textarea[@name='receipt_footer']")
    WebElement FooterTextarea;

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//span[@name='receipt_header']")
    WebElement Headerdisplay;

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//span[@name='receipt_footer']")
    WebElement FooterDisplay;

}
