package com.bitrix24.tests.activity_Stream_002;

import com.bitrix24.pages.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 6. User should be able to attach link by clicking on the link icon.

public class activity_Stream_06 extends AbstractBasePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String nextbasecrmLoginURL = "https://login1.nextbasecrm.com/";


        driver.manage().window().maximize();
        driver.get(nextbasecrmLoginURL);
        // Logging in
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk37@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.cssSelector("#login-popup > form > div.log-popup-footer > input")).click();
        Thread.sleep(1000);
        // Clicking on send message box
        driver.findElement(By.cssSelector("#microoPostFormLHE_blogPostForm_inner > span.feed-add-post-micro-title")).click();
        Thread.sleep(1000);
        // Link Icon
        driver.findElement(By.cssSelector("#bx-b-link-blogPostForm > span > i")).click();
        // Attaching and saving link
        driver.findElement(By.cssSelector("#linkidPostFormLHE_blogPostForm-href")).sendKeys("https://www.google.com/");
        driver.findElement(By.cssSelector("#undefined")).click();
        // Sending Link on Activity Stream
        driver.findElement(By.cssSelector("#blog-submit-button-save")).click();

        Thread.sleep(1000);
        driver.quit();
        
    }
}
