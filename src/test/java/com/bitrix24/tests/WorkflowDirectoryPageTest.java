package com.bitrix24.tests;

import com.bitrix24.pages.HomePage;
import com.bitrix24.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkflowDirectoryPageTest extends AbstractBaseTest{

    @Test
    public void verifyHelpDeskAccess(){

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.login();
        homePage.clickOnMore();
        homePage.clickOnWorkflow();
        homePage.clickOnWorkflowDirectory();

        String popup = driver.findElement(By.xpath("div[@id='menu-popup-lists']")).getText();
        String expected = "No access";

        Assert.assertEquals(popup, expected);

    }

}
