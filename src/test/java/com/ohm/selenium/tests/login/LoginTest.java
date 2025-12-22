package com.ohm.selenium.tests.login;

import com.ohm.selenium.TestBase;
import com.ohm.selenium.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testWithValidCredentials() {


        //Creating instance of Login Pg
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.typeUsername("Admin");
        loginpage.typePassword("admin123");
        loginpage.clickLoginButton();

        // ProductPage productPage = new ProductPage(driver);
        // Assert.assertEquals(productPage.getTitle(), "products");
    }


    @Test
    public void testInvalidMethod() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Creating instance of Login Pg
        LoginPage loginpage = new LoginPage(driver);
        loginpage.typeUsername("");
        loginpage.typePassword("");
        loginpage.clickLoginButton();

        String actualError = loginpage.getErrorMessageUsername();
        Assert.assertEquals(actualError, "required");
        driver.close();


    }


    @Test
    public void testLoginWithValidCredential() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.saucedemo.com/");


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String actualURL = driver.getCurrentUrl();
        // Assert.assertEquals(actualURL, "https://www.saucedemo.com/inventory.com", " Expected URL is not coming");


    }
}
