package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigPOSNewPage{
    public ConfigPOSNewPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static @FindBy(xpath = "//div[@class='o_form_view o_form_editable']//div[@id='title']/h1/input")
    WebElement POSinputElement;

    public static @FindBy(xpath = "//div[@class='o_form_view o_form_editable']//div[@class='o_input_dropdown']/input ")
    WebElement TypeSelectElement;

    public static @FindBy(xpath = "//div[@class='o_form_buttons_edit']/button[1]")
    WebElement POSSaveButton;

    public static @FindBy(xpath = "//ol/li[@class='active']")
    WebElement NewPOSTitleElement;
}
