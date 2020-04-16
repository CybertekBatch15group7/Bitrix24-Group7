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

        // This does not work yet! The Xpath works to print, but not to click.
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div/span/span/span[1]/span")).getText());
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div/span/span/span[1]/span")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div/span/span/span[1]/span")).getText());
        Thread.sleep(2000);
        driver.quit();


        
    }
}
