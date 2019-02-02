package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POSTestCases extends TestBase {
    public POSTestCases() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void SetUp() throws InterruptedException {
        new POSTestCases();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
        new ConfigPOSPage();
        new ConfigPOSEditPage();
        new ConfigPOSNewPage();

        //Login and verify the pages
        extentLogger = report.createTest("Verify created new point of sale can be saved");
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

        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the title contains Point of sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
    }
    @Test(groups = "ST")
    public void CreatePOS() throws InterruptedException {
        //Create new POS
        extentLogger.info("Clicking Create button");
        ConfigPOSPage.createElement.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the title contains New");
        Assert.assertTrue(driver.getTitle().contains("New"));
        extentLogger.info("Entering valid credentials and click save");

        //TODO -- can not locate element
        ConfigPOSNewPage.POSinputElement.sendKeys("Fairfax store");
        ConfigPOSNewPage.TypeSelectElement.click();

        ConfigPOSNewPage.POSSaveButton.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying new POS is displayed");
        Assert.assertEquals(ConfigPOSNewPage.NewPOSTitleElement.getText(),"Fairfax store");
    }

    @Test(groups = "ST")
    public void changeOperationType() throws InterruptedException {
        //Go to POS and click edit button
        extentLogger.info("Select one Point of sale name");
        ConfigPOSPage.allPOSList.get(2).click();
        Thread.sleep(3000);
        extentLogger.info("Clicking edit button");
        //TODO -- can not locate element
        ConfigPOSEditPage.EditElement.click();
        extentLogger.info("clicking Is a Bar/Restaurant check box and save");
        ConfigPOSEditPage.BarCheckElement.click();
        ConfigPOSEditPage.POSSaveButton.click();
        Thread.sleep(3000);
        extentLogger.info("Verify the checkbox is selected");
        Assert.assertTrue(ConfigPOSEditPage.BarCheckElement.isSelected());
    }

}
