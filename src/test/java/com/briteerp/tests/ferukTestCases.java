package com.briteerp.tests;


import com.briteerp.pages.EnvironmentPage;
import com.briteerp.pages.HomePage;
import com.briteerp.pages.POSHomePage;
import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ferukTestCases extends TestBase {
    ferukTestCases(){
        PageFactory.initElements(Driver.getDriver(),LoginPage.class);
    }




    @BeforeMethod
    public void st1(){
        new ferukTestCases();
        new EnvironmentPage();
        new POSHomePage();
    }


    @Test
    public void test01(){

       EnvironmentPage.selectEnvironment();
       Assert.assertTrue(LoginPage.actualTitle.contains("Login"));
       LoginPage.login();
       Assert.assertTrue(HomePage.currentTitle.contains("Inbox"));



    }
}
