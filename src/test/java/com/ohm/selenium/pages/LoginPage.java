package com.ohm.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name="password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='Username']/following::span[1]")
    private WebElement errorMessageUsername;

    @FindBy(xpath = "input[@placeholder='Password']/following::span[1]")
    private WebElement errorMessagePassword;

    @FindBy(css = "p.oxd-alert-content-text")
    private WebElement alertText;

    private final WebDriver driver;
    private WebDriverWait wait;


    public LoginPage(WebDriver driver) {
        this.driver=driver;
        //Initialising the page elements
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));

    }
    public LoginPage typeUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys(username);
        return this;

    }

    public LoginPage typePassword(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessageUsername() {
        return errorMessageUsername.getText();
    }

    public String getErrorMessagePassword(){
        return errorMessagePassword.getText();
    }

    public void login(String username,String password){
        typeUsername(username).typePassword(password).clickLoginButton();
    }

    public LoginPage clearUsername(){
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.clear();
        return this;
    }

    public LoginPage clearPassword(){
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        return this;
    }

    public void clearUsernameAndPassword(){
        clearUsername().clearPassword();
    }

    public String getError() {
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        return alertText.getText();
    }
}
