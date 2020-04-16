package com.bitrix24.tests;

import com.bitrix24.pages.EventPage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.BrowserUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test003 extends AbstractBaseTest {

    /**
     * UserStory#3 AC#6 User should be able to click on Visual Editor
     * and see th editor text-bar displays on top of the message box
     */
    @Test
    public void visualEditorTest(){
        test=report.createTest("Verify if text bar is displayed");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        EventPage eventPage = new EventPage();
        eventPage.navigateTo("Event");
        eventPage.clickOnVisualEditor();

        Assert.assertTrue(eventPage.textBarIsDisplayed());

        test.pass("Text bar is displayed");
    }

    /**
     * UserStory#3 AC#9 User should be able to select event location from dropdown
     */
    @Test
    public void eventLocationTest(){
        test=report.createTest("Verify that event location can be selected");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        EventPage eventPage = new EventPage();
        eventPage.navigateTo("Event");
        eventPage.clickOnEventLocation();

        Assert.assertTrue(eventPage.selectEventLocation());
        test.pass("Event location options are available");

    }

    /**
     * UserStory#3 AC#1 (part1)
     * User should be able to click on upload files icon to
     * upload files and pictures from local disks
     */
    @Test
    public void uploadFile1(){
        test=report.createTest("Verify that document can be uploaded");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        EventPage eventPage = new EventPage();
        eventPage.navigateTo("Event");
        eventPage.clickOnUploadFile();
        eventPage.uploadFilesAndImages("pom.xml");
        test.pass("File is successfully upload!");
    }

    /**
     * UserStory#3 AC#1 (part2)
     * User should be able to click on upload files icon to
     * upload files and pictures from download from external drive
     */
    @Test
    public void uploadFile2(){
        test=report.createTest("Verify that document from Bitrix24 can be selected and uploaded");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        EventPage eventPage = new EventPage();
        eventPage.navigateTo("Event");
        eventPage.clickOnUploadFile();
        eventPage.clickSelectDocument();
        eventPage.selectDocument("pom.xml");

        test.pass("File is successfully upload!");
    }

}
