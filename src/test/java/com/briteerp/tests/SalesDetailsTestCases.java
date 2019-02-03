package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SalesDetailsTestCases extends TestBase {

    SalesDetailsTestCases() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void st1() {
        new SalesDetailsTestCases();
        new EnvironmentPage();
        new POSHomePage();
        new HomePage();
    }



    @Test
    public void test01() throws InterruptedException {
        // user story BRIT-1492
        //test case BRIT-1698, i should be able to print the sales details page.

        EnvironmentPage.selectEnvironment();
        Assert.assertTrue(LoginPage.currentTitle.contains("Login"));
        LoginPage.login();
        Thread.sleep(5000);
        Assert.assertTrue(HomePage.currentTitle.contains("Inbox"));
        Thread.sleep(5000);
        HomePage.pointOfSaleElement.click();
        Thread.sleep(5000);
        POSHomePage.reportingSalesDetailsElement.click();
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        SalesDetailsPage.PrintElement.click();
        Thread.sleep(5000);
        Assert.assertTrue(SalesDetailsPage.AfterPrintedPageElement.isDisplayed());









    }


    @Test
    public void test02() throws InterruptedException {

      // user story BRIT-1488
        // test case  BRIT-1710
        //i should be able to delete the point of sales name from seles details page.


        EnvironmentPage.selectEnvironment();
        Assert.assertTrue(LoginPage.currentTitle.contains("Login"));
        LoginPage.login();
        Thread.sleep(5000);
        Assert.assertTrue(HomePage.currentTitle.contains("Inbox"));
        Thread.sleep(5000);
        HomePage.pointOfSaleElement.click();
        Thread.sleep(5000);
        POSHomePage.reportingSalesDetailsElement.click();
        Thread.sleep(5000);
        SalesDetailsPage.SalesDetailsPage.click();
        Thread.sleep(5000);
        SalesDetailsPage.DeleteElement.click();
        Thread.sleep(5000);
        Assert.assertTrue(SalesDetailsPage.AfterDeletedPageElement.isDisplayed());













    }

    }