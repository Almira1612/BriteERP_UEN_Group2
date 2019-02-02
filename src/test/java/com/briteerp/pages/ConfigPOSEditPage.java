package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigPOSEditPage {
    public ConfigPOSEditPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static @FindBy(xpath = "//div[@class=\"o_form_buttons_view\"]/button[1]")
    WebElement EditElement;

    public static @FindBy(xpath = "//div[@name='module_pos_restaurant']/input")
    WebElement BarCheckElement;

    public static @FindBy(xpath = "//div[@class='o_form_buttons_edit']/button[1]")
    WebElement POSSaveButton;
}
