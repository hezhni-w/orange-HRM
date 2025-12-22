package com.ohm.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        //Initialising the page elements
        PageFactory.initElements(driver,this);

    }
    public LoginPage typeUsername(String username) {
        usernameField.sendKeys(username);
        return this;

    }

    public LoginPage typePassword(String password){
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
        usernameField.clear();
        return this;
    }

    public LoginPage clearPassword(){
        passwordField.clear();
        return this;
    }

    public void clearUsernameAndPassword(){
        clearUsername().clearPassword();
    }

}
