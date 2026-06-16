# AnglaraSoftwareSolution
Project Overview

This project automates the login functionality of the website
👉 https://www.saucedemo.com

It is built using:

Selenium WebDriver
Java
TestNG
Page Object Model (POM)
Extent HTML Reporting

The project validates both positive and negative login scenarios.

** Features
Valid Login Test
Invalid Login Test
Empty Username Test
Empty Password Test

 ** Test Scenarios Covered
| Test Case ID | Scenario       | Description                              |
| ------------ | -------------- | ---------------------------------------- |
| TC01         | Valid Login    | Login with correct username and password |
| TC02         | Invalid Login  | Login with wrong credentials             |
| TC03         | Empty Username | Leave username blank                     |
| TC04         | Empty Password | Leave password blank                     |

 
** Tools & Technologies Used
Java (JDK 8+)
Selenium WebDriver 4
Maven Build Tool
Extent Reports (HTML Reporting)
ChromeDriver

** Project Structure
LoginAutomation/
│
├── src/test/java
│   ├── base
│   │    └── BaseTest.java
│   ├── pages
│   │    └── LoginPage.java
│   ├── tests
│   │    └── LoginTest.java
│   └── utils
│        └── ReportUtil.java
│
├── pom.xml
└── reports/

 **Execution Evidence
After running tests, capture:
Test execution console output

** Expected Output
Valid login redirects to inventory page
Invalid login shows error message
Empty username shows validation error
Empty password shows validation error
HTML report shows passed/failed test cases
