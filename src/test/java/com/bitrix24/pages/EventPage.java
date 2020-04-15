package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class EventPage extends AbstractBasePage{


    @FindBy(css = "span[id='bx-b-uploadfile-blogPostForm_calendar']")
    private WebElement uploadFiles;

    @FindBy(css = "span[id='bx-b-link-blogPostForm_calendar']")
    private WebElement uploadLink;

    @FindBy (css = "span[id='bx-b-video-blogPostForm_calendar']")
    private WebElement insertVideo;

    @FindBy (css = "span[id='bx-b-quote-blogPostForm_calendar']")
    private WebElement quoteText;

    @FindBy (xpath = "//span[@id='lhe_button_editor_blogPostForm_calendar']")
    private WebElement visualEditor;

    @FindBy (id = "bx-html-editor-tlbr-oCalEditorcal_3Jcl")
    public WebElement textBar;


    @FindBy (css = "input[name='EVENT_LOCATION']")
    private WebElement eventLocation;

    @FindBy (id="bx-b-uploadfile-blogPostForm_calendar")
    private WebElement uploadFileButton;

    @FindBy (name="bxu_files[]")
    private WebElement uploadFilesAndImages;

    @FindBy (xpath = "(//span[text()='Select document from Bitrix24'])[3]")
    private WebElement selectDocumentFromBitrix24;

    @FindBy(xpath ="//span[text()='Select document']")
    private WebElement submitButton;


    /*

        driver.findElement(By.id("bx-b-uploadfile-blogPostForm_calendar")).click();
        BrowserUtilities.wait(2);
        driver.findElement(By.name("bxu_files[]")).sendKeys(System.getProperty("user.dir")+"/pom.xml");
        BrowserUtilities.wait(2);
     */

   public void clickOnVisualEditor(){
       BrowserUtilities.waitForPageToLoad(10);
       wait.until(ExpectedConditions.visibilityOf(visualEditor)).click();
       BrowserUtilities.wait(3);

   }

    public boolean textBarIsDisplayed(){
        BrowserUtilities.waitForPageToLoad(10);
        return textBar.isDisplayed();
    }

    public void clickOnEventLocation(){
        BrowserUtilities.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(eventLocation)).click();
        BrowserUtilities.wait(3);

    }

    public boolean selectEventLocation(){
        BrowserUtilities.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(eventLocation)).click();
        BrowserUtilities.wait(3);
        return eventLocation.isEnabled();

    }

    public void clickOnUploadFile(){
       BrowserUtilities.waitForPageToLoad(20);
       wait.until(ExpectedConditions.visibilityOf(uploadFileButton)).click();
       BrowserUtilities.wait(3);
    }

    public void uploadFilesAndImages (String fileName){
       BrowserUtilities.waitForPageToLoad(20);
       uploadFilesAndImages.sendKeys(System.getProperty("user.dir")+ "/" + fileName);
       BrowserUtilities.wait(3);

    }


    public void clickSelectDocument(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(selectDocumentFromBitrix24)).click();
        BrowserUtilities.wait(3);
    }

    public void selectDocument(String documentName){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='" + documentName+ "']")))).click();
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.visibilityOf(submitButton)).click();
    }
}
