# CucumberAndSeleniumTests

The goal of this project was learn and practice how to create tests using BDD - Behavior Driven Development.
During the first implementation it was more like as spaghetti code, when the steps definitions had the Selenium locators along
with the assert of test. This way the code was quite hard to read, difficult to maintain, not reusable and prone for errors.

So after study a bit more about best practices for Selenium automation, I could improve the process of testing creation,
make it easier to code and improve the overall quality of tests.

Here are the reference used:
- 16 Selenium Best Practices For Efficient Test Automation
- https://www.lambdatest.com/blog/selenium-best-practices-for-web-testing/

The most important point which I apply in this new implmentation was the desing pattern POM - Page Object Model, with 
this in mind, for each webpage it is concentrate the selenium locators and actions to interact with it. The step.java
continue to exist, but there it only calls the methods defined in the class for each webpage and execute the assertion of
tests steps. POM design pattern recommend never include any assertion in the webpage class, in order to separate the webpage interface from test 
execution.

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

Using /CucumberTests/src/test/resources/Features/**questionSearchSteps_POM.feature**
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


