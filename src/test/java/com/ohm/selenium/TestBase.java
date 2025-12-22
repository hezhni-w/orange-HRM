package com.ohm.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    WebDriver driver;
    public final String BROWSER = "chrome";
    public final Boolean HEADLESS = false;

    @BeforeSuite
    public void beforeSuite(){
        //following block will be executed only once
        System.out.println("TestBase.beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        //this will be executed only once after executing all the tests
        System.out.println("TestBase.afterSuite");
    }

    @BeforeMethod
    public void beforeMethod(){

        if(BROWSER.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            if(HEADLESS){
                options.addArguments("--headless");
            }
            driver = new ChromeDriver(options);
        }
        else if(BROWSER.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            if(HEADLESS){
                options.addArguments("--headless");
            }
            driver = new FirefoxDriver(options);
        }
        else if (BROWSER.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            if (HEADLESS){
                options.addArguments("--headless");
            }
            driver = new EdgeDriver(options);
        }
        else if (BROWSER.equalsIgnoreCase("safari")) {
            SafariOptions options = new SafariOptions();
            if(HEADLESS){
                throw new RuntimeException("Safari is not supporting HEADLESS");
            }
            driver = new SafariDriver(options);
        }
        else {
            throw new RuntimeException("Invalid Browser name:" + BROWSER);
        }
        driver.manage().window().maximize();
        driver.get(BASE_URL);

    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
