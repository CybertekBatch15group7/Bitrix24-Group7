package com.bitrix24.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test {
    private WebDriver driver;

    @org.testng.annotations.Test
    public void login() {
       driver.get("https://login1.nextbasecrm.com/auth/?backurl=%2Fstream%2F");
       driver.findElement(By.cssSelector("input[type='text")).sendKeys("helpdesk1@cybertekschool.com");
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("UserUser");
    driver.findElement(By.cssSelector("input[type='submit']")).click();

    }
    @BeforeMethod
    public void setup()  {
        WebDriverManager.chromedriver().version("79").setup();
        //INTERVIEW QUESTION: HOW TO HANDLE SSL ISSUES IN SELENIUM?
        //ChromeOptions - use to customize browser for tests
        ChromeOptions chromeOptions = new ChromeOptions();
        //to ignore "Your connection is not private issue"
        chromeOptions.setAcceptInsecureCerts(true);
        //provide chromeOptions object into chromedriver constructor
        driver = new ChromeDriver(chromeOptions);

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
