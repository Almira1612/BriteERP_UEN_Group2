package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import com.google.common.base.Verify;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PosOrderTestCase extends TestBase {
    PosOrderTestCase() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);

    }

    @BeforeMethod(alwaysRun = true)
    public void st1() {
        new PosOrderTestCase();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
        new OrderPage();
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
        extentLogger.info("Clicking the order on the orders");
        POSHomePage.ordersOrdersElement.click();
        Thread.sleep(8000);
        extentLogger.info("Verifying the title contains orders");
        Assert.assertTrue(driver.getTitle().contains("Orders"));


    }

    @Test(groups = "ST")
    public void test02() throws InterruptedException {

        extentLogger = report.createTest("Verify the Orders's page");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        Thread.sleep(7000);
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        Thread.sleep(7000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        extentLogger.info("Clicking the order on the orders");
        POSHomePage.ordersOrdersElement.click();
        Thread.sleep(8000);

        extentLogger.info("Click on the Kanban button");
        OrderPage.kanbanButton.click();
        BrowserUtils.wait(3);

        extentLogger.info("Click on the Create Button");
        OrderPage.creatButton.click();
        BrowserUtils.wait(3);

        extentLogger.info("verify the title  Contains New");
        Assert.assertTrue(driver.getTitle().contains("New"));
        BrowserUtils.wait(3);

    }
}