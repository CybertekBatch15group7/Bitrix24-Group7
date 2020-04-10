package com.bitrix24.tests;

import com.bitrix24.pages.ActivityStream.LoginPage;
import com.bitrix24.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends AbstractBaseTest{
    @Test
    public void verifyPageTitle(){
        //test --> ExtentTest object
        //we must add to every test at the beginning
        //test = report.createTest("Test name");
        extentTest = extentReports.createTest("Verify page title");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Assert.assertEquals(Driver.getDriver().getTitle(), "(1) Portal");
        //if assertion passed, it will set test status in report to passed
        extentTest.pass("Page title Portal was verified");
    }

}
