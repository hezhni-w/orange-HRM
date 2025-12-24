# 🧪 OrangeHRM Test Cases Documentation

<div align="center">

![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6B35?style=for-the-badge&logo=testng&logoColor=white)
![OrangeHRM](https://img.shields.io/badge/OrangeHRM-FF6600?style=for-the-badge&logo=orange&logoColor=white)

**Comprehensive Test Case Repository for OrangeHRM Application**

*Automated Test Cases for End-to-End Quality Assurance*

---

[![Test Status](https://img.shields.io/badge/Tests-Active-success.svg)](https://opensource-demo.orangehrmlive.com/)
[![Coverage](https://img.shields.io/badge/Coverage-Comprehensive-blue.svg)](#)
[![Last Updated](https://img.shields.io/badge/Last%20Updated-December%202024-informational.svg)](#)

</div>

---

## 📑 Table of Contents

| Module | Test Count | Description |
|--------|------------|-------------|
| [🔐 Login](#-login-module) | 7 | User authentication and access control |
| [🔑 Forgot Password](#-forgot-password-module) | 6 | Password recovery functionality |
| [🚪 Logout](#-logout-module) | 3 | Session termination and security |
| [👤 Add Employee (PIM)](#-add-employee-pim-module) | 8 | Employee creation and management |
| [📋 Claim Submission](#-claim-submission-module) | 12 | Expense claim creation and processing |
| [💰 Add Expenses](#-add-expenses-module) | 4 | Expense entry and validation |
| [📎 Upload Attachments](#-upload-attachments-module) | 3 | File upload functionality |
| [🏖️ Leave Entitlement](#️-leave-entitlement-module) | 10 | Leave allocation and management |

---

## 🎨 Priority Legend

| Priority | Badge | Description |
|----------|-------|-------------|
| P1 | ![P1](https://img.shields.io/badge/P1-Critical-red) | Critical functionality - Must pass for release |
| P2 | ![P2](https://img.shields.io/badge/P2-High-orange) | High priority - Core business functionality |
| P3 | ![P3](https://img.shields.io/badge/P3-Medium-yellow) | Medium priority - Important but not blocking |

---

## 🔐 Login Module

> **Module Description**: The Login module handles user authentication for the OrangeHRM system. It validates user credentials, manages session creation, and ensures secure access to the application. This is the entry point for all users accessing the HR management system.

| Test Case ID | Summary | Priority |
|--------------|---------|----------|
| TC_LOGIN_001 | Verify that user can successfully login with valid username and password and is redirected to the Dashboard page | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_LOGIN_002 | Verify that system displays 'Invalid credentials' error message when user attempts to login with invalid username and valid password | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_LOGIN_003 | Verify that system displays 'Invalid credentials' error message when user attempts to login with valid username and invalid password | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_LOGIN_004 | Verify that 'Required' validation message appears for both username and password fields when user attempts to login with empty credentials | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_LOGIN_005 | Verify that 'Required' validation message appears under username field when user attempts to login with empty username and valid password | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_LOGIN_006 | Verify that 'Required' validation message appears under password field when user attempts to login with valid username and empty password | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_LOGIN_007 | Verify that password characters are masked (hidden) when user enters password in the password field for security purposes | ![P2](https://img.shields.io/badge/P2-High-orange) |

---

## 🔑 Forgot Password Module

> **Module Description**: The Forgot Password module provides password recovery functionality for users who have forgotten their login credentials. It allows users to request a password reset link via email, ensuring secure account recovery while maintaining system security.

| Test Case ID | Summary | Priority |
|--------------|---------|----------|
| TC_FORGOT_001 | Verify that 'Forgot your password?' link is visible and accessible on the login page | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_FORGOT_002 | Verify that user is navigated to the Reset Password page when clicking on 'Forgot your password?' link | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_FORGOT_003 | Verify that password reset link is sent via email when user submits valid username on Reset Password page | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_FORGOT_004 | Verify that appropriate error or confirmation message is displayed when user submits invalid username on Reset Password page | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_FORGOT_005 | Verify that 'Required' validation message is displayed when user attempts to reset password with empty username field | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_FORGOT_006 | Verify that user is redirected back to Login page when clicking Cancel button on Reset Password page | ![P3](https://img.shields.io/badge/P3-Medium-yellow) |

---

## 🚪 Logout Module

> **Module Description**: The Logout module handles secure session termination for authenticated users. It ensures that user sessions are properly closed, prevents unauthorized access after logout, and manages session timeout scenarios to maintain application security.

| Test Case ID | Summary | Priority |
|--------------|---------|----------|
| TC_LOGOUT_001 | Verify that user is successfully logged out and redirected to login page when clicking Logout from user profile dropdown menu | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_LOGOUT_002 | Verify that user remains on login page and cannot access dashboard when pressing browser back button after successful logout | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_LOGOUT_003 | Verify that user is automatically redirected to login page when session times out due to inactivity | ![P2](https://img.shields.io/badge/P2-High-orange) |

---

## 👤 Add Employee (PIM) Module

> **Module Description**: The Add Employee module is part of the Personnel Information Management (PIM) system. It enables HR administrators to create new employee records, upload profile pictures, generate login credentials, and manage employee data. This is a core HR function for onboarding new staff members.

| Test Case ID | Summary | Priority |
|--------------|---------|----------|
| TC_PIM_ADD_001 | Verify that employee is added successfully with mandatory fields (First Name, Last Name) and user is redirected to Personal Details page | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_PIM_ADD_002 | Verify that employee record is saved successfully with all fields filled including First Name, Middle Name, Last Name, and profile picture | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_PIM_ADD_003 | Verify that 'Required' validation message is displayed when attempting to save employee without First Name | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_PIM_ADD_004 | Verify that employee can be added successfully without Middle Name as it is an optional field | ![P3](https://img.shields.io/badge/P3-Medium-yellow) |
| TC_PIM_ADD_005 | Verify that 'Required' validation message is displayed when attempting to save employee without Last Name | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_PIM_ADD_006 | Verify that Employee ID field auto-generates a unique identifier and can be modified by the user | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_PIM_ADD_007 | Verify that profile picture can be uploaded successfully in supported formats (JPG, PNG) during employee creation | ![P3](https://img.shields.io/badge/P3-Medium-yellow) |
| TC_PIM_ADD_008 | Verify that system prevents creation of duplicate employee records with the same Employee ID | ![P1](https://img.shields.io/badge/P1-Critical-red) |

---

## 📋 Claim Submission Module

> **Module Description**: The Claim Submission module allows employees to submit expense claims for reimbursement. Users can create claim requests, select event types and currencies, add remarks, and track their claim status. This module streamlines the expense reimbursement process within the organization.

| Test Case ID | Summary | Priority |
|--------------|---------|----------|
| TC_CLAIM_001 | Verify that Claim menu is accessible and visible in the left navigation panel for logged-in users | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_CLAIM_002 | Verify that Submit Claim page loads successfully when user clicks on Submit Claim option | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_CLAIM_003 | Verify that Submit Claim page displays correct page title and header | ![P3](https://img.shields.io/badge/P3-Medium-yellow) |
| TC_CLAIM_004 | Verify that claim is submitted successfully when all mandatory fields (Event, Currency) are filled correctly | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_CLAIM_005 | Verify that Event dropdown field is clickable and displays available event options | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_CLAIM_006 | Verify that Event dropdown loads and displays all related event types configured in the system | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_CLAIM_007 | Verify that user can successfully select an event type from the Event dropdown and selection is retained | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_CLAIM_008 | Verify that Currency dropdown field is clickable and displays available currency options | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_CLAIM_009 | Verify that Currency dropdown loads and displays all configured currency types in the system | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_CLAIM_010 | Verify that user can successfully select a currency from the Currency dropdown and selection is retained | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_CLAIM_011 | Verify that appropriate error messages are displayed when user attempts to submit claim without filling mandatory fields | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_CLAIM_012 | Verify that claim can be submitted successfully without Remarks as it is an optional field | ![P3](https://img.shields.io/badge/P3-Medium-yellow) |

---

## 💰 Add Expenses Module

> **Module Description**: The Add Expenses module is a sub-component of the Claim system that allows users to add individual expense line items to their claims. Users can enter expense details including type, date, amount, and notes. This module supports detailed expense tracking and itemization.

| Test Case ID | Summary | Priority |
|--------------|---------|----------|
| TC_EXPENSE_001 | Verify that Add Expense section is displayed when user clicks Add Expense button on an existing claim | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_EXPENSE_002 | Verify that expense is added successfully to the claim when user enters valid expense details and saves | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_EXPENSE_003 | Verify that validation error is displayed when user attempts to enter negative amount in the Amount field | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_EXPENSE_004 | Verify that appropriate error messages are displayed when user attempts to save expense without filling mandatory fields | ![P2](https://img.shields.io/badge/P2-High-orange) |

---

## 📎 Upload Attachments Module

> **Module Description**: The Upload Attachments module enables users to attach supporting documents to their claims such as receipts, invoices, and other proof of expenses. It validates file types and sizes to ensure only appropriate documents are uploaded to the system.

| Test Case ID | Summary | Priority |
|--------------|---------|----------|
| TC_ATTACH_001 | Verify that attachment is uploaded successfully when user selects a valid file type (PDF, JPG, PNG) for the claim | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_ATTACH_002 | Verify that appropriate error message is displayed when user attempts to upload an unsupported file type | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_ATTACH_003 | Verify that appropriate error message is displayed when user attempts to upload a file exceeding the maximum allowed size | ![P2](https://img.shields.io/badge/P2-High-orange) |

---

## 🏖️ Leave Entitlement Module

> **Module Description**: The Leave Entitlement module manages employee leave allocations within the organization. HR administrators can assign leave entitlements to individual employees or groups, specify leave types, and set entitlement values. This module is essential for leave policy management and compliance.

| Test Case ID | Summary | Priority |
|--------------|---------|----------|
| TC_LEAVE_001 | Verify that Add Leave Entitlement page is displayed when navigating to Leave → Entitlements → Add Entitlements | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_LEAVE_002 | Verify that all mandatory fields are clearly marked with asterisk (*) on the Add Leave Entitlement page | ![P3](https://img.shields.io/badge/P3-Medium-yellow) |
| TC_LEAVE_003 | Verify that leave entitlement is added successfully for an individual employee when all required fields are filled correctly | ![P1](https://img.shields.io/badge/P1-Critical-red) |
| TC_LEAVE_004 | Verify that appropriate error message is displayed when attempting to save entitlement without selecting Employee Name | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_LEAVE_005 | Verify that appropriate error message is displayed when attempting to save entitlement without selecting Leave Type | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_LEAVE_006 | Verify that appropriate error message is displayed when attempting to save entitlement without entering Entitlement value | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_LEAVE_007 | Verify that system rejects non-numeric input and displays validation error when entering invalid characters in Entitlement field | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_LEAVE_008 | Verify that leave entitlement can be added successfully for multiple employees simultaneously using bulk assignment feature | ![P2](https://img.shields.io/badge/P2-High-orange) |
| TC_LEAVE_009 | Verify that user is navigated back to previous page without saving changes when clicking Cancel button | ![P3](https://img.shields.io/badge/P3-Medium-yellow) |
| TC_LEAVE_010 | Verify that warning or confirmation message is displayed when attempting to add duplicate entitlement for the same employee and leave type | ![P2](https://img.shields.io/badge/P2-High-orange) |

---

## 📊 Test Summary Statistics

<div align="center">

| Metric | Count |
|--------|-------|
| **Total Test Cases** | 53 |
| **P1 (Critical)** | 16 |
| **P2 (High)** | 28 |
| **P3 (Medium)** | 9 |
| **Modules Covered** | 8 |

</div>

### 📈 Priority Distribution

```
P1 Critical  ████████████████░░░░░░░░░░░░░░  30%
P2 High      ████████████████████████████░░  53%
P3 Medium    █████████░░░░░░░░░░░░░░░░░░░░░  17%
```

---

## 🔮 Future Test Cases (Planned Modules)

The following OrangeHRM modules are planned for future test coverage:

| Module | Icon | Description | Status |
|--------|------|-------------|--------|
| Dashboard | 📊 | Main dashboard widgets and analytics | 🔜 Planned |
| Admin | ⚙️ | System administration and user management | 🔜 Planned |
| Time | ⏰ | Timesheet and attendance tracking | 🔜 Planned |
| Recruitment | 👥 | Candidate management and hiring workflow | 🔜 Planned |
| Performance | 📈 | Employee performance reviews and KPIs | 🔜 Planned |
| Directory | 📒 | Employee directory and search | 🔜 Planned |
| Maintenance | 🔧 | System maintenance and data purge | 🔜 Planned |
| Buzz | 💬 | Social feed and employee engagement | 🔜 Planned |
| My Info | 👤 | Personal information management | 🔜 Planned |

---

## 📝 Notes for Test Execution

### ✅ Pre-requisites
- OrangeHRM demo application should be accessible at `https://opensource-demo.orangehrmlive.com/`
- Valid test credentials: Username: `Admin`, Password: `admin123`
- Chrome/Firefox browser with latest WebDriver

### 🔄 Test Data Reset
- The demo application resets data periodically
- Create fresh test data before each test run for data-dependent tests

### ⚠️ Known Limitations
- Demo site may have performance variations
- Some features may be disabled in demo mode
- Session timeout is configured by the demo environment

---

<div align="center">

### 📚 Document Information

| Property | Value |
|----------|-------|
| **Version** | 1.0 |
| **Created** | December 2024 |
| **Author** | QA Team |
| **Application** | OrangeHRM Demo |

---

**Happy Testing! 🚀**

[![OrangeHRM](https://img.shields.io/badge/OrangeHRM-Demo-orange?style=for-the-badge)](https://opensource-demo.orangehrmlive.com/)

</div>

