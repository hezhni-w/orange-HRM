package com.ohm.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {
    private final WebDriver driver;

    public TopMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "span.oxd-userdropdown-tab")
    private WebElement userDropdown;

    @FindBy(xpath = "//a[text()='About']")
    private WebElement about;

    @FindBy(xpath = "//a[text()='Support']")
    private WebElement support;

    @FindBy(xpath = "//a[text()='Change Password']")
    private WebElement changePassword;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logout;

    public void clickUserDropdown() {
        userDropdown.click();
    }
    public void clickAbout() {
        about.click();
    }
    public void clickSupport() {
        support.click();
    }
    public void clickChangePassword() {
        changePassword.click();
    }
    public void clickLogout() {
        logout.click();
    }


}
