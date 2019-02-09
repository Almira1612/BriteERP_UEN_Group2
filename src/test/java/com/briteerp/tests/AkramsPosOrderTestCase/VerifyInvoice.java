package com.briteerp.tests.AkramsPosOrderTestCase;

import com.briteerp.pages.*;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyInvoice extends TestBase {
    public VerifyInvoice() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);

    }

    @BeforeMethod(alwaysRun = true)
    public void st1() {
        new VerifyInvoice();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
        new OrderPage();
    }

    @Test
    public void InvoiceButton() throws InterruptedException {

        extentLogger = report.createTest("Verify the Orders's page");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        BrowserUtils.wait(5);
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        BrowserUtils.wait(8);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        extentLogger.info("Clicking the order on the orders");
        POSHomePage.ordersOrdersElement.click();
        BrowserUtils.wait(8);

        extentLogger.info("Clicking on the prodect0006");
        OrderPage.Prodect0006.click();
        BrowserUtils.wait(8);

        extentLogger.info("Clicking on the Invoice button");
        OrderPage.InvoiceButton.click();
        BrowserUtils.wait(8);


        extentLogger.info("fill out the list");
        OrderPage.SelectButton.click();
        BrowserUtils.wait(3);

//        OrderPage.SelectCustomer.click();
//        BrowserUtils.wait(8);
        //.SelectButton.sendKeys("akram1233210" + Keys.ENTER);
//        Select select = new Select(OrderPage.SelectButton);
//        System.out.println(select.getOptions());
//        select.selectByIndex(3);

       // BrowserUtils.wait(3);


    }
}