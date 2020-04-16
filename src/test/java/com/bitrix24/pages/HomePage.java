package com.bitrix24.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AbstractBasePage{

    @FindBy(id = "feed-add-post-form-link-text")
    protected WebElement moreOptions;

    @FindBy(xpath = "//span[@class='menu-popup-item-text'][contains(text(),'Workflow')]")
    protected WebElement workflow;

    @FindBy(xpath = "//span[contains(text(),'Workflows Directory')]")
    protected WebElement workflowDirectory;

    public void clickOnMore(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("feed-add-post-form-link-text")));
        moreOptions.click();
    }

    public void clickOnWorkflow(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='menu-popup-item-text'][contains(text(),'Workflow')]")));
        workflow.click();
    }

    public void clickOnWorkflowDirectory(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Workflows Directory')]")));
        workflowDirectory.click();
    }
}

