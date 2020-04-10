package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtilities;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name = "USER_LOGIN")
    protected WebElement username;

    @FindBy(name = "USER_PASSWORD")
    protected WebElement password;

    @FindBy(css = "[class'login-btn']")
    protected WebElement login;

    @FindBy(linkText = "Forgot your password?'")
    protected WebElement forgotPassword;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
    }

}
