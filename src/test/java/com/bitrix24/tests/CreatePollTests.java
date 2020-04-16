package com.bitrix24.tests;

import com.bitrix24.pages.CreatePollPage;
import com.bitrix24.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePollTests extends AbstractBaseTest {
    CreatePollPage createPollPage = new CreatePollPage();

    @Test
    public void login() {
        String userName = ConfigurationReader.getProperty("username");
        String passwordName = ConfigurationReader.getProperty("password");
extentTest=extentReports.createTest("Verify logo");
        createPollPage.login(userName, passwordName);

            createPollPage.navigateToPoll();

        createPollPage.clickUploadBtn();


        createPollPage.clickSelectDoc();

        createPollPage.chosenFiletoUpl();

        createPollPage.selectBtn();
        createPollPage.selectEmployerList();
        createPollPage.addMore();
    createPollPage.addAllEmplyers();
    createPollPage.employersDepartments();
//    createPollPage.addEmailUser();
        createPollPage.clickLinkBtn();
        createPollPage.insertVideo();
createPollPage.clickSendBtn();
        Assert.assertEquals(createPollPage.logoNameGetText(),"Activity Stream");
        extentTest.pass("Logo verified!You have clicked Create the poll sucessfully");


 }}
//      extentTest = extentReports.createTest("Verify page logo");
//
//        LoginPage loginPage = new LoginPage();
//        loginPage.login();
//        assertEquals(loginPage.getPageLogoText(), "Web Orders");
//
//        extentTest.pass("Logo verified!");
//    }
//}