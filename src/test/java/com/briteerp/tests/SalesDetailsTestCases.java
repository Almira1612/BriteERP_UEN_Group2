package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SalesDetailsTestCases extends TestBase {

    SalesDetailsTestCases() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void st1() {
        new SalesDetailsTestCases();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
    }

    @Test(groups = "ST")
    public void test01() throws InterruptedException {

        // User Story BRIT-1457
        // test case  BRIT-1678
        //i should be able to select the sales start date.

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
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        SalesDetailsPage.StartDate.click();
        extentLogger.info("Verifying the page is selected start date");



    }

    @Test(groups = "ST")
    public void test02() throws InterruptedException {

        // User Story BRIT-1457
        // test case  BRIT-1685
        //i should be able to select the sales end date.

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
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        SalesDetailsPage.EndDate.click();
        extentLogger.info("Verifying the page is selected end date");




    }


    @Test(groups = "ST")
    public void test03() throws InterruptedException {

        // User Story BRIT-1457
        // test case  BRIT-1690
        //i should be able to select the sales start and end time.

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
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        SalesDetailsPage.StartTime.click();
        extentLogger.info("Verifying the page is selected start time");
        Thread.sleep(5000);
        SalesDetailsPage.EndTime.click();
        extentLogger.info("Verifying the page is selected end time");




    }


    @Test(groups = "ST")
    public void test4() throws InterruptedException {

        // User Story BRIT-1457
        // Test Case  BRIT-1695
        //i should be able to click "close the picker" at any time.

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
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        SalesDetailsPage.ClosePicker.click();
        extentLogger.info("Verifying the calendar page is close");


    }


    @Test(groups = "ST")
    public void test5() throws InterruptedException {

        // User Story BRIT-1488
        // test case  BRIT-1703
        //i should be able to create point of sale.

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
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        extentLogger.info("Verifying the title contains SalesDetailsPage");
        Thread.sleep(5000);
        SalesDetailsPage.AddAnItem.click();
        extentLogger.info("Verifying the addAnItem is clicking");
        Thread.sleep(5000);
        SalesDetailsPage.Create.click();
        Thread.sleep(5000);
        SalesDetailsPage.PointOfSaleNameBox.click();
        Thread.sleep(5000);
        SalesDetailsPage.PointOfSaleNameBox.sendKeys("ZARA");
        Thread.sleep(5000);
        SalesDetailsPage.SelectOperationType.click();
        Thread.sleep(5000);
        SalesDetailsPage.SelectOperationType.click();
        Thread.sleep(5000);
        SalesDetailsPage.SaveAndClose.click();
        extentLogger.info("Verifying the point of sales is created");



    }


    @Test(groups = "ST")
    public void test06() throws InterruptedException {

        // User Story BRIT-1488
        // test case  BRIT-1705
        //i should be able to edit point of sale .

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
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains SalesDetailsPage");
        Thread.sleep(5000);
        SalesDetailsPage.Zara.click();
        Thread.sleep(5000);
        SalesDetailsPage.PointOfSaleNameBox.click();
        SalesDetailsPage.PointOfSaleNameBox.sendKeys("ZARAM");
        SalesDetailsPage.SaveAfterEdit.click();
        extentLogger.info("Verifying the point of sale zara is changed to ZARAM");


    }



    @Test(groups = "ST")
    public void test07() throws InterruptedException {

        // User Story BRIT-1488
        // test case  BRIT-1708
        //i should be able to save and close on point of sale.

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
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains SalesDetailsPage");
        Thread.sleep(5000);
        SalesDetailsPage.AddAnItem.click();
        extentLogger.info("Verifying the addAnItem is clicking");
        Thread.sleep(5000);
        SalesDetailsPage.Create.click();
        Thread.sleep(5000);
        SalesDetailsPage.PointOfSaleNameBox.click();
        Thread.sleep(5000);
        SalesDetailsPage.PointOfSaleNameBox.sendKeys("ZARA");
        Thread.sleep(5000);
        SalesDetailsPage.SelectOperationType.click();
        Thread.sleep(5000);
        SalesDetailsPage.SelectOperationType.click();
        Thread.sleep(5000);
        SalesDetailsPage.SaveAndClose.click();
        extentLogger.info("Verifying the page is saved and closed");





    }


     @Test(groups = "ST")
    public void test08() throws InterruptedException {

      // User Story BRIT-1488
        // test case  BRIT-1710
        //i should be able to delete the point of sales name from sales details page.

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
         extentLogger.info("Clicking the Point of Sale module");
         HomePage.pointOfSaleElement.click();
         Thread.sleep(5000);
         extentLogger.info("Verifying the title contains Point of Sale");
         Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        SalesDetailsPage.DeleteElement.click();
        Thread.sleep(5000);
        Assert.assertTrue(SalesDetailsPage.AfterDeletedPageElement.isDisplayed());


    }






    @Test(groups = "ST")
    public void test09() throws InterruptedException {

        // User Story BRIT-1488
        // test case  BRIT-1706
        //i should be able to save new details on point of sale.

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
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains SalesDetailsPage");
        Thread.sleep(5000);
        SalesDetailsPage.AddAnItem.click();
        extentLogger.info("Verifying the addAnItem is clicking");
        Thread.sleep(5000);
        SalesDetailsPage.Create.click();
        Thread.sleep(5000);
        SalesDetailsPage.PointOfSaleNameBox.click();
        Thread.sleep(5000);
        SalesDetailsPage.PointOfSaleNameBox.sendKeys("ZARA");
        Thread.sleep(5000);
        SalesDetailsPage.SelectOperationType.click();
        Thread.sleep(5000);
        SalesDetailsPage.SelectOperationType.click();
        Thread.sleep(5000);
        SalesDetailsPage.SaveAndNew.click();
        extentLogger.info("Verifying the page saved new details");



    }


    @Test(groups = "ST")

    // User Story BRIT-1492
    // test case  BRIT-1698
    //i should be able to print the sales details page.

    public void test10() throws InterruptedException {
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
        extentLogger.info("Clicking the Point of Sale module");
        HomePage.pointOfSaleElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        SalesDetailsPage.PrintElement.click();
        Thread.sleep(5000);
        Assert.assertTrue(SalesDetailsPage.AfterPrintedPageElement.isDisplayed());




    }


}