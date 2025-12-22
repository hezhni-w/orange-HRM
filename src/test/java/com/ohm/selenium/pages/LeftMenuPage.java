package com.ohm.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenuPage {
    private final WebDriver driver;

    public LeftMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement admin;

    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement pim;

    @FindBy(xpath = "//span[text()='Leave']")
    private WebElement leave;

    @FindBy(xpath = "//span[text()='Time']")
    private WebElement time;

    @FindBy(xpath = "//span[text()='Recruitment']")
    private WebElement recruitment;

    @FindBy(xpath = "//span[text()='My Info']")
    private WebElement myinfo;

    @FindBy(xpath = "//span[text()='Performance']")
    private WebElement performance;

    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement dashboard;

    @FindBy(xpath = "//span[text()='Directory']")
    private WebElement directory;

    @FindBy(xpath = "//span[text()='Maintenance']")
    private WebElement maintenance;

    @FindBy(xpath = "//span[text()='Claim']")
    private WebElement claim;

    @FindBy(xpath = "//span[text()='Buzz']")
    private WebElement buzz;



    public void clickAdmin() {
        admin.click();
    }
    public void clickLeave() {
        leave.click();
    }
    public void clickTime() {
        time.click();
    }
    public void clickRecruitment() {
        recruitment.click();
    }
    public void clickMyInfo() {
        myinfo.click();
    }
    public void clickPerformance() {
        performance.click();
    }
    public void clickDashboard() {
        dashboard.click();
    }
    public void clickDirectory() {
        directory.click();
    }
    public void clickMaintenance() {
        maintenance.click();
    }
    public void clickClaim(){
        claim.click();
    }
    public void clickBuzz(){
        buzz.click();
    }


}
