package com.ohm.selenium.tests.login;

import com.ohm.selenium.TestBase;
import com.ohm.selenium.pages.DashBoardPage;
import com.ohm.selenium.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testWithValidCredentials() {
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.typeUsername("Admin");
        loginpage.typePassword("admin123");
        loginpage.clickLoginButton();
        //FIXME: Please add assertion to verify the Dashboard title here
        DashBoardPage dashBoardPage = new DashBoardPage(getDriver());
        Assert.assertEquals(dashBoardPage.getTitle(), "Dashboard");
    }


    @Test
    public void testInvalidPassword() {
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.typeUsername("Admin");
        loginpage.typePassword("adf");
        loginpage.clickLoginButton();

        Assert.assertEquals(loginpage.getError(), "Invalid credentials");
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
