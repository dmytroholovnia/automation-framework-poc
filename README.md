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

### ▶️ Running Tests

Use Maven to execute the test suites:

**Run All tests:**
```bash
mvn clean test
```


**Run UI tests:**
```bash
mvn clean test -Dcucumber.filter.tags="@ui"
