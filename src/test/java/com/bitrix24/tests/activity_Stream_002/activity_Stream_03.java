package com.bitrix24.tests.activity_Stream_002;

import com.bitrix24.pages.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class activity_Stream_03 extends AbstractBasePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String nextbasecrmLoginURL = "https://login1.nextbasecrm.com/";

        driver.manage().window().maximize();
        driver.get(nextbasecrmLoginURL);

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk37@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.cssSelector("#login-popup > form > div.log-popup-footer > input")).click();

        driver.findElement(By.cssSelector("#microoPostFormLHE_blogPostForm_inner > span.feed-add-post-micro-title")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#bx-b-uploadfile-blogPostForm")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'diskuf-selectdialog-rYPOqGg\']/div[2]/table/tbody/tr[1]/td[1]/div/span/span/span[1]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\'diskuf-selectdialog-rYPOqGg\']/div[2]/table/tbody/tr[1]/td[1]/div/span/span/span[1]")).getText());
        Thread.sleep(2000);
        driver.quit();


        
    }
}
