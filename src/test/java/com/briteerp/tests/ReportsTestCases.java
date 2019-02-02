package com.briteerp.tests;


import com.briteerp.pages.*;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportsTestCases extends TestBase {
    ReportsTestCases() {

        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }


    @BeforeMethod(alwaysRun = true)
    public void st1() {
        new ReportsTestCases();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
        new POSReportingOrders();
    }


    @Test(groups = "ST")
    public void test01() throws InterruptedException {

        extentLogger = report.createTest("Verify the report`s page");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        extentLogger.info("Clicking the orders under reports");
        POSHomePage.reportingOrdersElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Analysis");
        Assert.assertTrue(driver.getTitle().contains("Analysis"));


    }

    @Test(groups = "ST")
    public void test02() throws InterruptedException  {

        extentLogger = report.createTest("Verify the report`s page");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        extentLogger.info("Clicking the orders under reports");
        POSHomePage.reportingOrdersElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Analysis");
        Assert.assertTrue(driver.getTitle().contains("Analysis"));
        extentLogger.info("Clicking graph view option");
        POSReportingOrders.graphElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the graph is displaying");
        Assert.assertTrue(POSReportingOrders.graphImageElement.isDisplayed());

    }

    @Test(groups = "ST")
    public void test03() throws InterruptedException {
        extentLogger = report.createTest("Verify the report`s page");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        extentLogger.info("Clicking the orders under reports");
        POSHomePage.reportingOrdersElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Analysis");
        Assert.assertTrue(driver.getTitle().contains("Analysis"));
        extentLogger.info("Clicking pivot view option");
        POSReportingOrders.pivotElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the pivot table is displaying");
        Assert.assertTrue(POSReportingOrders.pivotImageElement.isDisplayed());
    }
}
