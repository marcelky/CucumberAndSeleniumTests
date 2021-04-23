package StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuestionSearchSteps {
//	WebDriver driver = null;
//
//	
//	//*********************************************************************
//	//* Part_1
//	//*********************************************************************
//	@Given("user is in the Question page")
//	public void goToQuestionPage() {
//		System.out.println("Inside step - Question page is opened");	
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is: " +  projectPath);
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/marce/eclipse-workspace2/CucumberTests/src/test/resources/drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.navigate().to("https://opentdb.com/browse.php");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//	}
//
//	
//	@And("types in the search field {string}")
//    public void inputSearchInfo(String string) {
//		System.out.println("Inside step - Input search " + string);
//		driver.findElement(By.name("query")).sendKeys(string);
//    }
//    
//	
//	@When("user clicks the search button")
//    public void clickSearchButton(){
//		System.out.println("Inside step - Click buttom");
//		driver.findElement(By.xpath("//form/div/button")).click();
//		//driver.findElement(By.name("query")).sendKeys(Keys.ENTER);
//		//driver.findElement(By.cssSelector(".btn")).click();
//    }
//   
//	
//	@Then("an error message is returned with {string}")
//    public void readNoQuestionFound(String string) {
//		System.out.println("Inside step - Receive response " + string);
//		driver.getPageSource().contains(string);
//		driver.close();
//		driver.quit();
//    }
//	
//	
//	//*********************************************************************
//	//* Part_2
//	//*********************************************************************
//
//	@Given("select a search option per category")
//	public void select_a_search_option_per_category() {
//		System.out.println("Inside step - select a search option per category");
//		Select drpTypeSearch = new Select(driver.findElement(By.id("type")));
//		drpTypeSearch.selectByVisibleText("Category");
//	}
//
//	@Then("it is displayed {int} elements in the current page")
//	public void it_is_displayed_elements_in_the_current_page(int int1) {
//		System.out.println("Inside step - it is displayed " + int1 + " elements in the current page");
//		
//		//get the number of rows from table
//		List<WebElement> rows = driver.findElements(By.xpath("//td[contains(.,'Science: Computers')]"));
//		int count = rows.size();
//		System.out.println("Rows count: " + count);
//		assertEquals(int1, count);
//			
//	}
//
//	@Then("at bottom of page there are other pages buttons and next button")
//	public void at_bottom_of_page_it_appears_more_results_in_other_pages() {
//		System.out.println("Inside step - at bottom of page there are other pages buttons and next button");
//		
//		driver.findElement(By.xpath("(//a[contains(text(),'1')])"));
//		System.out.println("Page: 1, is present");
//		driver.findElement(By.xpath("(//a[contains(text(),'>')])"));
//		System.out.println("Next page >, is present");
//		driver.close();
//		driver.quit();
//	}
//	
//	
//
//	
//	
//	//*********************************************************************
//	//* Part_3
//	//*********************************************************************
//	@Then("current results is presented at page {int}")
//	public void current_results_is_presented_at_page(Integer int1) {
//		driver.findElement(By.xpath("(//a[contains(text(),'2')])"));
//		System.out.println("Page: " + int1 + " is present");
//	}
//
//	@Then("the previous page {string} is not displayed before page {int}")
//	public void the_previous_page_is_not_displayed_before_page(String string, Integer int1) throws Exception {	
//		System.out.println("Inside step - the previous page " + string + " is not displayed before page " + int1);
//		assertTrue(verifyElementAbsent("(//a[contains(text(),'<')])"));
//		driver.close();
//		driver.quit();
//	} 
//	
//	boolean verifyElementAbsent(String locator) throws Exception {
//	    try {
//	        driver.findElement(By.xpath(locator));
//	        System.out.println("Previous Page '<' found, error");
//	        return false;
//
//	    } catch (NoSuchElementException e) {
//	        System.out.println("Previous Page '<' not found, as expected");
//	        return true; 
//	    }
//	}
 }
