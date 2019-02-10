package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.firefox.XpiDriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import java.security.cert.X509Certificate;

public class POSProductPage {

    public POSProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Test1
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div/span[2]/button[2]")
            WebElement NexButtonIcon;
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div/span[2]/button[1]")
            WebElement BackButtonIcon;
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div/span[1]/span[1]")
            WebElement PageNumberValue;
    //Test2
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[2]")
            WebElement ListButtonIcon;
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[1]")
            WebElement CanbanButtonIcon;
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[3]")
            WebElement DisplayInternalReference;
    //Test3
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
            WebElement CreateBox;
    public static @FindBy(xpath = "(//div[@class='o_control_panel o_breadcrumb_full']//ol/li)[1]")
            WebElement TitleVarify;
    public static @FindBy(xpath = "//input[@placeholder='Product Name']")
            WebElement ProductName;
    public static @FindBy(xpath = "//input[@name='barcode']")
            WebElement ProductBarcode ;
    public static @FindBy(xpath = "//div[@name='list_price']/input")
            WebElement ProductSalesPrice;
    public static @FindBy(xpath = "//div[@name='standard_price']/input")
            WebElement ProductsCostPrice;
    //Test4
    public static @FindBy(xpath = "//div[@name='sale_ok']//input[@type='checkbox']")
            WebElement CanBeSold;
    //Test5
    public static @FindBy(xpath = "//select[@name='type']")
            WebElement  ProductTypeDDB;
    //Test6
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[6]/ul/li[4]/a")
            WebElement Purchase;
    public static @FindBy(xpath = "//div[@name='seller_ids']//div[@class='table-responsive']//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody[@class='ui-sortable']//tr//td[@class='o_field_x2many_list_row_add']//a[@href='#'][contains(text(),'Add an item')]")
            WebElement AddAnItem;
    public static @FindBy(xpath = "//span[contains(text(),'Discard')]")
            WebElement Discard;
    //Test7
    public static @FindBy(xpath = "//a[contains(text(),'Invoicing')]")
            WebElement Invocing;
    public static @FindBy(xpath = "//div[@name='invoice_policy']//div[2]//input[1]")
            WebElement RadioButton;
    //Test8
    public static @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]")
            WebElement SaveButton;
    public static @FindBy(xpath = "//div[@class='oe_kanban_global_click o_kanban_record']")
            WebElement CreatedItem;
    //Test9
    public static @FindBy(xpath = "//input[@placeholder='Search...']")
            WebElement SearchBox;
    //Test10
    public static @FindBy(xpath = "//span[@title='Advanced Search...']")
            WebElement AdvancedSearch;
    public static @FindBy(xpath = "//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_control_panel']/div[@class='o_cp_right']/div[@class='btn-group o_search_options']/div[1]/button[1]")
            WebElement Filters;
    public static @FindBy(xpath = "//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_control_panel']/div[@class='o_cp_right']/div[@class='btn-group o_search_options']/div[@class='btn-group hidden-xs o_dropdown']/button[1]")
            WebElement GroupBy;
    public static @FindBy(xpath = "//a[contains(text(),'Add custom group')]")
    WebElement AddCustomGroup;

    public static @FindBy(xpath = "//ul[@class='dropdown-menu o_group_by_menu']//button[@type='button'][contains(text(),'Apply')]")
    WebElement Apply;


}
