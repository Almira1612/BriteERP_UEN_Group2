package com.briteerp.tests;


import com.briteerp.pages.*;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ReportsTestCases extends TestBase {
    ReportsTestCases() {

        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }


    @BeforeMethod(alwaysRun = true)
    public void st1() {
        new ReportsTestCases();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
        new POSReportingOrders();

        extentLogger = report.createTest("Verify the report`s page");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        BrowserUtils.waitForVisibility(HomePage.sideBarElement, 100);

        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        BrowserUtils.wait(5);

        POSHomePage.reportingOrdersElement.click();


    }


    /*
        Testing graph view model
     */

    @Test(groups = "ST")
    public void test01() {

        BrowserUtils.wait(5);
        extentLogger.info("Clicking graph view option");
        POSReportingOrders.graphElement.click();
//        BrowserUtils.wait(5);
        BrowserUtils.waitForVisibility(POSReportingOrders.graphImageElement, 10);
        extentLogger.info("Verifying the graph is displaying");
        Assert.assertTrue(POSReportingOrders.graphImageElement.isDisplayed());

    }


    /*
    Testing pivot view model
     */

    @Test(groups = "ST")
    public void test02() {

        extentLogger.info("Clicking pivot view option");
        POSReportingOrders.pivotElement.click();
        BrowserUtils.waitForVisibility(POSReportingOrders.pivotImageElement, 10);
        extentLogger.info("Verifying the pivot table is displaying");
        Assert.assertTrue(POSReportingOrders.pivotImageElement.isDisplayed());
    }


    /*
    Testing order reports functionality
    from POS manager perspective
    using by Bar Chart under total
    price measure
     */
    @Test
    public void test03() {

        BrowserUtils.wait(5);
        extentLogger.info("Clicking Bar Chart");
        POSReportingOrders.barChart.click();
        BrowserUtils.waitForVisibility(POSReportingOrders.barChartImageElement, 10);
        extentLogger.info("Verifying the Bar Chart Has Displayed");
        Assert.assertTrue(POSReportingOrders.barChartImageElement.isDisplayed());

    }


    /*
    Testing order reports functionality
    from POS manager perspective
    using by Line Chart under total
    price measure
     */


    @Test
    public void test04() {
        BrowserUtils.wait(5);
        extentLogger.info("Clicking Line Chart");
        POSReportingOrders.lineChart.click();
        BrowserUtils.waitForVisibility(POSReportingOrders.lineChartImageElement, 10);
        extentLogger.info("Verifying the Line Char Has Displayed");
        Assert.assertTrue(POSReportingOrders.lineChartImageElement.isDisplayed());
    }



    /*
    Testing order reports functionality
    from POS manager perspective
    using by Pie Chart under
    total price measure and it should not pass
     */

    @Test
    public void test05() {

        BrowserUtils.wait(5);
        extentLogger.info("Clicking Pie Chart");
        POSReportingOrders.pieChart.click();
        BrowserUtils.waitForVisibility(POSReportingOrders.pieChartErrorMessage, 10);
        Assert.assertTrue(POSReportingOrders.pieChartErrorMessage.isDisplayed());
    }


    /*
    Testing Flip Axis view option
    under pivot view model from POS
    manager perpective
     */


    @Test
    public void test06() {
        BrowserUtils.wait(5);
        extentLogger.info("Clicking Flip Axis");
        POSReportingOrders.flipAxis.click();
        BrowserUtils.waitForVisibility(POSReportingOrders.flipAxisImageElement, 10);
        extentLogger.info("Verifying the Flip Axis View Model Has Displayed");
        Assert.assertTrue(POSReportingOrders.flipAxisImageElement.isDisplayed());
    }


    /*
    Testing select different measures
    option from POS manager
    perspective
     */


    @Test
    public void Test07() {
        BrowserUtils.wait(5);
        extentLogger.info("Clicking Measures Drop Down");
        POSReportingOrders.measureTable.click();
        extentLogger.info("Clicking Different Measure Option");
        List<WebElement> options = POSReportingOrders.graphMeasureTable;
        options.get(3).click();
        extentLogger.info("Verifying the measure option has selected");
        Assert.assertTrue(POSReportingOrders.measureOptionText.isDisplayed());

    }


    /*
    Testing select different measures
    option in same time from POS
    manager perspective under pivot
    view option
     */


    @Test
    public void Test08() {
        BrowserUtils.wait(5);
        extentLogger.info("Clicking Pivot View Option");
        POSReportingOrders.pivotElement.click();
        BrowserUtils.waitForVisibility(POSReportingOrders.downloadButton, 100);
        extentLogger.info("Clicking Measures Drop Down");
        POSReportingOrders.measureTable2.click();
        BrowserUtils.wait(5);
        List<WebElement> options = POSReportingOrders.pivotMeasureTable;

        options.get(2).click();
        options.get(3).click();
        List<String> optionsNames = new ArrayList<>();

        optionsNames.add("Total Price");
        optionsNames.add("Product Quantity");
        optionsNames.add("Subtotal w/o discount");
        optionsNames.add("Total Discount");


        for (String option : optionsNames) {

            Assert.assertTrue(POSReportingOrders.pivotImageElement.getText().contains(option));

        }

    }

}

















