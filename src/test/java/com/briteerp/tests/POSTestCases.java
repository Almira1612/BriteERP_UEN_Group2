package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import javafx.scene.layout.Priority;
import org.apache.commons.lang3.builder.ToStringExclude;
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
        extentLogger = report.createTest("Manager should be able to edit POS");
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

    @Test(priority = 0, groups={"ST"})
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
        extentLogger.info("Verifying page display archived text");
        Assert.assertEquals(ConfigPOSPage.ArchiveButtonText.getText(),"Active");

    }

    @Test(priority = 1)
    public void PositiveCreatePOS() throws InterruptedException {
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        //Create new POS
        extentLogger.info("Clicking Create button");
        ConfigPOSPage.createElement.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the title contains New");
        Assert.assertTrue(driver.getTitle().contains("New"));
        //Enter valid credentials and save it
        extentLogger.info("Entering valid credentials and click save");
        ConfigPOSPage.POSinputElement.sendKeys("test 2");
        ConfigPOSPage.TypeSelectElement.click();
        Thread.sleep(2000);
        ConfigPOSPage.posOrdertypeLink.click();
        Thread.sleep(2000);
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(7000);
        //Check the pos is saved by confirm the title displaying
        extentLogger.info("Verifying new POS is displayed");
        Assert.assertTrue(ConfigPOSPage.NewPOSTitleElement.getText().contains("test 2"));
    }
    @Test(priority = 2)//Negative test of create POS (without select type)
    public void NegativeCreatePOS1() throws InterruptedException {
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        //Create new POS
        extentLogger.info("Clicking Create button");
        ConfigPOSPage.createElement.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the title contains New");
        Assert.assertTrue(driver.getTitle().contains("New"));
        //Enter valid POS name and click save
        extentLogger.info("Entering valid POS name and click save");
        ConfigPOSPage.POSinputElement.sendKeys("No Operation Type");
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(2000);
        extentLogger.info("Verifying error alert displayed");
        Assert.assertTrue(ConfigPOSPage.errorAlertMethod.isDisplayed());

    }

    @Test(priority = 3)//Negative test of create POS(without entering name)
    public void NegativeCreatePOS2() throws InterruptedException {
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        //Create new POS
        extentLogger.info("Clicking Create button");
        ConfigPOSPage.createElement.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the title contains New");
        Assert.assertTrue(driver.getTitle().contains("New"));
        extentLogger.info("Clicking and select operation type");
        ConfigPOSPage.TypeSelectElement.click();
        Thread.sleep(2000);
        ConfigPOSPage.posOrdertypeLink.click();
        Thread.sleep(2000);
        extentLogger.info("Clicking the save button");
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying error alert displayed");
        Assert.assertTrue(ConfigPOSPage.errorAlertMethod.isDisplayed());

    }
    @Test
    public void setAsRestaurant() throws InterruptedException {
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        extentLogger.info("Verifying the title contains Point of sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        //Go to POS and click edit button
        extentLogger.info("Select one Point of sale name");
        ConfigPOSPage.allPOSList.get(2).click();
        Thread.sleep(3000);
        //Edit the pos on the pos detail page
        extentLogger.info("Clicking edit button");
        ConfigPOSPage.EditElement.click();
        Thread.sleep(2000);
        extentLogger.info("clicking Is a Bar/Restaurant check box");
        ConfigPOSPage.UnSelect();
        Thread.sleep(1000);
        ConfigPOSPage.BarCheckElement.click();
        extentLogger.info("Verifying is the Bar/Restaurant check box is selected");
        Assert.assertTrue(ConfigPOSPage.BarCheckElement.isSelected());
        Thread.sleep(2000);
        extentLogger.info("Clicking the save button");
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(5000);
        extentLogger.info("Verify the checkbox is selected");
        Assert.assertTrue(ConfigPOSPage.BarCheckElement.isSelected());
    }

    @Test
    public void changePOSname() throws InterruptedException{
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        extentLogger.info("Verifying the title contains Point of sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        //Go to POS and click edit button
        extentLogger.info("Select one Point of sale name");
        ConfigPOSPage.allPOSList.get(ConfigPOSPage.allPOSList.size()-1).click();
        Thread.sleep(3000);
        //Edit the pos on the pos detail page
        extentLogger.info("Clicking edit button");
        ConfigPOSPage.EditElement.click();
        Thread.sleep(2000);
        extentLogger.info("Deleting the pos name from input box");
        ConfigPOSPage.POSinputElement.clear();
        Thread.sleep(2000);
        extentLogger.info("Typing the pos name on input box and click save");
        ConfigPOSPage.POSinputElement.sendKeys("Name changed");
        Thread.sleep(2000);
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(7000);
        //Check the pos is saved by confirm the title displaying
        extentLogger.info("Verifying POS is displayed with edited name");
        Assert.assertTrue(ConfigPOSPage.NewPOSTitleElement.getText().contains("Name changed"));
        System.out.println("Title: "+ConfigPOSPage.NewPOSTitleElement.getText());
    }

    @Test
    public void changeOperationType() throws InterruptedException{
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        Thread.sleep(2000);
        //Create new POS
        extentLogger.info("Clicking Create button");
        ConfigPOSPage.createElement.click();
        Thread.sleep(3000);
        //Enter valid credentials and save it
        extentLogger.info("Entering valid credentials and click save");
        ConfigPOSPage.POSinputElement.sendKeys("test 2");
        ConfigPOSPage.TypeSelectElement.click();
        Thread.sleep(2000);
        ConfigPOSPage.posOrdertypeLink.click();
        Thread.sleep(2000);
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(7000);
        //Check the pos is saved by confirm the title displaying
        extentLogger.info("Verifying new POS name is displayed");
        Assert.assertTrue(ConfigPOSPage.NewPOSTitleElement.getText().contains("test 2"));
        //Change the operation type of new POS
        extentLogger.info("Clicking the Edit button");
        ConfigPOSPage.Edit2Element.click();
        extentLogger.info("Clicking and select operation type -- Chicago Warehouse: Receipts ");
        ConfigPOSPage.TypeSelectElement.click();
        Thread.sleep(1000);
        ConfigPOSPage.CWRtypeLink.click();
        Thread.sleep(2000);
        extentLogger.info("Clicking the save button");
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the operation type changed to Chicago Warehouse: Receipts");
        Assert.assertEquals(ConfigPOSPage.TypeDisplayElement.getText(),"Chicago Warehouse: Receipts");
    }
    @Test
    public void SetStartCategory() throws InterruptedException{
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        Thread.sleep(2000);
        //Create new POS
        extentLogger.info("Clicking Create button");
        ConfigPOSPage.createElement.click();
        Thread.sleep(3000);
        //Enter valid credentials and save it
        extentLogger.info("Entering valid credentials and click save");
        ConfigPOSPage.POSinputElement.sendKeys("test 2");
        ConfigPOSPage.TypeSelectElement.click();
        Thread.sleep(2000);
        ConfigPOSPage.posOrdertypeLink.click();
        Thread.sleep(2000);
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(7000);
        //Check the pos is saved by confirm the title displaying
        extentLogger.info("Verifying new POS name is displayed");
        Assert.assertTrue(ConfigPOSPage.NewPOSTitleElement.getText().contains("test 2"));
        //Set Start Category
        extentLogger.info("Clicking the Edit button");
        ConfigPOSPage.Edit2Element.click();
        Thread.sleep(3000);
        extentLogger.info("Clicking Set Start Category checkbox and choose clothes category");
        ConfigPOSPage.startCategoryCheckBox.click();
        ConfigPOSPage.startCategoryDropDown.click();
        Thread.sleep(1000);
        ConfigPOSPage.CategoryName.click();
        extentLogger.info("Clicking the save button");
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the Start Category display after save");
        Assert.assertEquals(ConfigPOSPage.CatagoryDisplay.getText(),"clothes");

    }
    @Test
    public void SetHeaderFooter() throws InterruptedException {
        //Go to point of sale page and create new POS
        extentLogger.info("Clicking the point of sale under Configuration");
        POSHomePage.configPosElement.click();
        Thread.sleep(2000);
        //Create new POS
        extentLogger.info("Clicking Create button");
        ConfigPOSPage.createElement.click();
        Thread.sleep(3000);
        //Enter valid credentials and save it
        extentLogger.info("Entering valid credentials and click save");
        ConfigPOSPage.POSinputElement.sendKeys("test 2");
        ConfigPOSPage.TypeSelectElement.click();
        Thread.sleep(2000);
        ConfigPOSPage.posOrdertypeLink.click();
        Thread.sleep(2000);
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(7000);
        //Check the pos is saved by confirm the title displaying
        extentLogger.info("Verifying new POS name is displayed");
        Assert.assertTrue(ConfigPOSPage.NewPOSTitleElement.getText().contains("test 2"));
        //Set Header and Footer
        extentLogger.info("Clicking the Edit button");
        ConfigPOSPage.Edit2Element.click();
        Thread.sleep(3000);
        extentLogger.info("Clicking the Header & Footer checkbox");
        ConfigPOSPage.HeaderFooterCheckBox.click();
        Thread.sleep(2000);
        extentLogger.info("Entering header and footer contents and click save");
        ConfigPOSPage.HeaderTextarea.sendKeys("Welcome to the store");
        ConfigPOSPage.FooterTextarea.sendKeys("Thank you for shopping with us");
        ConfigPOSPage.POSSaveButton.click();
        Thread.sleep(3000);
        extentLogger.info("Verifying the header and footer displayed");
        Assert.assertEquals(ConfigPOSPage.Headerdisplay.getText(),"Welcome to the store");
        Assert.assertEquals(ConfigPOSPage.FooterDisplay.getText(),"Thank you for shopping with us");
    }
}
