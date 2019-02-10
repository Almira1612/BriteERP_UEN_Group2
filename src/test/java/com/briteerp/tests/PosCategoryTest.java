package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PosCategoryTest extends TestBase {
    public PosCategoryTest() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void untilLogin() throws InterruptedException {
        new PosCategoryTest();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
        new ConfigurationPosCategory();

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
        extentLogger.info("Clicking the products under Configuraion");
        ConfigurationPosCategory.Productclick.click();
        Thread.sleep(5000);
        extentLogger.info("Clicking the PoS Categories under products");
        ConfigurationPosCategory.Poscategory.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains PoS Categories");
        Assert.assertTrue(driver.getTitle().contains("PoS Categories"));
        Thread.sleep(5000);

    }

    @Test(groups = "ST")
    public void test1() throws InterruptedException {
        extentLogger.info("Clicking on a category from the list");
        ConfigurationPosCategory.anycategory.click();
        Thread.sleep(5000);

    }

    @Test(groups = "ST")
    public void test2() throws InterruptedException {
        extentLogger.info("Clicking on kanban view on top of the list");
        ConfigurationPosCategory.kanbanviewOptionElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the kanban view model displayed ");
        Assert.assertTrue(ConfigurationPosCategory.kanbanviewOptionElement.isDisplayed());
        Thread.sleep(5000);
    }

    @Test
    public void addAttachment() throws InterruptedException {
        extentLogger.info("Clicking on a category from the list");
        ConfigurationPosCategory.anycategory.click();
        Thread.sleep(5000);
        extentLogger.info("click to add attachment");
        ConfigurationPosCategory.AddAttachment.click();
        ConfigurationPosCategory.AddbuttonforAttach.click();
        Thread.sleep(5000);
    }

    @Test
    public void addPictoCategory() throws InterruptedException {
        extentLogger.info("Clicking on a category from the list");
        ConfigurationPosCategory.anycategory.click();
        Thread.sleep(5000);
        extentLogger.info("editing the category informatio");
        ConfigurationPosCategory.editButton.click();
        Thread.sleep(5000);
        extentLogger.info("upload photo for the category");
        ConfigurationPosCategory.editPhoto.click();
        Thread.sleep(5000);
    }

    @Test
    public void CreateCategoryWithNma() throws InterruptedException {
        extentLogger.info("clicking button to open a form for new category");
        ConfigurationPosCategory.createButton.click();
        extentLogger.info("creating category by entered name");
        ConfigurationPosCategory.fullName.sendKeys("random_type");
        ConfigurationPosCategory.saveButton.click();
        Thread.sleep(5000);
    }

    @Test
    public void createWithParentCategory() throws InterruptedException {
        extentLogger.info("clicking button to open a form for new category");
        ConfigurationPosCategory.createButton.click();
        extentLogger.info("creating category by entered name");
        ConfigurationPosCategory.fullName.sendKeys("random_type");
        ConfigurationPosCategory.saveButton.click();
        Thread.sleep(5000);
        extentLogger.info("switch parent category type");
        Select select=new Select(ConfigurationPosCategory.types);
        select.selectByValue("1");
        ConfigurationPosCategory.saveButton.click();
    }

    @Test
    public void switchViewType() throws InterruptedException {
        extentLogger.info(("clicking the Kanban view"));
        ConfigurationPosCategory.kanbanviewOptionElement.click();
        Thread.sleep(5000);
    }

    @Test
    public void viewCategoryDetail() throws InterruptedException {
        extentLogger.info("Clicking on a category from the list");
        ConfigurationPosCategory.anycategory.click();
        Thread.sleep(5000);
    }

    @Test
    public void deleteMultipleCategory() throws InterruptedException {
        extentLogger.info("Selecting 2 categories by check box");
        ConfigurationPosCategory.checkFirst.click();
        ConfigurationPosCategory.checksecond.click();
        Thread.sleep(5000);
        extentLogger.info("deleting all categories by action box");
        ConfigurationPosCategory.ActionBox.click();
        ConfigurationPosCategory.deleteOption.click();
        BrowserUtils.wait(3);
        ConfigurationPosCategory.conformDelete.click();
        BrowserUtils.wait(3);
    }

    @Test
    public void deplicateVategory() throws InterruptedException {
        extentLogger.info("Clicking on a category from the list");
        ConfigurationPosCategory.anycategory.click();
        Thread.sleep(5000);
        extentLogger.info("Duplicating the category by the action button");
        ConfigurationPosCategory.actionButton.click();
        ConfigurationPosCategory.DuplicateButton.click();
        BrowserUtils.wait(3);
        ConfigurationPosCategory.saveButton.click();
        Thread.sleep(5000);
    }

    @Test
    public void selectMultipleCategory(){
        extentLogger.info("Selecting all categories by check box");
        ConfigurationPosCategory.checkAll.click();
        BrowserUtils.wait(3);
    }

    @Test
    public void switchParentCtype() throws InterruptedException {
        extentLogger.info("Clicking on a category from the list");
        ConfigurationPosCategory.anycategory.click();
        Thread.sleep(5000);
        extentLogger.info("editing the category information");
        ConfigurationPosCategory.editButton.click();
        Thread.sleep(5000);
        extentLogger.info("switch parent category type");
        Select select=new Select(ConfigurationPosCategory.types);
        select.selectByValue("1");
        ConfigurationPosCategory.saveButton.click();
    }

}
