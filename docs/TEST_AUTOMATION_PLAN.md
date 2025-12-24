# 📋 Test Automation Plan

<div align="center">

![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6B35?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

# OrangeHRM Test Automation Project

**Master Test Plan Document**

*IEEE 829/29119 Compliant Test Automation Strategy*

---

[![Document Status](https://img.shields.io/badge/Status-Approved-success.svg)](#)
[![Version](https://img.shields.io/badge/Version-1.0-blue.svg)](#)
[![Compliance](https://img.shields.io/badge/IEEE-829%2F29119-purple.svg)](#)

</div>

---

## 📄 Document Control

### Document Information

| Property | Value |
|----------|-------|
| **Document ID** | TAP-OHM-2024-001 |
| **Document Title** | OrangeHRM Test Automation Plan |
| **Project Name** | OrangeHRM Test Automation Framework |
| **Version** | 1.0 |
| **Status** | ![Approved](https://img.shields.io/badge/Status-Approved-success) |
| **Classification** | Internal |
| **Created Date** | December 2024 |
| **Last Updated** | December 2024 |

### Revision History

| Version | Date | Author | Description | Reviewer |
|---------|------|--------|-------------|----------|
| 0.1 | Dec 2024 | QA Team | Initial draft | - |
| 0.2 | Dec 2024 | QA Team | Added technology stack details | Tech Lead |
| 1.0 | Dec 2024 | QA Team | Final approved version | Project Manager |

### Distribution List

| Role | Name | Email |
|------|------|-------|
| Project Manager | [Name] | [email] |
| QA Lead | [Name] | [email] |
| Automation Lead | [Name] | [email] |
| Development Lead | [Name] | [email] |

---

## 📑 Table of Contents

| Section | Description |
|---------|-------------|
| [1. Introduction](#1--introduction) | Project overview and objectives |
| [2. References](#2--references) | Related documents and resources |
| [3. Scope](#3--scope) | What's in and out of scope |
| [4. Team Structure](#4--team-structure--roles) | Roles and responsibilities |
| [5. Technology Stack](#5--technology-stack) | Tools and frameworks |
| [6. Test Approach](#6--test-approach--strategy) | Framework architecture |
| [7. Environment Setup](#7--environment-setup) | How to set up the project |
| [8. Test Execution](#8--test-execution-guide) | How to run tests |
| [9. CI/CD Integration](#9--cicd-integration) | Continuous integration |
| [10. Test Data Management](#10--test-data-management) | Data handling strategy |
| [11. Pass/Fail Criteria](#11--passfail-criteria) | Acceptance criteria |
| [12. Risks & Mitigation](#12--risks--mitigation) | Risk management |
| [13. Deliverables](#13--deliverables) | Project outputs |
| [14. Schedule](#14--schedule--milestones) | Timeline and phases |
| [15. Maintenance](#15--maintenance-strategy) | Long-term maintenance |
| [16. Approvals](#16--approvals) | Sign-off section |

---

## 1. 🎯 Introduction

### 1.1 Executive Summary

> **What is this document?**
> 
> This Test Automation Plan defines the strategy, approach, and guidelines for automating functional tests for the **OrangeHRM** Human Resource Management application. It serves as the blueprint for our test automation efforts.

This document outlines how we will automate **53 test cases** across **8 modules** of the OrangeHRM application using **Selenium WebDriver** with **Java** and **TestNG**.

### 1.2 Purpose

The purpose of this Test Automation Plan is to:

| # | Purpose |
|---|---------|
| 1 | Define the automation strategy and approach |
| 2 | Establish standards for test script development |
| 3 | Identify tools, technologies, and frameworks |
| 4 | Define roles and responsibilities |
| 5 | Set timelines and milestones |
| 6 | Identify risks and mitigation strategies |

### 1.3 Automation Objectives

```
┌─────────────────────────────────────────────────────────────────────────┐
│                        🎯 AUTOMATION GOALS                              │
├─────────────────────────────────────────────────────────────────────────┤
│  ✅ Reduce manual testing effort by 70%                                 │
│  ✅ Achieve 80% automation coverage for regression tests                │
│  ✅ Enable faster feedback through CI/CD integration                    │
│  ✅ Improve test consistency and reliability                            │
│  ✅ Create reusable and maintainable test framework                     │
│  ✅ Support parallel test execution for faster results                  │
└─────────────────────────────────────────────────────────────────────────┘
```

### 1.4 Glossary of Terms

> 💡 **For Beginners**: Here are key terms you'll encounter in this document:

| Term | Definition |
|------|------------|
| **Selenium WebDriver** | A tool for automating web browser interactions |
| **TestNG** | A testing framework for Java (similar to JUnit but more powerful) |
| **Page Object Model (POM)** | A design pattern where each web page is represented as a class |
| **Page Factory** | A Selenium support class that helps initialize page elements |
| **Maven** | A build automation tool that manages project dependencies |
| **CI/CD** | Continuous Integration/Continuous Deployment - automated build and deploy |
| **Regression Testing** | Re-testing to ensure new changes don't break existing functionality |
| **Smoke Testing** | Quick tests to verify basic functionality works |

---

## 2. 📚 References

### 2.1 Project Documents

| Document | Location | Description |
|----------|----------|-------------|
| Test Cases | [`docs/TEST_CASES.md`](./TEST_CASES.md) | 53 test cases across 8 modules |
| Coding Conventions | [`docs/CODING_AND_NAMING_CONVENTIONS.md`](./CODING_AND_NAMING_CONVENTIONS.md) | Naming and coding standards |
| Project POM | [`pom.xml`](../pom.xml) | Maven project configuration |

### 2.2 External References

| Resource | URL | Purpose |
|----------|-----|---------|
| OrangeHRM Demo | https://opensource-demo.orangehrmlive.com/ | Application Under Test |
| Selenium Docs | https://www.selenium.dev/documentation/ | WebDriver documentation |
| TestNG Docs | https://testng.org/doc/documentation-main.html | Testing framework docs |
| Java Docs | https://docs.oracle.com/en/java/ | Java language reference |

---

## 3. 🔍 Scope

### 3.1 Application Under Test

| Property | Details |
|----------|---------|
| **Application Name** | OrangeHRM |
| **Application Type** | Web-based HR Management System |
| **URL** | https://opensource-demo.orangehrmlive.com/ |
| **Version** | Demo Version |
| **Technology** | PHP, MySQL, JavaScript |

### 3.2 Features IN Scope ✅

The following **8 modules** with **53 test cases** are in scope for automation:

| # | Module | Test Cases | Priority | Page Objects |
|---|--------|------------|----------|--------------|
| 1 | 🔐 Login | 7 | ![P1](https://img.shields.io/badge/P1-Critical-red) | `LoginPage.java` |
| 2 | 🔑 Forgot Password | 6 | ![P2](https://img.shields.io/badge/P2-High-orange) | `LoginPage.java` |
| 3 | 🚪 Logout | 3 | ![P1](https://img.shields.io/badge/P1-Critical-red) | `TopMenuPage.java` |
| 4 | 👤 Add Employee (PIM) | 8 | ![P1](https://img.shields.io/badge/P1-Critical-red) | `AddEmployeePage.java` |
| 5 | 📋 Claim Submission | 12 | ![P2](https://img.shields.io/badge/P2-High-orange) | `ClaimSubmissionPage.java` |
| 6 | 💰 Add Expenses | 4 | ![P2](https://img.shields.io/badge/P2-High-orange) | `AddExpensesPage.java` |
| 7 | 📎 Upload Attachments | 3 | ![P2](https://img.shields.io/badge/P2-High-orange) | `FileManager.java` |
| 8 | 🏖️ Leave Entitlement | 10 | ![P2](https://img.shields.io/badge/P2-High-orange) | `LeaveEntitlementPage.java` |

**Total: 53 Test Cases**

### 3.3 Features OUT of Scope ❌

| Feature | Reason |
|---------|--------|
| 🔒 CAPTCHA Verification | Cannot be automated reliably |
| 📧 Email Notifications | Requires email server integration |
| 📱 Mobile Responsiveness | Out of current project scope |
| 🔗 Third-party Integrations | External system dependencies |
| 📊 Report Generation (PDF) | Requires file download verification |
| 🌐 Multi-browser Testing | Phase 2 consideration |
| 🔄 Performance Testing | Requires different tools (JMeter) |
| 🛡️ Security Testing | Requires specialized security tools |

### 3.4 Browser Support

| Browser | Version | Status |
|---------|---------|--------|
| ![Chrome](https://img.shields.io/badge/Chrome-Latest-green) | Latest | ✅ Primary |
| ![Firefox](https://img.shields.io/badge/Firefox-Latest-orange) | Latest | 🔜 Phase 2 |
| ![Edge](https://img.shields.io/badge/Edge-Latest-blue) | Latest | 🔜 Phase 2 |

---

## 4. 👥 Team Structure & Roles

### 4.1 Organization Chart

```
                    ┌─────────────────────┐
                    │   Project Manager   │
                    │    (Oversight)      │
                    └──────────┬──────────┘
                               │
              ┌────────────────┼────────────────┐
              │                │                │
    ┌─────────▼─────────┐ ┌────▼────┐ ┌────────▼────────┐
    │  Automation Lead  │ │ Dev Lead│ │   Manual QA     │
    │  (Framework)      │ │(Support)│ │   (Validation)  │
    └─────────┬─────────┘ └─────────┘ └─────────────────┘
              │
    ┌─────────▼─────────┐
    │   SDET / QA       │
    │   Engineers       │
    └───────────────────┘
```

### 4.2 Roles and Responsibilities

| Role | Responsibilities |
|------|------------------|
| **🎯 Project Manager** | • Overall project oversight<br>• Resource allocation<br>• Stakeholder communication<br>• Risk management |
| **🔧 Automation Lead** | • Framework design and architecture<br>• Code review and standards<br>• Technical mentoring<br>• CI/CD pipeline setup |
| **💻 SDET (Software Development Engineer in Test)** | • Write and maintain test scripts<br>• Create and update Page Objects<br>• Debug and fix failing tests<br>• Report defects |
| **🧪 Manual QA** | • Validate automation results<br>• Identify new test cases<br>• Exploratory testing<br>• Test data preparation |
| **👨‍💻 Development Lead** | • Provide application insights<br>• Support locator identification<br>• Fix application bugs<br>• Environment support |

### 4.3 RACI Matrix

> 💡 **RACI**: **R**esponsible, **A**ccountable, **C**onsulted, **I**nformed

| Activity | PM | Auto Lead | SDET | Manual QA | Dev Lead |
|----------|:--:|:---------:|:----:|:---------:|:--------:|
| Framework Design | I | A/R | C | I | C |
| Test Script Development | I | A | R | C | I |
| Code Review | I | A/R | R | I | C |
| Test Execution | I | A | R | R | I |
| Defect Reporting | I | I | R | R | A |
| CI/CD Setup | I | A/R | C | I | C |
| Test Maintenance | I | A | R | C | I |

---

## 5. 🛠️ Technology Stack

### 5.1 Framework Components

<div align="center">

| Component | Technology | Version | Purpose |
|-----------|------------|---------|---------|
| ![Java](https://img.shields.io/badge/Language-Java-ED8B00?logo=openjdk) | Java | 25 | Programming language |
| ![Selenium](https://img.shields.io/badge/Automation-Selenium-43B02A?logo=selenium) | Selenium WebDriver | 4.39.0 | Browser automation |
| ![TestNG](https://img.shields.io/badge/Testing-TestNG-FF6B35) | TestNG | 7.11.0 | Test framework |
| ![Maven](https://img.shields.io/badge/Build-Maven-C71A36?logo=apache-maven) | Maven | 3.9+ | Build & dependency management |
| ![Git](https://img.shields.io/badge/VCS-Git-F05032?logo=git) | Git | Latest | Version control |
| ![Chrome](https://img.shields.io/badge/Browser-Chrome-4285F4?logo=google-chrome) | ChromeDriver | Latest | Browser driver |

</div>

### 5.2 Project Dependencies (pom.xml)

```xml
<!-- Core Dependencies -->
<dependencies>
    <!-- Selenium WebDriver - Browser Automation -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.39.0</version>
    </dependency>

    <!-- TestNG - Testing Framework -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.11.0</version>
    </dependency>

    <!-- DataFaker - Test Data Generation -->
    <dependency>
        <groupId>net.datafaker</groupId>
        <artifactId>datafaker</artifactId>
        <version>2.5.3</version>
    </dependency>
</dependencies>
```

### 5.3 Design Patterns

#### Page Object Model (POM)

> 💡 **What is POM?** A design pattern where each web page in the application is represented as a Java class. This separates test logic from page interactions.

```
┌─────────────────────────────────────────────────────────────────────────┐
│                     PAGE OBJECT MODEL ARCHITECTURE                      │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                         │
│   ┌─────────────┐     ┌─────────────┐     ┌─────────────┐              │
│   │  Test Class │────▶│ Page Object │────▶│  WebDriver  │──▶ Browser   │
│   │  (LoginTest)│     │ (LoginPage) │     │  (Chrome)   │              │
│   └─────────────┘     └─────────────┘     └─────────────┘              │
│                                                                         │
│   Benefits:                                                             │
│   ✅ Separation of concerns                                             │
│   ✅ Reusable page methods                                              │
│   ✅ Easy maintenance                                                   │
│   ✅ Readable test code                                                 │
│                                                                         │
└─────────────────────────────────────────────────────────────────────────┘
```

#### Page Factory

> 💡 **What is Page Factory?** A Selenium support class that provides a cleaner way to initialize web elements using `@FindBy` annotations.

```java
// Example: LoginPage.java using Page Factory
public class LoginPage {

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize elements
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
```

---

## 6. 🏗️ Test Approach & Strategy

### 6.1 Framework Architecture

```
📦 orange-HRM-2/
├── 📁 docs/                              # 📚 Documentation
│   ├── 📄 TEST_AUTOMATION_PLAN.md        # This document
│   ├── 📄 TEST_CASES.md                  # Test case repository
│   └── 📄 CODING_AND_NAMING_CONVENTIONS.md
├── 📁 src/
│   ├── 📁 main/java/                     # Production code (if needed)
│   └── 📁 test/java/
│       └── 📁 com/ohm/selenium/          # Test automation code
│           ├── 📄 TestBase.java          # Base test class
│           ├── 📁 pages/                 # Page Object classes
│           │   ├── 📄 LoginPage.java
│           │   ├── 📄 DashBoardPage.java
│           │   ├── 📄 AddEmployeePage.java
│           │   ├── 📄 ClaimSubmissionPage.java
│           │   ├── 📄 LeaveEntitlementPage.java
│           │   ├── 📄 LeftMenuPage.java
│           │   ├── 📄 TopMenuPage.java
│           │   └── 📄 ... (14 page objects)
│           ├── 📁 tests/                 # Test classes by module
│           │   ├── 📁 login/
│           │   ├── 📁 dashboard/
│           │   ├── 📁 claim/
│           │   └── 📁 addemployee/
│           ├── 📁 ui/                    # Custom UI components
│           │   ├── 📄 ICheck.java        # Interface
│           │   └── 📄 Check.java         # Implementation
│           └── 📁 utils/                 # Utility classes
│               └── 📄 FileManager.java
├── 📄 pom.xml                            # Maven configuration
├── 📄 testng.xml                         # TestNG suite config
└── 📄 .gitignore                         # Git ignore rules
```

### 6.2 Test Layers

```
┌─────────────────────────────────────────────────────────────────────────┐
│                         TEST AUTOMATION LAYERS                          │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                         │
│  ┌─────────────────────────────────────────────────────────────────┐   │
│  │                      TEST LAYER (tests/)                        │   │
│  │  • Test classes organized by module                             │   │
│  │  • Contains @Test methods                                       │   │
│  │  • Uses assertions for validation                               │   │
│  └─────────────────────────────────────────────────────────────────┘   │
│                              ▼                                          │
│  ┌─────────────────────────────────────────────────────────────────┐   │
│  │                    PAGE OBJECT LAYER (pages/)                   │   │
│  │  • One class per page/component                                 │   │
│  │  • Contains element locators (@FindBy)                          │   │
│  │  • Contains page action methods                                 │   │
│  └─────────────────────────────────────────────────────────────────┘   │
│                              ▼                                          │
│  ┌─────────────────────────────────────────────────────────────────┐   │
│  │                    UTILITY LAYER (utils/)                       │   │
│  │  • Helper methods (waits, file handling)                        │   │
│  │  • Configuration readers                                        │   │
│  │  • Common utilities                                             │   │
│  └─────────────────────────────────────────────────────────────────┘   │
│                              ▼                                          │
│  ┌─────────────────────────────────────────────────────────────────┐   │
│  │                    UI COMPONENT LAYER (ui/)                     │   │
│  │  • Custom element wrappers (Check, Dropdown)                    │   │
│  │  • Reusable UI interactions                                     │   │
│  └─────────────────────────────────────────────────────────────────┘   │
│                                                                         │
└─────────────────────────────────────────────────────────────────────────┘
```

### 6.3 Test Types

| Test Type | Description | When to Run | Coverage |
|-----------|-------------|-------------|----------|
| 🔥 **Smoke Tests** | Quick validation of critical paths | Every build | 10-15% |
| 🔄 **Regression Tests** | Full test suite execution | Nightly/Weekly | 100% |
| ✅ **Sanity Tests** | Focused tests after bug fixes | After deployments | 20-30% |
| 🎯 **Module Tests** | Tests for specific modules | During development | Per module |

### 6.4 Test Naming Convention

Following our [Coding Conventions](./CODING_AND_NAMING_CONVENTIONS.md):

```java
// Pattern: test[Feature][Scenario][ExpectedResult]

@Test
public void testLoginWithValidCredentialsShouldRedirectToDashboard() { }

@Test
public void testLoginWithInvalidUsernameShouldShowErrorMessage() { }

@Test
public void testAddEmployeeWithMandatoryFieldsShouldSucceed() { }
```

---

## 7. 💻 Environment Setup

### 7.1 Prerequisites

| Requirement | Version | Download Link |
|-------------|---------|---------------|
| ☕ Java JDK | 25 or higher | [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) |
| 📦 Maven | 3.9+ | [Apache Maven](https://maven.apache.org/download.cgi) |
| 🌐 Chrome Browser | Latest | [Google Chrome](https://www.google.com/chrome/) |
| 💻 IDE | IntelliJ IDEA / Eclipse | [IntelliJ](https://www.jetbrains.com/idea/) |
| 🔧 Git | Latest | [Git SCM](https://git-scm.com/) |

### 7.2 Step-by-Step Setup Guide

> 💡 **For Beginners**: Follow these steps to set up the project on your machine.

#### Step 1: Clone the Repository

```bash
# Clone the project
git clone <repository-url>
cd orange-HRM-2
```

#### Step 2: Verify Java Installation

```bash
# Check Java version
java -version
# Expected: java version "25" or higher

# Check JAVA_HOME
echo $JAVA_HOME
```

#### Step 3: Verify Maven Installation

```bash
# Check Maven version
mvn -version
# Expected: Apache Maven 3.9.x or higher
```

#### Step 4: Install Dependencies

```bash
# Download all project dependencies
mvn clean install -DskipTests
```

#### Step 5: Open in IDE

1. Open IntelliJ IDEA
2. File → Open → Select `orange-HRM-2` folder
3. Wait for Maven to import dependencies
4. Verify project structure matches the architecture diagram

### 7.3 Test Environment Details

| Property | Value |
|----------|-------|
| **Application URL** | https://opensource-demo.orangehrmlive.com/ |
| **Login URL** | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login |
| **Dashboard URL** | https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index |
| **Test Username** | `Admin` |
| **Test Password** | `admin123` |

### 7.4 IDE Configuration

#### IntelliJ IDEA Settings

1. **Enable Annotation Processing**:
   - Settings → Build → Compiler → Annotation Processors
   - Check "Enable annotation processing"

2. **Install Plugins**:
   - TestNG (for running tests)
   - Maven Helper (for dependency management)

3. **Set Project SDK**:
   - File → Project Structure → Project → SDK → Java 25

---

## 8. 🚀 Test Execution Guide

### 8.1 Running Tests from IDE

#### Method 1: Run Single Test

1. Open test class (e.g., `LoginTest.java`)
2. Right-click on `@Test` method
3. Select "Run 'testMethodName'"

#### Method 2: Run Test Class

1. Right-click on test class file
2. Select "Run 'ClassName'"

#### Method 3: Run via TestNG XML

1. Right-click on `testng.xml`
2. Select "Run 'testng.xml'"

### 8.2 Running Tests from Command Line

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=LoginTest

# Run specific test method
mvn test -Dtest=LoginTest#testLoginWithValidCredentials

# Run tests with specific TestNG suite
mvn test -DsuiteXmlFile=testng.xml

# Run tests and generate report
mvn test surefire-report:report
```

### 8.3 TestNG XML Configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="OrangeHRM Test Suite" parallel="false" verbose="2">

    <!-- Global Parameters -->
    <parameter name="browser" value="chrome"/>
    <parameter name="baseUrl" value="https://opensource-demo.orangehrmlive.com"/>

    <!-- Smoke Tests - Run First -->
    <test name="Smoke Tests">
        <groups>
            <run>
                <include name="smoke"/>
            </run>
        </groups>
        <packages>
            <package name="com.ohm.selenium.tests.*"/>
        </packages>
    </test>

    <!-- Login Module Tests -->
    <test name="Login Tests">
        <classes>
            <class name="com.ohm.selenium.tests.login.LoginTest"/>
        </classes>
    </test>

    <!-- Full Regression Suite -->
    <test name="Regression Tests">
        <packages>
            <package name="com.ohm.selenium.tests.*"/>
        </packages>
    </test>

</suite>
```

### 8.4 Test Reports

After test execution, reports are generated at:

| Report Type | Location | Description |
|-------------|----------|-------------|
| TestNG HTML | `test-output/index.html` | Detailed test results |
| Surefire | `target/surefire-reports/` | Maven test reports |
| Screenshots | `screenshots/` | Failure screenshots |

---

## 9. 🔄 CI/CD Integration

### 9.1 Recommended CI/CD Tools

| Tool | Use Case | Complexity |
|------|----------|------------|
| ![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?logo=github-actions&logoColor=white) | GitHub repositories | ⭐ Easy |
| ![Jenkins](https://img.shields.io/badge/Jenkins-D24939?logo=jenkins&logoColor=white) | Enterprise environments | ⭐⭐ Medium |
| ![GitLab CI](https://img.shields.io/badge/GitLab_CI-FC6D26?logo=gitlab&logoColor=white) | GitLab repositories | ⭐⭐ Medium |

### 9.2 GitHub Actions Workflow (Recommended)

Create `.github/workflows/selenium-tests.yml`:

```yaml
name: Selenium Tests

on:
  push:
    branches: [ main, develop ]
  pull_request:
    branches: [ main ]
  schedule:
    - cron: '0 2 * * *'  # Nightly at 2 AM

jobs:
  test:
    runs-on: ubuntu-latest

    steps:
    - name: Checkout code
      uses: actions/checkout@v4

    - name: Set up JDK 25
      uses: actions/setup-java@v4
      with:
        java-version: '25'
        distribution: 'temurin'

    - name: Set up Chrome
      uses: browser-actions/setup-chrome@latest

    - name: Cache Maven packages
      uses: actions/cache@v3
      with:
        path: ~/.m2
        key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}

    - name: Run tests
      run: mvn test -DsuiteXmlFile=testng.xml

    - name: Upload test results
      if: always()
      uses: actions/upload-artifact@v3
      with:
        name: test-results
        path: |
          target/surefire-reports/
          test-output/
```

### 9.3 Jenkins Pipeline (Alternative)

```groovy
pipeline {
    agent any

    tools {
        maven 'Maven 3.9'
        jdk 'JDK 25'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: '<repository-url>'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test -DsuiteXmlFile=testng.xml'
            }
            post {
                always {
                    publishHTML([
                        reportDir: 'test-output',
                        reportFiles: 'index.html',
                        reportName: 'TestNG Report'
                    ])
                }
            }
        }
    }

    post {
        failure {
            emailext subject: 'Test Failure: ${JOB_NAME}',
                     body: 'Tests failed. Check ${BUILD_URL}',
                     to: 'team@example.com'
        }
    }
}
```

### 9.4 CI/CD Best Practices

| Practice | Description |
|----------|-------------|
| ✅ Run on every PR | Catch issues before merge |
| ✅ Nightly full regression | Complete test coverage |
| ✅ Parallel execution | Faster feedback |
| ✅ Artifact storage | Keep reports for analysis |
| ✅ Notifications | Alert team on failures |
| ✅ Environment isolation | Consistent test environment |

---

## 10. 📊 Test Data Management

### 10.1 Test Data Strategy

```
┌─────────────────────────────────────────────────────────────────────────┐
│                      TEST DATA MANAGEMENT STRATEGY                      │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                         │
│  ┌─────────────────┐  ┌─────────────────┐  ┌─────────────────┐         │
│  │  Static Data    │  │  Dynamic Data   │  │  DataFaker      │         │
│  │  (Constants)    │  │  (Generated)    │  │  (Random)       │         │
│  └────────┬────────┘  └────────┬────────┘  └────────┬────────┘         │
│           │                    │                    │                   │
│           ▼                    ▼                    ▼                   │
│  • Login credentials  • Timestamps        • Employee names              │
│  • URLs               • Unique IDs        • Email addresses             │
│  • Expected messages  • Session data      • Phone numbers               │
│                                                                         │
└─────────────────────────────────────────────────────────────────────────┘
```

### 10.2 Using DataFaker Library

```java
import net.datafaker.Faker;

public class TestDataGenerator {
    private static final Faker faker = new Faker();

    public static String generateFirstName() {
        return faker.name().firstName();
    }

    public static String generateLastName() {
        return faker.name().lastName();
    }

    public static String generateEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateEmployeeId() {
        return "EMP" + faker.number().digits(5);
    }
}
```

### 10.3 Demo Site Data Reset Handling

> ⚠️ **Important**: The OrangeHRM demo site resets data periodically!

| Challenge | Solution |
|-----------|----------|
| Data gets reset | Create fresh test data at test start |
| Employees disappear | Use setup methods to create required data |
| Claims get deleted | Don't rely on pre-existing claims |
| Sessions expire | Implement re-login mechanism |

```java
@BeforeMethod
public void setUp() {
    // Always create fresh test data
    testEmployee = TestDataGenerator.createEmployee();

    // Login before each test
    loginPage.login("Admin", "admin123");
}
```

### 10.4 Test Data Files

| File Type | Location | Purpose |
|-----------|----------|---------|
| Properties | `src/test/resources/config.properties` | Environment config |
| JSON | `src/test/resources/testdata/` | Complex test data |
| CSV | `src/test/resources/testdata/` | Bulk test data |

---

## 11. ✅ Pass/Fail Criteria

### 11.1 Test Execution Criteria

| Criteria | Threshold | Status |
|----------|-----------|--------|
| **Pass Rate** | ≥ 95% | ![Required](https://img.shields.io/badge/Required-green) |
| **Critical Tests (P1)** | 100% pass | ![Mandatory](https://img.shields.io/badge/Mandatory-red) |
| **High Priority (P2)** | ≥ 98% pass | ![Required](https://img.shields.io/badge/Required-green) |
| **Medium Priority (P3)** | ≥ 90% pass | ![Expected](https://img.shields.io/badge/Expected-yellow) |

### 11.2 Release Criteria

```
┌─────────────────────────────────────────────────────────────────────────┐
│                         RELEASE GO/NO-GO CRITERIA                       │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                         │
│  ✅ GO Criteria:                                                        │
│     • All P1 (Critical) tests passing                                   │
│     • Overall pass rate ≥ 95%                                           │
│     • No open P1/P2 defects                                             │
│     • All smoke tests passing                                           │
│     • Test execution completed within timeline                          │
│                                                                         │
│  ❌ NO-GO Criteria:                                                     │
│     • Any P1 test failing                                               │
│     • Pass rate < 90%                                                   │
│     • Open P1 defects                                                   │
│     • Environment issues blocking tests                                 │
│                                                                         │
└─────────────────────────────────────────────────────────────────────────┘
```

### 11.3 Defect Severity Classification

| Severity | Description | Example | SLA |
|----------|-------------|---------|-----|
| 🔴 **Critical** | System unusable | Login completely broken | 4 hours |
| 🟠 **High** | Major feature broken | Cannot add employee | 24 hours |
| 🟡 **Medium** | Feature partially working | Validation message wrong | 3 days |
| 🟢 **Low** | Minor issue | UI alignment | Next release |

---

## 12. ⚠️ Risks & Mitigation

### 12.1 Risk Assessment Matrix

| # | Risk | Probability | Impact | Risk Level | Mitigation Strategy |
|---|------|-------------|--------|------------|---------------------|
| 1 | Demo site unavailable | Medium | High | 🟠 High | Implement retry mechanism; have backup test environment |
| 2 | Data reset by demo site | High | Medium | 🟠 High | Create fresh data in @BeforeMethod; don't rely on existing data |
| 3 | Flaky tests | Medium | Medium | 🟡 Medium | Add explicit waits; implement retry logic; review locators |
| 4 | Element locator changes | Medium | High | 🟠 High | Use stable locators (ID, name); centralize locators in Page Objects |
| 5 | Browser version mismatch | Low | Medium | 🟡 Medium | Use WebDriverManager for automatic driver management |
| 6 | Test environment differences | Medium | Medium | 🟡 Medium | Use configuration files; parameterize environment settings |
| 7 | Team skill gaps | Medium | Medium | 🟡 Medium | Provide training; pair programming; code reviews |
| 8 | Scope creep | Medium | High | 🟠 High | Strict change control; prioritize automation candidates |

### 12.2 Risk Level Legend

| Level | Color | Action Required |
|-------|-------|-----------------|
| 🔴 Critical | Red | Immediate action required |
| 🟠 High | Orange | Action plan needed |
| 🟡 Medium | Yellow | Monitor and plan |
| 🟢 Low | Green | Accept and monitor |

### 12.3 Contingency Plans

#### Demo Site Unavailable

```java
// Implement retry mechanism
@Test(retryAnalyzer = RetryAnalyzer.class)
public void testLogin() {
    // Test implementation
}

// RetryAnalyzer.java
public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int MAX_RETRY = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < MAX_RETRY) {
            retryCount++;
            return true;
        }
        return false;
    }
}
```

#### Flaky Test Handling

```java
// Use explicit waits instead of Thread.sleep
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(loginButton));
```

---

## 13. 📦 Deliverables

### 13.1 Project Deliverables

| # | Deliverable | Description | Format | Owner |
|---|-------------|-------------|--------|-------|
| 1 | Test Automation Framework | Complete POM-based framework | Java Project | Automation Lead |
| 2 | Automated Test Scripts | 53 test cases automated | Java/TestNG | SDET Team |
| 3 | Test Execution Reports | Daily/Weekly test results | HTML/PDF | QA Team |
| 4 | Defect Reports | Bugs found during automation | JIRA/Excel | QA Team |
| 5 | Documentation | Plans, conventions, guides | Markdown | All |
| 6 | CI/CD Pipeline | Automated test execution | YAML/Groovy | Automation Lead |

### 13.2 Documentation Deliverables

| Document | Status | Location |
|----------|--------|----------|
| Test Automation Plan | ✅ Complete | `docs/TEST_AUTOMATION_PLAN.md` |
| Test Cases | ✅ Complete | `docs/TEST_CASES.md` |
| Coding Conventions | ✅ Complete | `docs/CODING_AND_NAMING_CONVENTIONS.md` |
| README | 🔜 Planned | `README.md` |
| Setup Guide | 🔜 Planned | `docs/SETUP_GUIDE.md` |

### 13.3 Metrics & KPIs

| Metric | Target | Measurement |
|--------|--------|-------------|
| **Automation Coverage** | 80% | Automated tests / Total tests |
| **Test Pass Rate** | ≥ 95% | Passed tests / Total executed |
| **Defect Detection Rate** | Track | Defects found by automation |
| **Test Execution Time** | < 30 min | Full regression suite time |
| **Flaky Test Rate** | < 5% | Inconsistent tests / Total tests |
| **Maintenance Effort** | < 20% | Time spent on maintenance |

---

## 14. 📅 Schedule & Milestones

### 14.1 Phased Approach

```
┌─────────────────────────────────────────────────────────────────────────┐
│                      AUTOMATION IMPLEMENTATION PHASES                   │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                         │
│  Phase 1: Foundation (Week 1-2)                                         │
│  ├── ✅ Framework setup                                                 │
│  ├── ✅ Page Objects for Login, Dashboard                               │
│  ├── ✅ Login module automation (7 tests)                               │
│  └── ✅ CI/CD basic setup                                               │
│                                                                         │
│  Phase 2: Core Modules (Week 3-4)                                       │
│  ├── 🔄 Forgot Password automation (6 tests)                           │
│  ├── 🔄 Logout automation (3 tests)                                     │
│  ├── 🔄 Add Employee automation (8 tests)                               │
│  └── 🔄 Enhanced reporting                                              │
│                                                                         │
│  Phase 3: Extended Modules (Week 5-6)                                   │
│  ├── 📋 Claim Submission automation (12 tests)                          │
│  ├── 📋 Add Expenses automation (4 tests)                               │
│  ├── 📋 Upload Attachments automation (3 tests)                         │
│  └── 📋 Leave Entitlement automation (10 tests)                         │
│                                                                         │
│  Phase 4: Optimization (Week 7-8)                                       │
│  ├── 🔧 Parallel execution                                              │
│  ├── 🔧 Cross-browser testing                                           │
│  ├── 🔧 Performance optimization                                        │
│  └── 🔧 Documentation finalization                                      │
│                                                                         │
└─────────────────────────────────────────────────────────────────────────┘
```

### 14.2 Detailed Timeline

| Phase | Module | Tests | Start | End | Status |
|-------|--------|-------|-------|-----|--------|
| **Phase 1** | Framework Setup | - | Week 1 | Week 1 | ✅ Done |
| | Login | 7 | Week 1 | Week 2 | ✅ Done |
| **Phase 2** | Forgot Password | 6 | Week 3 | Week 3 | 🔄 In Progress |
| | Logout | 3 | Week 3 | Week 3 | 🔄 In Progress |
| | Add Employee | 8 | Week 4 | Week 4 | 📋 Planned |
| **Phase 3** | Claim Submission | 12 | Week 5 | Week 5 | 📋 Planned |
| | Add Expenses | 4 | Week 5 | Week 5 | 📋 Planned |
| | Upload Attachments | 3 | Week 6 | Week 6 | 📋 Planned |
| | Leave Entitlement | 10 | Week 6 | Week 6 | 📋 Planned |
| **Phase 4** | Optimization | - | Week 7 | Week 8 | 📋 Planned |

### 14.3 Milestones

| Milestone | Target Date | Criteria |
|-----------|-------------|----------|
| 🏁 M1: Framework Ready | Week 2 | Base framework operational |
| 🏁 M2: 25% Automation | Week 4 | 13+ tests automated |
| 🏁 M3: 50% Automation | Week 5 | 26+ tests automated |
| 🏁 M4: 100% Automation | Week 6 | All 53 tests automated |
| 🏁 M5: Project Complete | Week 8 | Optimization complete |

---

## 15. 🔧 Maintenance Strategy

### 15.1 Maintenance Activities

| Activity | Frequency | Owner |
|----------|-----------|-------|
| Review failing tests | Daily | SDET |
| Update locators | As needed | SDET |
| Refactor page objects | Monthly | Automation Lead |
| Update dependencies | Quarterly | Automation Lead |
| Review test coverage | Monthly | QA Lead |
| Documentation updates | As needed | All |

### 15.2 Page Object Maintenance

```java
// Best Practices for Maintainable Page Objects

public class LoginPage {
    // 1. Use descriptive locator names
    @FindBy(id = "username")  // Prefer ID over XPath
    private WebElement usernameField;

    // 2. Centralize locators at class level
    private static final String LOGIN_BUTTON_XPATH = "//button[@type='submit']";

    // 3. Use meaningful method names
    public DashBoardPage loginAsAdmin() {
        return login("Admin", "admin123");
    }

    // 4. Return page objects for fluent interface
    public DashBoardPage login(String username, String password) {
        typeUsername(username);
        typePassword(password);
        clickLoginButton();
        return new DashBoardPage(driver);
    }
}
```

### 15.3 Test Maintenance Checklist

- [ ] Are all tests passing?
- [ ] Are locators still valid?
- [ ] Is test data still relevant?
- [ ] Are waits appropriate?
- [ ] Is code following conventions?
- [ ] Are there any deprecated methods?
- [ ] Is documentation up to date?

---

## 16. ✍️ Approvals

### 16.1 Document Approval

| Role | Name | Signature | Date |
|------|------|-----------|------|
| **Project Manager** | _________________ | _________________ | ________ |
| **QA Lead** | _________________ | _________________ | ________ |
| **Automation Lead** | _________________ | _________________ | ________ |
| **Development Lead** | _________________ | _________________ | ________ |

### 16.2 Approval Notes

| Version | Approved By | Date | Comments |
|---------|-------------|------|----------|
| 1.0 | [Name] | [Date] | Initial approval |

---

## 📎 Appendices

### Appendix A: Useful Commands

```bash
# Maven Commands
mvn clean install          # Build project
mvn test                   # Run all tests
mvn test -Dtest=LoginTest  # Run specific test
mvn surefire-report:report # Generate report

# Git Commands
git status                 # Check status
git pull origin main       # Update code
git checkout -b feature/x  # Create branch
```

### Appendix B: Troubleshooting

| Issue | Solution |
|-------|----------|
| ChromeDriver version mismatch | Update ChromeDriver or use WebDriverManager |
| Element not found | Add explicit wait; verify locator |
| Test timeout | Increase wait time; check network |
| Maven build fails | Run `mvn clean install -U` |

### Appendix C: Contact Information

| Role | Contact |
|------|---------|
| QA Team | qa-team@example.com |
| Automation Support | automation@example.com |
| DevOps | devops@example.com |

---

<div align="center">

---

**📋 OrangeHRM Test Automation Plan**

*Document ID: TAP-OHM-2024-001 | Version 1.0*

[![OrangeHRM](https://img.shields.io/badge/OrangeHRM-Demo-orange?style=for-the-badge)](https://opensource-demo.orangehrmlive.com/)

**Confidential - Internal Use Only**

</div>

