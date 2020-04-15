package com.bitrix24.myTestspractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class Tests {

    private WebDriver driver;


    @BeforeMethod
    public void setup(){
        driver.get("http://login1.nextbasecrm.com");
        driver.manage().window().maximize();

    }
}
