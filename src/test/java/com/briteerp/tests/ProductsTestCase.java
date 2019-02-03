package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductsTestCase extends TestBase {
    ProductsTestCase() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }


    @BeforeMethod(alwaysRun = true)
    public void SetUp() throws InterruptedException {
        new ProductsTestCase();
        new POSProductPage();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();


        //Login and verify the pages
        extentLogger = report.createTest("Verify created new point of sale can be saved");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        Thread.sleep(8000);
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));

        extentLogger.info("Clicking the Products under Catalog");
        POSHomePage.catalogProductsElement.click();
        Thread.sleep(8000);
        extentLogger.info("Verifying the title contains Products");
        Assert.assertTrue(driver.getTitle().contains("Products"));

    }
    @Test(groups = "ST")
    public void Test1() throws InterruptedException {
        extentLogger.info("Click the next button icon");
        POSProductPage.nexButtonIcon.click();
        Assert.assertEquals(POSProductPage.PageValue.getText(),"81-160");
        Thread.sleep(5000);
        extentLogger.info("Click back button to go back previous page");
        POSProductPage.backButtonIcon.click();
        Assert.assertEquals(POSProductPage.PageValue.getText(),"1-80");
        Thread.sleep(3000);

    }
    @Test(groups = "ST")
    public void Test2() throws InterruptedException{
        extentLogger.info("Clicking list button icon on top right corner");
        POSProductPage.listButtonIcon.click();
        Assert.assertTrue(POSProductPage.displayInternalRefrence.isDisplayed());
        Thread.sleep(5000);
        extentLogger.info("Clicking canban button icon on top right corner");
        POSProductPage.canbanButtonIcon.click();
        Assert.assertNotEquals(POSProductPage.displayInternalRefrence.isDisplayed(), false);
        Thread.sleep(5000);
    }

}
