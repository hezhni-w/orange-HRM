# 📘 Coding & Naming Conventions Guide

<div align="center">

![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6B35?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

**OrangeHRM Test Automation Framework**

*A comprehensive guide for writing clean, maintainable, and professional test automation code*

---

[![Made with ❤️](https://img.shields.io/badge/Made%20with-❤️-red.svg)](https://opensource-demo.orangehrmlive.com/)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](http://makeapullrequest.com)
[![Beginner Friendly](https://img.shields.io/badge/Beginner-Friendly-blue.svg)](#)

</div>

---

## 📑 Table of Contents

| Section | Description |
|---------|-------------|
| [🎯 What Are Coding & Naming Conventions?](#-what-are-coding--naming-conventions) | Understanding the basics |
| [💡 Why Are They Important?](#-why-are-they-important) | Benefits and importance |
| [📁 Project Folder Structure](#-project-folder-structure) | How our project is organized |
| [📦 Package Naming](#-package-naming) | Naming packages correctly |
| [📄 Class Naming](#-class-naming) | Naming classes properly |
| [🔌 Interface Naming](#-interface-naming) | Interface conventions |
| [🔧 Method Naming](#-method-naming) | Method naming rules |
| [📊 Variable Naming](#-variable-naming) | Variable conventions |
| [🔒 Constants Naming](#-constants-naming) | Constant naming rules |
| [🧪 Test Naming](#-test-naming) | Test method conventions |
| [📝 Comments & JavaDoc](#-comments--javadoc) | Documentation practices |
| [⚙️ Configuration Files](#️-configuration-files) | pom.xml, testng.xml, .gitignore |
| [🔗 Official References](#-official-references) | Links to official docs |
| [🚀 Continuous Improvement](#-continuous-improvement) | Growing as a team |

---

## 🎯 What Are Coding & Naming Conventions?

> **Coding conventions** are a set of guidelines and best practices that developers follow when writing code. They define how code should be structured, formatted, and organized.

> **Naming conventions** are specific rules about how to name different elements in your code — like classes, methods, variables, and files.

### 🌟 Think of it like this:

| Real World | Programming |
|------------|-------------|
| 📚 Library organizing books by category | 📁 Organizing code into packages |
| 🏷️ Labeling folders clearly | 📝 Naming classes descriptively |
| 📖 Writing in complete sentences | 💬 Writing readable code |

---

## 💡 Why Are They Important?

<table>
<tr>
<td width="50%">

### ✅ Benefits

- 📖 **Readability** - Code is easier to read and understand
- 🔧 **Maintainability** - Easier to fix bugs and add features
- 🤝 **Collaboration** - Team members can work together smoothly
- 🐛 **Fewer Bugs** - Consistent code has fewer errors
- ⏱️ **Time Saving** - Less time spent understanding code
- 📚 **Self-Documenting** - Good names explain the code

</td>
<td width="50%">

### ❌ Without Conventions

- 😵 Confusing and messy code
- 🔥 Difficult to debug
- 😤 Team conflicts
- 🐌 Slow development
- 💸 Higher maintenance costs
- 📉 Poor code quality

</td>
</tr>
</table>

> 💎 **Remember**: *"Code is read more often than it is written."* — Guido van Rossum

---

## 📁 Project Folder Structure

Our OrangeHRM test automation project follows a standard Maven structure with Page Object Model (POM) design pattern.

```
📦 orange-HRM-2/
├── 📁 docs/                          # 📚 Documentation files
│   └── 📄 CODING_AND_NAMING_CONVENTIONS.md
├── 📁 src/
│   ├── 📁 main/
│   │   └── 📁 java/                  # 🏭 Production code (if needed)
│   └── 📁 test/
│       └── 📁 java/
│           └── 📁 com/ohm/selenium/  # 🧪 Test automation code
│               ├── 📁 pages/         # 📄 Page Object classes
│               ├── 📁 tests/         # 🧪 Test classes
│               │   ├── 📁 login/     # Login module tests
│               │   ├── 📁 dashboard/ # Dashboard module tests
│               │   ├── 📁 claim/     # Claim module tests
│               │   └── 📁 addemployee/
│               ├── 📁 ui/            # 🎨 Custom UI components
│               ├── 📁 utils/         # 🔧 Utility/Helper classes
│               └── 📄 TestBase.java  # 🏗️ Base test class
├── 📄 pom.xml                        # 📦 Maven configuration
├── 📄 testng.xml                     # 🧪 TestNG suite configuration
└── 📄 .gitignore                     # 🚫 Git ignore rules
```

### 📂 Folder Descriptions

| Folder | Purpose | Example Contents |
|--------|---------|------------------|
| `docs/` | Project documentation | Conventions, guides, README |
| `pages/` | Page Object classes | `LoginPage.java`, `DashBoardPage.java` |
| `tests/` | Test classes organized by module | `LoginTests.java` |
| `ui/` | Custom UI component wrappers | `Check.java`, `Dropdown.java` |
| `utils/` | Helper/Utility classes | `WaitUtils.java`, `ConfigReader.java` |

---

## 📦 Package Naming

### 📏 Rules

| Rule | Description |
|------|-------------|
| ✅ All lowercase | Never use uppercase letters |
| ✅ Use dots as separators | Dots separate logical parts |
| ✅ Start with reverse domain | Company domain in reverse |
| ✅ Be descriptive | Name should indicate contents |
| ❌ No underscores | Avoid special characters |
| ❌ No numbers at start | Don't start with digits |

### 💻 Examples from Our Project

```java
// ✅ CORRECT - Our project packages
package com.ohm.selenium;           // Base package
package com.ohm.selenium.pages;     // Page objects
package com.ohm.selenium.tests;     // Test classes
package com.ohm.selenium.ui;        // UI components
package com.ohm.selenium.utils;     // Utilities

// ❌ INCORRECT - Don't do this
package Com.OHM.Selenium;           // No uppercase
package com.ohm.selenium_pages;     // No underscores
package com.ohm.selenium.123tests;  // No numbers at start
```

---

## 📄 Class Naming

### 📏 Rules

| Rule | Description |
|------|-------------|
| ✅ PascalCase | First letter of each word capitalized |
| ✅ Nouns | Classes represent things/objects |
| ✅ Descriptive | Name should explain purpose |
| ✅ Suffix pattern | Use consistent suffixes |
| ❌ No abbreviations | Avoid unclear short forms |
| ❌ No underscores | Use PascalCase instead |

### 🎨 Class Naming Patterns

| Class Type | Suffix | Example |
|------------|--------|---------|
| Page Objects | `Page` | `LoginPage`, `DashBoardPage` |
| Test Classes | `Test` or `Tests` | `LoginTest`, `DashboardTests` |
| Base Classes | `Base` | `TestBase`, `PageBase` |
| Utility Classes | `Utils` or `Helper` | `WaitUtils`, `ConfigHelper` |
| Custom Components | Descriptive noun | `Check`, `Dropdown` |

### 💻 Examples from Our Project

```java
// ✅ CORRECT - Page Object classes
public class LoginPage { }
public class DashBoardPage { }
public class AddEmployeePage { }
public class LeftMenuPage { }
public class TopMenuPage { }

// ✅ CORRECT - Test classes
public class LoginTest { }
public class BrowserLoadingTest { }

// ✅ CORRECT - Base classes
public class TestBase { }

// ✅ CORRECT - UI Component classes
public class Check { }

// ❌ INCORRECT - Don't do this
public class login_page { }         // No underscores, use PascalCase
public class loginpage { }          // Use PascalCase
public class LP { }                 // Too abbreviated
public class PageForLogin { }       // Suffix should be "Page"
```

---

## 🔌 Interface Naming

### 📏 Rules

| Rule | Description |
|------|-------------|
| ✅ PascalCase | Same as classes |
| ✅ Prefix with `I` | Common convention: `ICheck` |
| ✅ Or use adjectives | Describes capability: `Clickable` |
| ✅ Describes behavior | What it can do |

### 💻 Examples from Our Project

```java
// ✅ CORRECT - Interface with 'I' prefix
public interface ICheck {
    void check();
    void unCheck();
    boolean isChecked();
    boolean isNotChecked();
    boolean isDisabled();
    boolean isEnabled();
}

// ✅ CORRECT - Alternative naming styles
public interface Clickable { }      // Adjective describing capability
public interface Scrollable { }     // What it can do
public interface Waitable { }       // Behavior-based

// ❌ INCORRECT - Don't do this
public interface check { }          // Use PascalCase
public interface CheckInterface { } // Redundant "Interface" suffix
```

---

## 🔧 Method Naming

### 📏 Rules

| Rule | Description |
|------|-------------|
| ✅ camelCase | First word lowercase, rest capitalized |
| ✅ Start with verb | Methods perform actions |
| ✅ Be descriptive | Name explains what it does |
| ✅ Boolean prefix | Use `is`, `has`, `can` for booleans |

### 🎨 Method Naming Patterns

| Action Type | Prefix | Examples |
|-------------|--------|----------|
| Get data | `get` | `getErrorMessage()`, `getTitle()` |
| Set data | `set` | `setUsername()`, `setValue()` |
| Check state | `is`, `has`, `can` | `isChecked()`, `hasError()` |
| Perform action | `click`, `type`, `open` | `clickLogin()`, `typePassword()` |
| Navigate | `navigate`, `open`, `go` | `openDashboard()`, `goToAdmin()` |
| Wait | `wait` | `waitForElement()`, `waitUntilVisible()` |
| Clear | `clear` | `clearUsername()`, `clearForm()` |

### 💻 Examples from Our Project

```java
// ✅ CORRECT - From LoginPage.java
public LoginPage typeUsername(String username) {
    usernameField.sendKeys(username);
    return this;
}

public LoginPage typePassword(String password) {
    passwordField.sendKeys(password);
    return this;
}

public void clickLoginButton() {
    loginButton.click();
}

public String getErrorMessageUsername() {
    return errorMessageUsername.getText();
}

public void login(String username, String password) {
    typeUsername(username).typePassword(password).clickLoginButton();
}

// ✅ CORRECT - From Check.java (Boolean methods)
public boolean isChecked() {
    return element.isSelected();
}

public boolean isNotChecked() {
    return !isChecked();
}

public boolean isEnabled() {
    return element.isEnabled();
}

// ✅ CORRECT - From LeftMenuPage.java
public void clickAdmin() {
    admin.click();
}

public void clickDashboard() {
    dashboard.click();
}

// ❌ INCORRECT - Don't do this
public void Login() { }             // Should be lowercase 'l'
public void click_login() { }       // No underscores
public String username() { }        // Should start with 'get'
public boolean checked() { }        // Should be 'isChecked'
```

---

## 📊 Variable Naming

### 📏 Rules

| Rule | Description |
|------|-------------|
| ✅ camelCase | First word lowercase, rest capitalized |
| ✅ Descriptive | Name explains what it holds |
| ✅ Nouns | Variables hold things |
| ✅ Meaningful | Avoid single letters (except loops) |
| ❌ No Hungarian notation | Don't prefix with type |

### 🎨 Variable Naming Patterns

| Variable Type | Convention | Examples |
|---------------|------------|----------|
| WebElement | Descriptive + type hint | `usernameField`, `loginButton` |
| WebDriver | `driver` or `webDriver` | `driver`, `webDriver` |
| String | Descriptive noun | `username`, `errorMessage` |
| Boolean | `is`, `has`, `can` prefix | `isLoggedIn`, `hasError` |
| Collections | Plural nouns | `users`, `menuItems` |

### 💻 Examples from Our Project

```java
// ✅ CORRECT - WebElement variables (from LoginPage.java)
@FindBy(name = "username")
private WebElement usernameField;

@FindBy(name = "password")
private WebElement passwordField;

@FindBy(xpath = "//button[@type='submit']")
private WebElement loginButton;

@FindBy(xpath = "//input[@placeholder='Username']/following::span[1]")
private WebElement errorMessageUsername;

// ✅ CORRECT - WebDriver variable
private final WebDriver driver;
private WebDriver webDriver;

// ✅ CORRECT - From LeftMenuPage.java
@FindBy(xpath = "//span[text()='Admin']")
private WebElement admin;

@FindBy(xpath = "//span[text()='Dashboard']")
private WebElement dashboard;

// ✅ CORRECT - Other variables
private String baseUrl;
private int timeout;
private boolean isLoggedIn;
private List<WebElement> menuItems;

// ❌ INCORRECT - Don't do this
private WebElement btn;             // Too abbreviated
private WebElement x;               // Not descriptive
private String strUsername;         // No Hungarian notation
private WebElement USERNAME_FIELD;  // Not a constant
```

---

## 🔒 Constants Naming

### 📏 Rules

| Rule | Description |
|------|-------------|
| ✅ SCREAMING_SNAKE_CASE | All uppercase with underscores |
| ✅ `static final` | Constants are static and final |
| ✅ Descriptive | Name explains the value |
| ✅ Group related | Keep related constants together |

### 💻 Examples from Our Project

```java
// ✅ CORRECT - From BrowserLoadingTest.java
public static final String BASE_URL =
    "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";

// ✅ CORRECT - Other constant examples
public static final int DEFAULT_TIMEOUT = 10;
public static final int EXPLICIT_WAIT = 15;
public static final String ADMIN_USERNAME = "Admin";
public static final String ADMIN_PASSWORD = "admin123";
public static final String LOGIN_PAGE_TITLE = "OrangeHRM";

// ✅ CORRECT - Grouped constants
public static final class Timeouts {
    public static final int SHORT = 5;
    public static final int MEDIUM = 10;
    public static final int LONG = 30;
}

public static final class URLs {
    public static final String BASE = "https://opensource-demo.orangehrmlive.com";
    public static final String LOGIN = BASE + "/web/index.php/auth/login";
    public static final String DASHBOARD = BASE + "/web/index.php/dashboard/index";
}

// ❌ INCORRECT - Don't do this
public static final String baseUrl = "...";     // Should be SCREAMING_CASE
public static final String BASE_URL_STRING = "..."; // Redundant "STRING"
public String BASE_URL = "...";                 // Missing static final
```

---

## 🧪 Test Naming

### 📏 Rules

| Rule | Description |
|------|-------------|
| ✅ Descriptive | Name explains what is being tested |
| ✅ Pattern | `test` + `WhatIsBeingTested` + `ExpectedBehavior` |
| ✅ Use `@Test` | TestNG annotation |
| ✅ Readable | Should read like a sentence |

### 🎨 Test Naming Patterns

```
test[Feature][Scenario][ExpectedResult]
```

| Pattern | Example |
|---------|---------|
| `test` + Feature + Scenario | `testLoginWithValidCredentials` |
| `test` + Feature + `Should` + Result | `testLoginShouldDisplayDashboard` |
| `verify` + Feature + Behavior | `verifyLoginButtonIsClickable` |

### 💻 Examples

```java
// ✅ CORRECT - Descriptive test names
@Test
public void testLoginWithValidCredentials() {
    // Test implementation
}

@Test
public void testLoginWithInvalidUsernameShouldShowError() {
    // Test implementation
}

@Test
public void testLoginWithEmptyPasswordShouldShowValidation() {
    // Test implementation
}

@Test
public void testDashboardDisplaysAfterSuccessfulLogin() {
    // Test implementation
}

@Test
public void testLogoutRedirectsToLoginPage() {
    // Test implementation
}

@Test
public void verifyAddEmployeeFormFieldsAreVisible() {
    // Test implementation
}

// ❌ INCORRECT - Don't do this
@Test
public void test1() { }             // Not descriptive
@Test
public void login() { }             // Missing 'test' prefix
@Test
public void testLogin() { }         // Too vague
@Test
public void TEST_LOGIN() { }        // Wrong case
```

---

## 📝 Comments & JavaDoc

### 🎯 Why Comments Matter

Comments help explain **why** code does something, not **what** it does. Good code should be self-explanatory, but comments provide context.

### 📏 Types of Comments

| Type | Syntax | Purpose |
|------|--------|---------|
| Single-line | `// comment` | Brief explanations |
| Multi-line | `/* comment */` | Longer explanations |
| JavaDoc | `/** comment */` | API documentation |

### 💻 JavaDoc Comments

JavaDoc is used to generate documentation for your code. It's especially important for public classes and methods.

```java
/**
 * Represents the Login Page of OrangeHRM application.
 * This page object contains all elements and actions related to user login.
 *
 * <p>Example usage:</p>
 * <pre>
 * LoginPage loginPage = new LoginPage(driver);
 * loginPage.login("Admin", "admin123");
 * </pre>
 *
 * @author Your Name
 * @version 1.0
 * @since 2024-01-01
 * @see DashBoardPage
 */
public class LoginPage {

    /** The WebDriver instance for browser interactions */
    private final WebDriver driver;

    /** Input field for entering username */
    @FindBy(name = "username")
    private WebElement usernameField;

    /**
     * Constructs a new LoginPage instance.
     * Initializes all page elements using PageFactory.
     *
     * @param driver the WebDriver instance to use
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Types the username into the username field.
     *
     * @param username the username to enter
     * @return this LoginPage instance for method chaining
     */
    public LoginPage typeUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    /**
     * Performs login with the given credentials.
     *
     * @param username the username to login with
     * @param password the password to login with
     * @throws IllegalArgumentException if username or password is null
     */
    public void login(String username, String password) {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Credentials cannot be null");
        }
        typeUsername(username).typePassword(password).clickLoginButton();
    }
}
```

### 🏷️ Common JavaDoc Tags

| Tag | Description | Example |
|-----|-------------|---------|
| `@param` | Describes a parameter | `@param username the login username` |
| `@return` | Describes return value | `@return the error message text` |
| `@throws` | Describes exceptions | `@throws NoSuchElementException if element not found` |
| `@see` | Reference to related class/method | `@see DashBoardPage` |
| `@author` | Author of the code | `@author John Doe` |
| `@version` | Version number | `@version 1.0` |
| `@since` | When it was added | `@since 2024-01-01` |
| `@deprecated` | Marks as deprecated | `@deprecated Use newMethod() instead` |

### ✅ Good Comment Practices

```java
// ✅ GOOD - Explains WHY
// Using explicit wait because the element loads dynamically via AJAX
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// ✅ GOOD - Explains business logic
// Employee ID must be unique, so we generate a random suffix
String employeeId = "EMP" + System.currentTimeMillis();

// ✅ GOOD - TODO with context
// TODO: Implement retry logic for flaky network conditions

// ✅ GOOD - Warning about non-obvious behavior
// WARNING: This method clears the session, user will need to re-login

// ❌ BAD - States the obvious
// Click the login button
loginButton.click();

// ❌ BAD - Outdated comment
// Sets the username (actually sets password now)
passwordField.sendKeys(value);
```

---

## ⚙️ Configuration Files

### 📦 pom.xml (Maven Configuration)

The `pom.xml` file is the heart of a Maven project. It defines project dependencies, plugins, and build configuration.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <!-- 📋 Project Identification -->
    <groupId>lk.boc.selenium</groupId>      <!-- Company/organization -->
    <artifactId>orange-HRM</artifactId>      <!-- Project name -->
    <version>1.0-SNAPSHOT</version>          <!-- Version number -->

    <!-- ⚙️ Properties - Define versions in one place -->
    <properties>
        <maven.compiler.source>25</maven.compiler.source>
        <maven.compiler.target>25</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <selenium-java.version>4.39.0</selenium-java.version>
        <testng.version>7.11.0</testng.version>
    </properties>

    <!-- 📚 Dependencies - External libraries -->
    <dependencies>
        <!-- Selenium WebDriver -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium-java.version}</version>
        </dependency>

        <!-- TestNG Testing Framework -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>${testng.version}</version>
        </dependency>

        <!-- DataFaker for Test Data -->
        <dependency>
            <groupId>net.datafaker</groupId>
            <artifactId>datafaker</artifactId>
            <version>2.5.3</version>
        </dependency>
    </dependencies>
</project>
```

#### 💡 Key Points:
- Use **properties** for version numbers (easy to update)
- Keep dependencies **organized** and **commented**
- Use **semantic versioning** (MAJOR.MINOR.PATCH)

---

### 🧪 testng.xml (TestNG Suite Configuration)

The `testng.xml` file defines how tests are organized and executed.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<!-- 🧪 Test Suite Configuration -->
<suite name="OrangeHRM Test Suite" parallel="false" verbose="2">

    <!-- 📊 Listeners for reporting -->
    <listeners>
        <listener class-name="org.testng.reporters.JUnitReportReporter"/>
    </listeners>

    <!-- 🔧 Global Parameters -->
    <parameter name="browser" value="chrome"/>
    <parameter name="baseUrl" value="https://opensource-demo.orangehrmlive.com"/>

    <!-- 🧪 Test Group: Login Module -->
    <test name="Login Tests">
        <classes>
            <class name="com.ohm.selenium.tests.login.LoginTest"/>
            <class name="com.ohm.selenium.tests.login.LoginValidationTest"/>
        </classes>
    </test>

    <!-- 🧪 Test Group: Dashboard Module -->
    <test name="Dashboard Tests">
        <classes>
            <class name="com.ohm.selenium.tests.dashboard.DashboardTest"/>
        </classes>
    </test>

    <!-- 🧪 Test Group: Employee Module -->
    <test name="Employee Tests">
        <packages>
            <package name="com.ohm.selenium.tests.addemployee"/>
        </packages>
    </test>

    <!-- 🧪 Run specific groups -->
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

</suite>
```

#### 💡 Key Attributes:

| Attribute | Description | Values |
|-----------|-------------|--------|
| `parallel` | Run tests in parallel | `false`, `tests`, `classes`, `methods` |
| `verbose` | Logging level | `0` to `10` |
| `thread-count` | Number of threads | Any positive integer |
| `preserve-order` | Maintain test order | `true`, `false` |

---

### 🚫 .gitignore (Git Ignore Rules)

The `.gitignore` file tells Git which files to ignore.

```gitignore
# ═══════════════════════════════════════════════════════════════
# 🚫 .gitignore for Selenium Java Project
# ═══════════════════════════════════════════════════════════════

# ─────────────────────────────────────────────────────────────────
# 📦 Build Outputs
# ─────────────────────────────────────────────────────────────────
target/
build/
out/
*.class
*.jar
*.war

# ─────────────────────────────────────────────────────────────────
# 💻 IDE Files
# ─────────────────────────────────────────────────────────────────
# IntelliJ IDEA
.idea/
*.iml
*.ipr
*.iws

# Eclipse
.classpath
.project
.settings/

# VS Code
.vscode/

# ─────────────────────────────────────────────────────────────────
# 📊 Test Reports & Logs
# ─────────────────────────────────────────────────────────────────
test-output/
reports/
logs/
*.log
surefire-reports/

# ─────────────────────────────────────────────────────────────────
# 📸 Screenshots & Downloads
# ─────────────────────────────────────────────────────────────────
screenshots/
downloads/

# ─────────────────────────────────────────────────────────────────
# 🔐 Sensitive Files
# ─────────────────────────────────────────────────────────────────
*.properties
!src/test/resources/config.properties.example
secrets/
credentials/

# ─────────────────────────────────────────────────────────────────
# 💾 System Files
# ─────────────────────────────────────────────────────────────────
.DS_Store
Thumbs.db
*.tmp
*.temp
```

#### 💡 Key Points:
- **Never commit** sensitive data (passwords, API keys)
- **Ignore** IDE-specific files
- **Ignore** build outputs and logs
- **Keep** example configuration files

---

## 🔗 Official References

### 📚 Essential Documentation

<table>
<tr>
<td width="50%">

#### ☕ Java

| Resource | Link |
|----------|------|
| Java Naming Conventions | [Oracle Java Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html) |
| Java Code Conventions | [Oracle Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html) |
| Java Documentation | [Oracle Java Docs](https://docs.oracle.com/en/java/) |
| JavaDoc Guide | [JavaDoc Tool](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html) |

</td>
<td width="50%">

#### 🧪 Testing

| Resource | Link |
|----------|------|
| Selenium Documentation | [Selenium Docs](https://www.selenium.dev/documentation/) |
| TestNG Documentation | [TestNG Docs](https://testng.org/doc/documentation-main.html) |
| Page Object Model | [Selenium Page Objects](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/) |
| Page Factory | [Page Factory Pattern](https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/PageFactory.html) |

</td>
</tr>
</table>

### 🛠️ Build Tools

| Resource | Link |
|----------|------|
| Maven Documentation | [Maven Docs](https://maven.apache.org/guides/) |
| Maven POM Reference | [POM Reference](https://maven.apache.org/pom.html) |
| Maven Repository | [MVN Repository](https://mvnrepository.com/) |

---

## 🚀 Continuous Improvement

<div align="center">

### 💎 This Document is a Living Baseline

</div>

> *"The only way to go fast is to go well."* — Robert C. Martin (Uncle Bob)

### 🌱 How to Improve

This document serves as a **starting point** for our coding standards. As our project grows and we learn more, we should:

| Action | Description |
|--------|-------------|
| 📝 **Review Regularly** | Schedule periodic reviews of conventions |
| 🔄 **Refactor Often** | Continuously improve existing code |
| 💬 **Discuss Changes** | Team discussions before major changes |
| 📚 **Learn & Adapt** | Stay updated with industry best practices |
| 🧪 **Experiment** | Try new patterns and evaluate them |

### ✅ Code Review Checklist

Use this checklist during code reviews:

- [ ] Are class names in PascalCase?
- [ ] Are method names in camelCase and start with verbs?
- [ ] Are variable names descriptive?
- [ ] Are constants in SCREAMING_SNAKE_CASE?
- [ ] Are test names descriptive and follow the pattern?
- [ ] Are JavaDoc comments present for public methods?
- [ ] Is the code properly formatted?
- [ ] Are there no magic numbers/strings?
- [ ] Is the Page Object pattern followed correctly?
- [ ] Are WebElements properly named?

### 🎯 Goals for Excellence

```
┌─────────────────────────────────────────────────────────────────┐
│                                                                 │
│   📖 Readable     →  Anyone can understand the code            │
│   🔧 Maintainable →  Easy to modify and extend                 │
│   🧪 Testable     →  Easy to write and run tests               │
│   🔄 Reusable     →  Components can be reused                  │
│   📚 Documented   →  Well-documented for future reference      │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘
```

---

## 📋 Quick Reference Card

<div align="center">

### 🎨 Naming At-a-Glance

</div>

| Element | Convention | Example |
|---------|------------|---------|
| 📦 Package | `lowercase.with.dots` | `com.ohm.selenium.pages` |
| 📄 Class | `PascalCase` | `LoginPage`, `TestBase` |
| 🔌 Interface | `IPascalCase` or `Adjective` | `ICheck`, `Clickable` |
| 🔧 Method | `camelCase` (verb) | `clickLogin()`, `getTitle()` |
| 📊 Variable | `camelCase` (noun) | `usernameField`, `driver` |
| 🔒 Constant | `SCREAMING_SNAKE_CASE` | `BASE_URL`, `TIMEOUT` |
| 🧪 Test | `testFeatureScenario` | `testLoginWithValidCredentials` |
| 📁 Test Folder | `lowercase` | `login`, `dashboard` |

---

<div align="center">

### 🙏 Thank You for Following These Conventions!

*Clean code is not written by following a set of rules. You don't become a software craftsman by learning a list of heuristics. Professionalism and craftsmanship come from values that drive disciplines.*

— Robert C. Martin

---

**Happy Testing! 🚀**

[![OrangeHRM](https://img.shields.io/badge/OrangeHRM-Demo-orange?style=for-the-badge)](https://opensource-demo.orangehrmlive.com/)

</div>
