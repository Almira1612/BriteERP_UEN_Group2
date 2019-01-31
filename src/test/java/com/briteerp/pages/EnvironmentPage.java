package com.briteerp.pages;

import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnvironmentPage extends TestBase {

    //The environment we are working on (BriteErpDemo)
    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    public WebElement serverLink;



    public void selectEnvironment(){
       serverLink.click();
    }
}
