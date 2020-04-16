package com.bitrix24.tests;

import com.bitrix24.pages.HomePage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkflowDirectoryPageTest extends AbstractBaseTest{

    @Test
    public void verifyHelpDeskAccess(){
        test = report.createTest("Verify warning message for help desk");

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.login(ConfigurationReader.getProperty("helpdesk37"),ConfigurationReader.getProperty("password"));
        homePage.clickOnMore();
        homePage.clickOnWorkflow();
        homePage.clickOnWorkflowDirectory();

        String popup = Driver.getDriver().findElement(By.xpath("//span[@class='bx-lists-alert-text']")).getText();
        String expected = "No access";

        Assert.assertEquals(popup, expected);

        test.pass("Warning message was verified for help desk");

    }

    @Test
    public void verifyMarketingAccess(){
        test = report.createTest("Verify warning message for marketing");

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.login();
        homePage.clickOnMore();
        homePage.clickOnWorkflow();
        homePage.clickOnWorkflowDirectory();

        String popup = Driver.getDriver().findElement(By.xpath("//span[@class='bx-lists-alert-text']")).getText();
        String expected = "No access";

        Assert.assertEquals(popup, expected);

        test.pass("Warning message was verified for marketing");

    }

    @Test
    public void verifyHRAccess(){
        test = report.createTest("Verify warning message for marketing");

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.login(ConfigurationReader.getProperty("hr37"),ConfigurationReader.getProperty("password"));
        homePage.clickOnMore();
        homePage.clickOnWorkflow();
        homePage.clickOnWorkflowDirectory();

        String popup = Driver.getDriver().findElement(By.xpath("//span[@class='bx-lists-alert-text']")).getText();
        String expected = "No access";

        Assert.assertEquals(popup, expected);

        test.pass("Warning message was verified for marketing");

    }

}
