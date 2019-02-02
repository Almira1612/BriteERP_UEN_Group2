package com.briteerp.tests;


import com.briteerp.pages.*;
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
        new POSReportingOrders();
    }


    @Test(groups = "ST")
    public void test01() {

        extentLogger = report.createTest("Verify the report`s page");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(LoginPage.actualTitle.contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(HomePage.currentTitle.contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(POSHomePage.currentTitle.contains("Point of Sale"));
        extentLogger.info("Clicking the orders under reports");
        POSHomePage.reportingOrdersElement.click();
        extentLogger.info("Verifying the title contains Analysis");
        Assert.assertTrue(POSReportingOrders.currentTitle.contains("Analysis"));


    }
}
