package com.briteerp.tests.shayida;

import com.briteerp.pages.*;
import com.briteerp.tests.PosCategoryTest;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class selectMultipleCategory extends TestBase {
    public selectMultipleCategory(){
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void untilLogin() {
        new PosCategoryTest();
        new EnvironmentPage(); //set up the environment, USE the link in propetry file, open the website
        new POSHomePage();
        new HomePage();
        new ConfigurationPosCategory();
    }

    @Test
    public void testCategory02() throws InterruptedException {
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
        extentLogger.info("Selecting all categories by check box");
        ConfigurationPosCategory.checkAll.click();
        BrowserUtils.wait(3);

    }
}
