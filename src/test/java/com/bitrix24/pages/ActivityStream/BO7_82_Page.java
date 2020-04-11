package com.bitrix24.pages.ActivityStream;

import com.bitrix24.pages.AbstractBasePage;
import com.bitrix24.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BO7_82_Page extends AbstractBasePage {

    @FindBy(id="feed-add-post-form-tab-message")
    private WebElement messageElement;

    @FindBy(id="bx-b-uploadfile-blogPostForm")
    private WebElement uploadFileIconElement;

    @FindBy(xpath="//a[@id='bx-destination-tag']")
    private WebElement addMoreElement;

    @FindBy(linkText = "E-mail users")
    private WebElement emailUsersElement;

    @FindBy(linkText = "Employees and departments")
    private WebElement emplAndDeptsElement;

    @FindBy(linkText = "Recent")
    private WebElement recentElement;

    public void clickOnMessage(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(messageElement)).click();
    }

    public void clickOnUploadFile(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(uploadFileIconElement)).click();
        BrowserUtilities.wait(5);
    }

    public void clickOnAddMore(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(addMoreElement)).click();
        // hover over contact lists
        actions.moveToElement(emailUsersElement).pause(3000).
                moveToElement(emplAndDeptsElement).pause(3000).moveToElement(recentElement).build().perform();
    }
}
