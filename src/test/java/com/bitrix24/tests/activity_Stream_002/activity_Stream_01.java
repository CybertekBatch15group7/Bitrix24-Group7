package com.bitrix24.tests.activity_Stream_002;

import com.bitrix24.pages.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.bitrix24.utilities.Driver;
import com.bitrix24.utilities.BrowserUtilities;


public class activity_Stream_01 extends AbstractBasePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String nextbasecrmLoginURL = "https://login1.nextbasecrm.com/";

        driver.manage().window().maximize();
        driver.get(nextbasecrmLoginURL);

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk37@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.cssSelector("#login-popup > form > div.log-popup-footer > input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"feed-add-post-form-tab-tasks\"]/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("tasks-task-priority-cb")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
