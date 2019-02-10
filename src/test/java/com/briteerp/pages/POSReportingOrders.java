package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POSReportingOrders {

    public POSReportingOrders() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-bar-chart o_cp_switch_graph active']")
    WebElement graphElement;

    public static @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-table o_cp_switch_pivot']")
    WebElement pivotElement;

    public static @FindBy(xpath = "//div[@class='o_graph']")
    WebElement graphImageElement;

    public static @FindBy(xpath = "//div[@class='o_view_manager_content']")
    WebElement pivotImageElement;

    public static @FindBy(xpath = "//button[@class='btn btn-default fa fa-bar-chart-o o_graph_button active']")
    WebElement barChart;


    public static @FindBy(xpath = "//*[@class='nvd3 nv-wrap nv-multiBarWithLegend']")
    WebElement barChartImageElement;


    public static @FindBy(xpath = "//button[@class='btn btn-default fa fa-line-chart o_graph_button']")
    WebElement lineChart;


    public static @FindBy(xpath = "//*[@class='nvd3 nv-wrap nv-lineChart']")
    WebElement lineChartImageElement;


    public static @FindBy(xpath = "//button[@class='btn btn-default fa fa-pie-chart o_graph_button']")
    WebElement pieChart;


    public static @FindBy(xpath = "(//div[@class='oe_view_nocontent']/p)[2]")
    WebElement pieChartErrorMessage;


    public static @FindBy(xpath = "btn btn-default fa fa-expand o_pivot_flip_button")
    WebElement flipAxis;


    public static @FindBy(xpath = "(//*[@class='o_pivot_measure_row text-muted hidden-xs'])[6]")
    WebElement flipAxisImageElement;


    public static @FindBy(xpath = "(//*[@class='btn-group btn-group-sm'])[1]")
    WebElement measureTable;

    public static @FindBy(xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li")
    List<WebElement> graphMeasureTable;

    public static @FindBy(xpath = "//*[@class='nv-legend-text']")
    WebElement measureOptionText;

    public static @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    WebElement measureTable2;

    public static @FindBy(xpath = "//ul[@class='dropdown-menu o_pivot_measures_list']/li")
    List<WebElement> pivotMeasureTable;

    public static @FindBy(xpath = "//button[@class='btn btn-default fa fa-download o_pivot_download']")
    WebElement downloadButton;

}









































