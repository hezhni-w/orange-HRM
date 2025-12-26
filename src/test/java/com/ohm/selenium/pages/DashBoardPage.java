package com.ohm.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoardPage {
    @FindBy(xpath = "//h6")
    private WebElement title;

    private WebDriver webDriver;
    private WebDriverWait wait;

    public DashBoardPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(30));
    }

    public String getTitle() {
        wait.until(ExpectedConditions.visibilityOf(title));
        return title.getText();
    }
}
