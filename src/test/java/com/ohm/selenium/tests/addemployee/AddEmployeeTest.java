package com.ohm.selenium.tests.addemployee;

import com.ohm.selenium.TestBase;
import com.ohm.selenium.pages.AddEmployeePage;
import com.ohm.selenium.pages.LoginPage;
import net.datafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddEmployeeTest extends TestBase{


    WebDriver driver;
        @Test
        public void verifyAddEmployee() {

            // Initialize Faker
            Faker faker = new Faker();

            String firstName = faker.name().firstName();
            String middleName = faker.name().nameWithMiddle().split(" ")[1];
            String lastName = faker.name().lastName();
            String employeeId = faker.number().digits(5);

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://opensource-demo.orangehrmlive.com/");



            // Login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Open PIM
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();

            // Add Employee
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add Employee']"))).click();

            // Fill details using Faker data
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")))
                    .sendKeys(firstName);
            driver.findElement(By.name("middleName")).sendKeys(middleName);
            driver.findElement(By.name("lastName")).sendKeys(lastName);
            driver.findElement(By.xpath("//label[normalize-space()='Employee Id']/following::input[1]"))
                    .sendKeys(employeeId);
            // Upload photo
            driver.findElement(By.xpath("//input[@type='file']"))
                    .sendKeys("/Users/dilkiishara/IdeaProjects/orange-HRM-2/src/test/resources/pics/sample-profile-pic.jpg");

            // Save
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Save']"))).click();

            //driver.quit();
        }
    }

