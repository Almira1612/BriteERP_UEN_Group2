package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// -------------------------------   Almira   -----------------------------------------------------------

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

        //Login and verify the pages
        extentLogger = report.createTest("Verify created new point of sale can be saved");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        BrowserUtils.wait(4);
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        Thread.sleep(6000);
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        Thread.sleep(10000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));


    }

    @Test(groups = "ST")
    public void VerifyTitle(){
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();

        extentLogger.info("Verifying the title matches expected title");
        Assert.assertEquals(driver.getTitle(),ConfigPOSPage.ExpectedTitle);
    }

    @Test(groups = "ST")
    public void ArchivePOS(){
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        BrowserUtils.wait(2);
        // click the last pos
        extentLogger.info("Clicking the last point of sale name");
        ConfigPOSPage.allPOSList.get(ConfigPOSPage.allPOSList.size()-1).click();
        BrowserUtils.wait(3);
        extentLogger.info("Clicking Archive button");
        ConfigPOSPage.ArchiveElement.click();
        BrowserUtils.wait(6);
        extentLogger.info("Verifying page display archievd text");
        Assert.assertEquals(ConfigPOSPage.ArchiveButtonText.getText(),"Active");

    }

    @Test
    public void CreatePOS() throws InterruptedException {
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();

        //Create new POS
        extentLogger.info("Clicking Create button");
        ConfigPOSPage.createElement.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the title contains New");
        Assert.assertTrue(driver.getTitle().contains("New"));
        extentLogger.info("Entering valid credentials and click save");

        //TODO -- can not locate element
        ConfigPOSPage.POSinputElement.sendKeys("Fairfax store");
        Thread.sleep(3000);
        ConfigPOSPage.TypeSelectElement.click();
        System.out.println(ConfigPOSPage.DropDownElement.getText());

        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying new POS is displayed");
        Assert.assertEquals(ConfigPOSPage.NewPOSTitleElement.getText(),"Fairfax store");
    }

    @Test
    public void changeOperationType() throws InterruptedException {
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();

        extentLogger.info("Verifying the title contains Point of sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));

        //Go to POS and click edit button
        extentLogger.info("Select one Point of sale name");
        ConfigPOSPage.allPOSList.get(2).click();
        Thread.sleep(3000);
        extentLogger.info("Clicking edit button");
        //TODO -- can not locate element
        ConfigPOSPage.EditElement.click();
        extentLogger.info("clicking Is a Bar/Restaurant check box and save");
        ConfigPOSPage.BarCheckElement.click();
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(3000);
        extentLogger.info("Verify the checkbox is selected");
        Assert.assertTrue(ConfigPOSPage.BarCheckElement.isSelected());
    }

}
