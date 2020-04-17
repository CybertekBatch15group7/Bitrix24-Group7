package com.bitrix24.tests.activity_Stream_002;

import com.bitrix24.pages.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 4. User should be able to create a quote by clicking on the Comma icon.

public class activity_Stream_04 extends AbstractBasePage {
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
        // Clicking on send message box
        driver.findElement(By.cssSelector("#microoPostFormLHE_blogPostForm_inner > span.feed-add-post-micro-title")).click();
        Thread.sleep(1000);
        //Quote Icon
        driver.findElement(By.xpath("//*[@id=\'bx-b-quote-blogPostForm\']/span/i")).click();
        Thread.sleep(1000);
        // Enter Text into Quote Icon text box
        // I cannot get this to print in desired box
        driver.findElement(By.xpath("/html/body/blockquote")).click();
        driver.findElement(By.xpath("/html/body/blockquote")).sendKeys("Testing, Testing 1 2 3");
        Thread.sleep(1000);

        driver.quit();
        
    }
}
