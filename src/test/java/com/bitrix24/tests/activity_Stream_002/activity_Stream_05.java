package com.bitrix24.tests.activity_Stream_002;

import com.bitrix24.pages.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// 5. User should be able to add mention by clicking on the Add mention icon
// and select contacts from the lists provided in dropdown.

public class activity_Stream_05 extends AbstractBasePage {
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
        //Mention Icon
        driver.findElement(By.xpath("//*[@id=\'bx-b-mention-blogPostForm\']")).click();
        Thread.sleep(1000);
        // Employees and department
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[1]/a[2]")).click();
        // Desired contact
        Thread.sleep(1000);
        // Does not click on 'Help'
        driver.findElement(By.xpath(" //a[contains(text(),’U517’)]")).click();
        Thread.sleep(1000);

        driver.quit();
        
    }
}
