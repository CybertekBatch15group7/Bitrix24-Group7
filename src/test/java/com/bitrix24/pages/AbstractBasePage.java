package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtilities;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * We need to create a new AbstractBasePage for this specific app, the existing works only for WebOrders. So far,
 * what I found that we can create navigateTo method for user stories 1 through
 * 8 using the locator //span[text()='" + component + "']
 * As a component we are using the tab we need to work on. The only ones left we need to create separate locators for #9 Filter and Search
 * and for #10 and 11 I am not sure wha to create
 */

public abstract class AbstractBasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);

    @FindBy(css = "a[id='logo_24_a']")
    protected WebElement pageLogo;

    @FindBy(xpath = "/html/head/title")
    protected WebElement pageTitle;

    public String getPageTitleText(){
        BrowserUtilities.waitForPageToLoad(10);
        return pageTitle.getText().trim();
    }

    public String getPageLogoText() {
        return pageLogo.getText();
    }

    public AbstractBasePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Specify component name as a parameter to move through the tabs on the top of the page:
     * components: MESSAGE(UserStory#1), TASK(UserStory#2), EVENT(UserStory#3), POLL(UserStory#4),
     * MORE: File(UserStory#5), Appreciation(UserStory#6), Announcement(UserStory#7), Workflow(UserStory#8)
     * @param component
     */
    public void navigateTo(String component) {
        String locator = "//span[text()='" + component + "']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
    }

}