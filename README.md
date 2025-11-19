## Test Automation Framework

This repository contains a modular and scalable **Test Automation Framework** built using modern Java tooling and industry-standard libraries.  
It supports **UI testing**, **API testing**, **BDD workflows**, and provides an easily maintainable structure for long-term project growth.

---

### 🚀 Tech Stack

- **Java 17** – Modern, efficient language features and long-term support
- **Selenium WebDriver** – UI test automation for web applications
- **Cucumber** – BDD-style scenarios using Gherkin syntax
- **JUnit 5** – Test execution engine with improved extensibility
- **REST Assured** – Fluent and powerful API testing support
- **Maven** – Build automation, dependency management, and test execution

---

### 📌 Key Features

- Clear separation of UI and API test layers
- BDD-style test scenarios with readable and maintainable steps
- Reusable page objects and utility classes
- Environment-based configuration management
- Integrated reporting and logging
- Easy integration into CI/CD pipelines

---
### Setup

#### Prerequisites:
- Java Development Kit (JDK) 17 or higher 
- Apache Maven 3.6+

#### Clone the repo:
```bash
git clone https://github.com/dmytroholovnia/automation-framework-poc.git
cd automation-framowork-poc
```
- install plugin - cucumber
- install plugin - lombok
---

### ▶️ Running Tests

Use Maven to execute the test suites:

**Run All tests:**
```bash
mvn clean test
```

### Reporting

After execution, comprehensive reports can be found in the project's target directory:
Cucumber HTML Report: 
```bash
target/cucumber-report.html
```
