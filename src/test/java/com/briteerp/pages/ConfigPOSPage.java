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

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//input[@class='o_input ui-autocomplete-input']")
    WebElement TypeSelectElement;

    public static @FindBy(className = "o_input_dropdown")
    WebElement DropDownElement;

    public static @FindBy(xpath = "//div[@class='o_form_buttons_edit']/button[1]")
    WebElement POSSaveButton;

    public static @FindBy(xpath = "//ol/li[@class='active']")
    WebElement NewPOSTitleElement;

    public static @FindBy(xpath = "//div[@class=\"o_form_buttons_view\"]/button[1]")
    WebElement EditElement;

    public static @FindBy(xpath = "//div[@name='module_pos_restaurant']/input")
    WebElement BarCheckElement;

    public static @FindBy(xpath = "//div[@class='o_content']//button[@class='btn btn-sm oe_stat_button']")
    WebElement ArchiveElement;

    public static @FindBy(xpath = "//div[@class='o_content']//div[@class='o_stat_info o_field_widget']")
    WebElement ArchiveButtonText;

    public static String ExpectedTitle = "Point of Sale - Odoo";
}
