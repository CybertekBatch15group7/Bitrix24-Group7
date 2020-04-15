package com.bitrix24.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.bitrix24.utilities.BrowserUtilities;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public abstract class AbstractBaseTest {
    protected WebDriverWait wait;
    protected Actions actions;
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest test;

    //@Optional - to make parameter optional
    //if you don't specify it, testng will require to specify this parameter for every test, in xml runner
    @BeforeTest
    @Parameters("reportName")
    public void setupTest(@Optional String reportName){
        System.out.println("Report name: " + reportName);
        reportName= reportName ==null? "report.html" : reportName + ".html";
        report = new ExtentReports();

        String reportPath="";
        //location of report file
        if(System.getProperty("os.name").toLowerCase().contains("win")){
            reportPath= System.getProperty("user.dir")+"\\test-output\\" + reportName;
        }else{
            reportPath= System.getProperty("user.dir")+"/test-output/" + reportName;
        }
        //is HTML report itself
        htmlReporter = new ExtentHtmlReporter(reportPath);
        //add it to the reported
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("CRM 24 Automation");
    }

    @AfterTest
    public void afterTest(){
        report.flush();//to release a report
    }

    @BeforeMethod
    public void setup(){
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(), 15);
        actions = new Actions(Driver.getDriver());
    }

    @AfterMethod
    public void teardown(ITestResult iTestResult)throws IOException {
        //ITestResult class describes the result of a test
        //if test failed take a screenshot
        if(iTestResult.getStatus()==ITestResult.FAILURE){
            //screenshot will have a name of the test
            String screenshotPath= BrowserUtilities.getScreenshot(iTestResult.getName());
            test.fail(iTestResult.getName());//attach test name that failed
            BrowserUtilities.wait(2);
            test.addScreenCaptureFromPath(screenshotPath, "Failed");//attach screenshot

            test.fail(iTestResult.getThrowable());//attach console output
        }
        BrowserUtilities.wait(1);
        Driver.closeDriver();
    }
}
