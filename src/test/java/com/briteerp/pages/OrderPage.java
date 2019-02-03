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


}
