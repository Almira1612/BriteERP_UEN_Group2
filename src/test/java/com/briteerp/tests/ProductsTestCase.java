package com.briteerp.tests;

import com.briteerp.pages.*;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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

        Driver.getDriver().manage().window().maximize();

        //Login and verify the pages
        extentLogger = report.createTest("Verify created new point of sale can be saved");
        extentLogger.info("Selecting the environment");
        EnvironmentPage.selectEnvironment();
        extentLogger.info("Verifying the title contain Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        extentLogger.info("Entering valid user credentials and click login");
        LoginPage.login();
        Thread.sleep(10000);
        extentLogger.info("Verifying the title contains Inbox");
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        extentLogger.info("Clicking the PointofSale module");
        HomePage.pointOfSaleElement.click();
        Thread.sleep(8000);
        extentLogger.info("Verifying the title contains Point of Sale");
        Assert.assertTrue(driver.getTitle().contains("Point of Sale"));
        Thread.sleep(4000);
        extentLogger.info("Clicking the Products under Catalog");
        POSHomePage.catalogProductsElement.click();
        Thread.sleep(8000);
        extentLogger.info("Verifying the title contains Products");
        Assert.assertTrue(driver.getTitle().contains("Products"));

    }
    @Test(groups = "ST")
    //Verify that next page and back page functions work fine
    public void Test1() throws InterruptedException {
        extentLogger.info("Click the next button icon");
        POSProductPage.NexButtonIcon.click();
        Assert.assertEquals(POSProductPage.PageNumberValue.getText(),"81-160");
        Thread.sleep(5000);

        extentLogger.info("Click back button to go back previous page");
        POSProductPage.BackButtonIcon.click();
        Assert.assertEquals(POSProductPage.PageNumberValue.getText(),"1-80");
        Thread.sleep(3000);

    }
    @Test(groups = "ST")
    //Verify that list and canban functions work fine
    public void Test2() throws InterruptedException{
        extentLogger.info("Clicking list button icon on top right corner");
        POSProductPage.ListButtonIcon.click();
        Assert.assertTrue(POSProductPage.DisplayInternalReference.isDisplayed());
        Thread.sleep(5000);

        extentLogger.info("Clicking canban button icon on top right corner");
        POSProductPage.CanbanButtonIcon.click();
        Assert.assertNotEquals(POSProductPage.DisplayInternalReference.isDisplayed(), false);
        Thread.sleep(5000);
    }
    @Test(groups = "ST")
    //Verify that Product Name, Barcode, Sales Price, Cost boxes should be able to clickable and typeble
    public void Test3() throws InterruptedException {
        extentLogger.info("Clicking Create box");
        POSProductPage.CreateBox.click();
        Thread.sleep(3000);
        extentLogger.info("After clicking verify that create page title should display");
        Assert.assertTrue(POSProductPage.TitleVarify.isDisplayed());


        extentLogger.info("Typing a product name: ");
        POSProductPage.ProductName.sendKeys("Airpods");
        Thread.sleep(2000);
        Assert.assertTrue(POSProductPage.ProductName.isDisplayed());

//        extentLogger.info("Typing the product  barcode:");
//        POSProductPage.ProductBarcode.sendKeys("72544995533");
//        Thread.sleep(2000);
//        Assert.assertTrue(POSProductPage.ProductBarcode.isDisplayed());

        extentLogger.info("Typing the product sales price:");
        POSProductPage.ProductSalesPrice.click();
        POSProductPage.ProductSalesPrice.clear();
        POSProductPage.ProductSalesPrice.sendKeys("159.0");
        Thread.sleep(2000);
        Assert.assertTrue(POSProductPage.ProductSalesPrice.isDisplayed());

        extentLogger.info("Typing the product cost price:");
        POSProductPage.ProductsCostPrice.click();
        POSProductPage.ProductsCostPrice.clear();
        POSProductPage.ProductsCostPrice.sendKeys("79.0");
        Thread.sleep(3000);
        Assert.assertTrue(POSProductPage.ProductSalesPrice.isDisplayed());

    }
    @Test
    public void Test4() throws InterruptedException {
        //Verify Can be Sold check box function works fine
        extentLogger.info("Clicking Create box");
        POSProductPage.CreateBox.click();
        Thread.sleep(3000);
        extentLogger.info("After clicking verify that create page title should display");
        Assert.assertTrue(POSProductPage.TitleVarify.isDisplayed());

        extentLogger.info("Clicking Can be sold checkbox under product name box");
        POSProductPage.CanBeSold.click();
        Thread.sleep(2000);
        extentLogger.info("Verify that checked box is uncheck");
        Assert.assertFalse(POSProductPage.CanBeSold.isSelected());


        extentLogger.info("Re-Clicking Can be sold checkbox under product name box");
        POSProductPage.CanBeSold.click();
        Thread.sleep(2000);
        extentLogger.info("Verify that uncheck box is now checked");
        Assert.assertTrue(POSProductPage.CanBeSold.isSelected());

    }
    @Test
    public void Test5() throws InterruptedException{
        extentLogger.info("Clicking Create box");
        POSProductPage.CreateBox.click();
        Thread.sleep(3000);
        extentLogger.info("After clicking verify that create page title should display");
        Assert.assertTrue(POSProductPage.TitleVarify.isDisplayed());

        extentLogger.info("Creating an select method with xpath for Product Type dropdown");
        Select dropdownBox = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='type']")));

        extentLogger.info("getting first defult one from drop down");
        dropdownBox.getFirstSelectedOption();
        Assert.assertTrue(dropdownBox.getFirstSelectedOption().isDisplayed());

        extentLogger.info("getting consumable from drop down");
        dropdownBox.selectByValue("\"consu\"");
        Thread.sleep(2000);
        extentLogger.info("getting service from drop ]down");
        dropdownBox.selectByValue("\"service\"");
        Thread.sleep(2000);
        extentLogger.info("getting stockable product from drop down");
        dropdownBox.selectByValue("\"product\"");
        Thread.sleep(3000);

    }
    @Test
    public void Test6() throws InterruptedException {
        extentLogger.info("Clicking Create box");
        POSProductPage.CreateBox.click();
        Thread.sleep(3000);
        extentLogger.info("After clicking verify that create page title should display");
        Assert.assertTrue(POSProductPage.TitleVarify.isDisplayed());

        extentLogger.info("Clicking Purchase section");
        POSProductPage.Purchase.click();
        Thread.sleep(2000);
        Assert.assertTrue(POSProductPage.Purchase.isDisplayed());

        extentLogger.info("Clicking Add an item from vendor list");
        POSProductPage.AddAnItem.click();
        Thread.sleep(2000);
        Assert.assertTrue(POSProductPage.AddAnItem.isDisplayed());

        extentLogger.info("clicking Discard/cancel box");
        POSProductPage.Discard.click();
        Thread.sleep(2000);
        Assert.assertTrue(POSProductPage.AddAnItem.isDisplayed());

    }
    @Test
    public void Test7() throws InterruptedException {
        extentLogger.info("Clicking Create box");
        POSProductPage.CreateBox.click();
        Thread.sleep(3000);
        extentLogger.info("After clicking verify that create page title should display");
        Assert.assertTrue(POSProductPage.TitleVarify.isDisplayed());

        extentLogger.info("Click Invocing section of the page");
        POSProductPage.Invocing.click();
        Thread.sleep(3000);
        Assert.assertTrue(POSProductPage.Invocing.isDisplayed());

        extentLogger.info("Click any radio button to select option");
        POSProductPage.RadioButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(POSProductPage.RadioButton.isSelected());

    }
    @Test
    public void Test8() throws InterruptedException {
        Test3();

        extentLogger.info("Click save button after filling out all the informations about the product");
        POSProductPage.SaveButton.click();
        Thread.sleep(5000);
        Assert.assertTrue(POSProductPage.SaveButton.isDisplayed());

        extentLogger.info("Clicking the Products under Catalog");
        POSHomePage.catalogProductsElement.click();
        Thread.sleep(5000);
        extentLogger.info("Verifying the title contains Products");
        Assert.assertTrue(driver.getTitle().contains("Products"));
        Thread.sleep(5000);

        extentLogger.info("clicking the search box and enter the product name that we just created");
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Airpods"+ Keys.ENTER);
        Thread.sleep(5000);
        Assert.assertTrue(POSProductPage.CreatedItem.isDisplayed());
        Thread.sleep(2000);
    }
    @Test
    public void Test9() throws InterruptedException {
        extentLogger.info("On search box type a existing item name");
        String proName1="Iphone 8", proName2="eye glass";
        POSProductPage.SearchBox.sendKeys(proName1 + Keys.ENTER);
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_content']/div[@class='o_view_manager_content']/div/div[@class='o_kanban_view o_kanban_ungrouped']/div[1]")).isDisplayed());

        extentLogger.info("Create an xpath for the entered existed item then click x to Clear the search box");
        WebElement iphoneXpath = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]"));
        iphoneXpath.click();
        Thread.sleep(3000);
        extentLogger.info("Now type a new item name that does not exist in product page");
        POSProductPage.SearchBox.sendKeys(proName2+Keys.ENTER);
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oe_view_nocontent_create']")).isDisplayed());

    }@Test
    public void Test10() throws InterruptedException {
        extentLogger.info("Click the advance search box inside the search box");
        POSProductPage.AdvancedSearch.click();
        Thread.sleep(3000);
        Assert.assertTrue(POSProductPage.AdvancedSearch.isDisplayed());

        extentLogger.info("Click the Filter dropdown list");
        POSProductPage.Filters.click();
        Thread.sleep(3000);
        Assert.assertTrue(POSProductPage.Filters.isDisplayed());

        extentLogger.info("Click Can be Sold from Filter dropdown list");
        driver.findElement(By.xpath("//a[contains(text(),'Can be Sold')]")).click();
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Can be Sold')]")).isDisplayed());

        extentLogger.info("Now clicking Group By dropdown list");
        POSProductPage.GroupBy.click();
        Thread.sleep(3000);
        Assert.assertTrue(POSProductPage.GroupBy.isDisplayed());

        extentLogger.info("Click Add Custom Group from Group By dropdown list");
        POSProductPage.AddCustomGroup.click();
        Assert.assertTrue(POSProductPage.AddCustomGroup.isDisplayed());

        extentLogger.info("Clicking Apply box underneath the add custom group");
        POSProductPage.Apply.click();
        Assert.assertTrue(POSProductPage.Apply.isDisplayed());





    }
}
