package com.bitrix24.tests.activity_Stream_002;

import com.bitrix24.pages.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 3. User should be able to click on upload files icon to upload files
// and pictures from local disks, download from external drive,
// select documents from bixtrix24, and create files to upload.

public class activity_Stream_03 extends AbstractBasePage {
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
        //Upload Icone
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[3]/div[2]/span[1]")).click();
        Thread.sleep(1000);
        // Upload files and images
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div/span/span/span[2]"));
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div/span/span/span[1]/span")).getText());
        Thread.sleep(1000);
        // Select document from Bitrix24
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[3]/span/span/span[1]/span")).click();
        Thread.sleep(1000);
        // Cancel
        driver.findElement(By.xpath("//*[@id=\'DiskFileDialog\']/span")).click();
        Thread.sleep(1000);
        // Download from external drive
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[1]/span/span/span[1]/span")).click();
        Thread.sleep(1000);
        // Cancel
        driver.findElement(By.xpath("//*[@id=\'DiskFileDialog\']/span")).click();
        driver.quit();
        
    }
}
