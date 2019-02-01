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
    ferukTestCases() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }


    @BeforeMethod(alwaysRun = true)
    public void st1() {
        new ferukTestCases();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
    }


    @Test(groups = "ST")
    public void test01() throws InterruptedException {

        EnvironmentPage.selectEnvironment();
        Assert.assertTrue(LoginPage.actualTitle.contains("Login"));
        LoginPage.login();
        Thread.sleep(5000);
        Assert.assertTrue(HomePage.currentTitle.contains("Inbox"));
        Thread.sleep(5000);
        HomePage.pointOfSaleElement.click();


    }
}
