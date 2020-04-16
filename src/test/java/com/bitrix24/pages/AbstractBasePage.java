package com.bitrix24.pages;


import com.bitrix24.tests.AbstractBaseTest;
import com.bitrix24.utilities.BrowserUtilities;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class AbstractBasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);


    public void navigateToPoll() {
        driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']/*[1]")).click();
        BrowserUtilities.wait(5);
    }

    public void clickUploadBtn() {
        driver.findElement(By.xpath("//span[@id='bx-b-uploadfile-blogPostForm']")).click();
//        driver.findElement(By.cssSelector("span[class='bx-viewer-btn'")).click();
        BrowserUtilities.wait(5);
    }

    public void clickSelectDoc() {
        driver.findElement(By.cssSelector("body.template-bitrix24.no-paddings.start-page.bitrix24-default-theme:nth-child(2) table.bx-layout-table td.bx-layout-cont table.bx-layout-inner-table.im-bar-mode tr.bx-layout-inner-top-row:nth-child(1) td.bx-layout-inner-center table.bx-layout-inner-inner-table.workarea-transparent.no-all-paddings.no-paddings.pagetitle-toolbar-field-view.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings.no-all-paddings td.bx-layout-inner-inner-cont div.workarea-content-paddings div.feed-wrap div.feed-add-post-block.blog-post-edit div.feed-add-post-form-wrap:nth-child(3) div.feed-add-post:nth-child(3) div.diskuf-files-entity.diskuf-selectdialog.bx-disk:nth-child(8) div.diskuf-extended:nth-child(2) table.diskuf-selector-table.wd-fa-add-file-light-table:nth-child(3) td.wd-fa-add-file-light-cell span.wd-fa-add-file-light span.wd-fa-add-file-light-text span.wd-fa-add-file-light-title > span.wd-fa-add-file-light-title-text.diskuf-selector-link")).click();
        BrowserUtilities.wait(5);
    }

    public void chosenFiletoUpl() {
        driver.findElement(By.linkText("SM-screenshot.pages")).click();
        BrowserUtilities.wait(5);
    }

    public void selectBtn() {
//        driver.findElement(By.cssSelector("span[class='bx-viewer-btn'")).click();
        driver.findElement(By.xpath("//*[@id=\"DiskFileDialog\"]/div[3]/span[1]")).click();
        BrowserUtilities.wait(5);
    }

    public void selectEmployerList() {
        driver.findElement(By.className("feed-add-post-del-but")).click();
        BrowserUtilities.wait(5);
    }

    public void addMore() {
        driver.findElement(By.xpath("//a[@id='bx-destination-tag']")).click();
        BrowserUtilities.wait(5);
    }

    public void addAllEmplyers() {
        driver.findElement(By.xpath("//div[contains(text(),'All employees')]")).click();
        BrowserUtilities.wait(5);
    }

    public void employersDepartments() {
        driver.findElement(By.xpath("//a[@href='#switchTab'][2]")).click();
        BrowserUtilities.wait(3);
        driver.findElement(By.xpath("//div[@class='bx-finder-company-department-children bx-finder-company-department-children-opened']//div[@class='bx-finder-company-department-arrow']")).click();

        BrowserUtilities.wait(3);
//        driver.findElement(By.xpath("//a[@href='#DR130'][1]")).click();
        driver.findElement(By.xpath("//div[@class='bx-finder-company-department-check-arrow']")).click();
        BrowserUtilities.wait(5);
    }
    //the first line works the second does not-smth wrong with the locator
//    public void addEmailUser(){
//        driver.findElement(By.xpath("//a[@href='#switchTab'][3]")).click();
//driver.findElement(By.cssSelector("div[id='bx-lm-box-email-content']")).click();
//}
    //User should be able to attach link by clicking on the link icon.
    public void clickLinkBtn(){
        //I NEED TO CLEAR FRAME FIRST, BE SURE NOTHING IS IN.OTHERWISE IT MAY NOT INSERT VIDEO, BUT CANNOT FIND APPROPRIATE LOCATOR
        //SHOWS THE ERROR SO LEFT THIS PART
//       driver.switchTo().frame("bx-editor-iframe");
//       driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")).clear();
//      driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']//i")).click();
    driver.findElement(By.cssSelector("input[id='linkidPostFormLHE_blogPostForm-text']")).sendKeys("Watch This");
driver.findElement(By.xpath("//input[@id='linkidPostFormLHE_blogPostForm-href']")).sendKeys("https://youtu.be/f8PXvqYpGCM");
driver.findElement(By.cssSelector("input[class='adm-btn-save']")).click();
    }
    //User should be able to insert videos by clicking on the video icon and entering the video URL.
    public void insertVideo(){
driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']//i")).click();
        driver.findElement(By.cssSelector("input[id='video_idPostFormLHE_blogPostForm-source']")).sendKeys("https://youtu.be/f8PXvqYpGCM");
        String actualResult=driver.findElement(By.cssSelector("span[class='bxhtmled-video-error']")).getText();
        String  expectedResult="[FVID404] The video was not found;";
        if (actualResult.equals(expectedResult)){
//          i know its wrong cannot figure out what to do
            driver.findElement(By.xpath("//div[@class='bx-core-adm-dialog-content-wrap adm-workarea bxhtmled-dialog bxhtmled-video-dialog']//input[@id='cancel']")).click();
            System.out.println("The user is not able to insert the video");
        }else{
            driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
            System.out.println("User is able to insert video");
        }


    }
public void clickSendBtn(){
        driver.findElement(By.xpath("//button[@id='blog-submit-button-save']")).click();
        BrowserUtilities.wait(3);
}
    }
