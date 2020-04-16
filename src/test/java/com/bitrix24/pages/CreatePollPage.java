package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtilities;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.sql.rowset.BaseRowSet;

//User should be able to click on upload files icon to upload files
// and pictures from local disks, download from external drive,
// select documents from bixtrix24, and create files to upload.
public class CreatePollPage extends AbstractBasePage {
    WebDriver driver= Driver.getDriver();

    @FindBy(css="input[type='text']")
    public WebElement userNameSlot;

    @FindBy(css = "input[type='password']")
    public WebElement passwordSlot;

    @FindBy(css = "input[type='submit']")
    public WebElement loginBtn;

//    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']/*[1]")
//    public WebElement pollButton;

//    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
//    public WebElement uploadButton;
                   // //*[@id="diskuf-selectdialog-KgJrDuF"]/div[2]/table/tbody/tr[1]/td[3]/span/span/span[1]/span
    @FindBy(linkText= "Select document from Bitrix24")
    public  WebElement selectDocBtn;

//    @FindBy(linkText = "SM-screenshot.pages")
//    public WebElement chosenFiletoUpl;

//    @FindBy(xpath = "//*[@id=\"DiskFileDialog\"]/div[3]/span[1]")
//    public WebElement selectBtn;

    @FindBy(className = "bx-finder-box-item-t7-name")
    public WebElement allEmplyersBtn;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMore;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;
////div[contains(text(),'All employees')]
    @FindBy(xpath="//div[contains(text(),'All employees')]" )
public WebElement recentEmails;

    @FindBy(className = "bx-finder-box-tab bx-lm-tab-department bx-finder-box-tab-selected")
    public WebElement EmployersDepartments;

    @FindBy(css = "div[id='pagetitle']")
    public WebElement logoName;
    public CreatePollPage(){
        PageFactory.initElements(driver,this);
    }

    public String logoNameGetText() {
        return logoName.getText();
    }

    public void login(String username, String password){
        userNameSlot.clear();
        userNameSlot.sendKeys(username);
        passwordSlot.sendKeys(password);
loginBtn.click();
    }


    public void uploadFile(){
     //   pollButton.click();
//        BrowserUtilities.wait(5);
//        uploadButton.click();
//        BrowserUtilities.wait(5);
//        selectDocBtn.click();
//        BrowserUtilities.wait(5);
//        chosenFiletoUpl.click();
//        selectBtn.click();
//        BrowserUtilities.wait(5);
////        recentEmails.click();
    }
}
