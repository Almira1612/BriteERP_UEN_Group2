package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnvironmentPage{


    public EnvironmentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //The environment we are working on (BriteErpDemo)
    static  public @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
     WebElement serverLink;


    public static void selectEnvironment() {
        serverLink.click();
    }


}
