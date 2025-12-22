package com.ohm.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLoadingTest {

    public static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
    WebDriver webDriver;


    @BeforeMethod
    public void beforeMethod(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(BASE_URL);
    }

  //  @AfterMethod
    public void afterMethod(){
        webDriver.quit();
    }

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        // Disable "Chrome is being controlled by automated test software"
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(options);

        driver.get(BASE_URL);
    }


    @Test
    public void testBrowserLoading(){

    }

}
