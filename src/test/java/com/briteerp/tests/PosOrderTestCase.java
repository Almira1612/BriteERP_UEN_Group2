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
        Thread.sleep(8000);
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

    @Test
    public void CreatingOrder() throws InterruptedException {

        extentLogger = report.createTest("Verify the Orders's page");
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
        Thread.sleep(5000);
        OrderPage.kanbanButton.click();
        BrowserUtils.wait(2);
        OrderPage.CreateButton.click();
        BrowserUtils.wait(2);
        OrderPage.SaveButton.click();

    }
    @Test
    public void deleteOrder() throws InterruptedException {

        extentLogger = report.createTest("Verify the Orders's page");
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
        Thread.sleep(8000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        extentLogger.info("Clicking the order on the orders");
        POSHomePage.ordersOrdersElement.click();
        Thread.sleep(8000);

        extentLogger.info("Clicking on the order");
        OrderPage.Prodect0001.click();
        BrowserUtils.wait(3);

        extentLogger.info("Clicking on the Acction button");
        OrderPage.ActionButton.click();
        BrowserUtils.wait(3);

        extentLogger.info("Clicking on the Delete");
        OrderPage.DeleteButton.click();
        BrowserUtils.wait(3);

        extentLogger.info("Clicking on the OK button");
        OrderPage.OkButton.click();
        BrowserUtils.wait(3);

    }
    @Test
    public void VerifyGoBack() throws InterruptedException {

        extentLogger = report.createTest("Verify the Orders's page");
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
        Thread.sleep(5000);

        extentLogger.info("Clicking on the prodect0006");
        OrderPage.Prodect0006.click();
        BrowserUtils.wait(3);

        extentLogger.info("Clicking on the Order");
        OrderPage.OrderButton.click();
        BrowserUtils.wait(3);
    }
    @Test
    public void VerifyNextPage() throws InterruptedException {

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
        BrowserUtils.wait(5);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        extentLogger.info("Clicking the order on the orders");
        POSHomePage.ordersOrdersElement.click();
        BrowserUtils.wait(5);

        extentLogger.info("Clicking on the prodect0006");
        OrderPage.Prodect0006.click();
        BrowserUtils.wait(5);

        extentLogger.info("Clicking on the next Icon");
        OrderPage.NextIcon.click();
        BrowserUtils.wait(3);

    }
    @Test
    public void VerifyPerviousPage() throws InterruptedException {

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
        BrowserUtils.wait(5);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        extentLogger.info("Clicking the order on the orders");
        POSHomePage.ordersOrdersElement.click();
        BrowserUtils.wait(5);

        extentLogger.info("Clicking on the prodect0006");
        OrderPage.Prodect0006.click();
        BrowserUtils.wait(5);

        extentLogger.info("Clicking on the previous icon");
        OrderPage.PreviousIcon.click();
        BrowserUtils.wait(5);

    }
    @Test
    public void VerifyOrder() throws InterruptedException {

        extentLogger = report.createTest("Verify the Orders's page");
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
    @Test
    public void EdtiProduct() throws InterruptedException {

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
        BrowserUtils.wait(4);

        extentLogger.info("Clicking on the EdtiButton");
        OrderPage.EdtiButton.click();
        OrderPage.SaveButton.click();
        BrowserUtils.wait(3);
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
    @Test
    public void verifyTitle() throws InterruptedException {

        extentLogger = report.createTest("Verify the report`s page");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        BrowserUtils.wait(8);
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
        extentLogger.info("Verifying the title contains orders");
        Assert.assertTrue(driver.getTitle().contains("Orders"));


    }
    @Test
    public void VerifyReturn() throws InterruptedException {

        extentLogger = report.createTest("Verify the Orders's page");
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
        Thread.sleep(5000);

        extentLogger.info("Clicking on the order list");
        OrderPage.Prodect0006.click();
        BrowserUtils.wait(5);

        extentLogger.info("Clicking on the ReturnProduct");
        OrderPage.ReturnProduct.click();
        BrowserUtils.wait(3);

    }
}








