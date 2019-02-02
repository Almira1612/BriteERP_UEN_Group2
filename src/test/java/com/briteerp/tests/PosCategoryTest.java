package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PosCategoryTest extends TestBase {
    public PosCategoryTest(){
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void untilLogin() {
        new PosCategoryTest();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
        new ConfigurationPosCategory();
    }

    @Test(groups = "ST")
    public void test1() throws InterruptedException {
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
        extentLogger.info("Clicking on a category from the list");
        ConfigurationPosCategory.anycategory.click();
        Thread.sleep(5000);

    }

    @Test(groups = "ST")
    public void test2()  throws InterruptedException  {
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
        extentLogger.info("Clicking on kanban view on top of the list");
        ConfigurationPosCategory.kanbanviewOptionElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the kanban view model displayed ");
        Assert.assertTrue(ConfigurationPosCategory.kanbanviewOptionElement.isDisplayed());
        Thread.sleep(5000);

    }





}