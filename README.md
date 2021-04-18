# CucumberAndSeleniumTests

The goal of this project was learn and practice how to create tests using BDD - Behavior Driven Development.

# Environment
This project was executed in Windows 10 environemt.

# Main Tools 
- Eclipse IDE for Enterprise Java and Web Developers
- Maven plugin
- Cucumber 
- Junit
- Selenium 
- Chrome Webdriver
- Maven Cucumber reporting

# Execution of Test
The test suite can be executed using three different ways:
- **Run as Cucumber feature**

Using /CucumberTests/src/test/resources/Features/**questionSearch.feature**
Running this way only generate a report "pretty" in the console.

- **Run as Junit**

Using /CucumberTests/src/test/java/StepDefinitions/**TestRunner.java**
Generate reports in the format json, xml and html.

- **Run as Maven** (remember to set in the Run Configuration-> goals = clean install

Using /**CucumberTest** project. 
Generate a more user friendly report with more graphic informations.

# Reports Location
**Basic reports** are located at **/CucumberTests/target/cucumber-reports**:
- Cucumber.json
- Cucumber.xml
- HtmlReports.html

**Advanced reports** is located at **/CucumberTests/target/cucumber-reports/advanced-reports/cucumber-html-reports**:
- overview-feature.html


