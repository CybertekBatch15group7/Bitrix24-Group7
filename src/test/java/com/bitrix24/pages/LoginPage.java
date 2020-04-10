package com.bitrix24.pages;

import com.bitrix24.pages.AbstractBasePage;
import com.bitrix24.utilities.BrowserUtilities;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends AbstractBasePage {

    protected WebDriver driver = Driver.getDriver();

    @FindBy(css = "input[name='USER_LOGIN']")
    private WebElement username;

    @FindBy (css = "input[name='USER_PASSWORD']")
    private WebElement password;

    @FindBy (css = "input[type='submit']")
    private WebElement login;

    @FindBy (linkText = "Forgot your password?")
    private WebElement forgotPassword;

    @FindBy (xpath = "/html/head/title")
    private WebElement title;

    @FindBy (css= "[class='errortext']")
    private WebElement warningMessage;


    public LoginPage(){
        //to connect our webdriver, page class and page factory
        //page factory - used to use @FindBy annotations
        //PageFactory - helps to find elements easier
        PageFactory.initElements(Driver.getDriver(), this );
    }

    public String getWarningMessageText(){

        return warningMessage.getText();
    }

    /**
     * Login as specific user
     * @param usernameValue
     * @param passwordValue
     */
    public void login(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    /**
     * Method to login, version #2
     * Login as a default user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("hr37"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.wait(3);
    }
}