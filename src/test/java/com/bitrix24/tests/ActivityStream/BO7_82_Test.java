package com.bitrix24.tests.ActivityStream;

import com.bitrix24.pages.ActivityStream.BO7_82_Page;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.tests.AbstractBaseTest;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BO7_82_Test extends AbstractBaseTest {
    @Test
    public void uploadFileIconClickedTest(){ // AC-1
        //test --> ExtentTest object
        //we must add to every test at the beginning
        //test = report.createTest("Test name");
        extentTest = extentReports.createTest("Verify upload File Icon is clicked");
        LoginPage loginPage = new LoginPage();
        BO7_82_Page bo7_82_page = new BO7_82_Page();
        loginPage.login();
        bo7_82_page.clickOnMessage();
        bo7_82_page.clickOnUploadFile();

        WebElement element = driver.findElement(
                By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[4]"));
        Assert.assertTrue(element.isDisplayed());
        //if assertion passed, it will set test status in report to passed
        extentTest.pass("UploadFile icon clicked was verified");
    }

    @Test
    public void addMoreFromContactLists(){ // AC - 2
        extentTest = extentReports.createTest("Verify upload File Icon is clicked");
        LoginPage loginPage = new LoginPage();
        BO7_82_Page bo7_82_page = new BO7_82_Page();
        loginPage.login();
        bo7_82_page.clickOnMessage();
        bo7_82_page.clickOnAddMore();
        Assert.assertTrue(driver.findElement(
                By.xpath("//div[@class='bx-finder-box bx-finder-box-vertical bx-lm-box bx-lm-socnet-log-destination']")).isDisplayed());
        //if assertion passed, it will set test status in report to passed
        extentTest.pass("UploadFile icon clicked was verified");
    }
}
