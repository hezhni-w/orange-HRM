package com.ohm.selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddEmployeePage {

    private WebDriver driver;

    // Constructor
    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement pim;

    @FindBy(xpath = "//a[text()='Add Employee']")
    private WebElement addEmployeeMenu;

    @FindBy(name = "firstName")
    private WebElement firstNameInput;

    @FindBy(name = "middleName")
    private WebElement middleNameInput;

    @FindBy(name = "lastName")
    private WebElement lastNameInput;

    @FindBy(xpath ="//label[normalize-space()='Employee Id']/following::input[1]")
    private WebElement employeeIdInput;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement saveButton;

  //  @FindBy(xpath = "//input[contains(@class,'oxd-icon bi-plus')]")
   // private WebElement fileUpload;


    public void openPimMenu() {
        pim.click();
    }

    public void openAddEmployeePage() {
        addEmployeeMenu.click();
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterMiddleName(String middleName) {
        middleNameInput.sendKeys(middleName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void enterEmployeeId(String employeeId) {
        employeeIdInput.clear();
        employeeIdInput.sendKeys(employeeId);
    }

    public void clickSave() {
        saveButton.click();
    }



}




