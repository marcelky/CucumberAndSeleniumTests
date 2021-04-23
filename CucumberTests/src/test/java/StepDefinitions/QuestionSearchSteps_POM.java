package StepDefinitions;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchQuestions_Page;
import pages.SearchResult_Page;
import pages.TestBase;

public class QuestionSearchSteps_POM extends TestBase{
	SearchQuestions_Page searchQuestionPage;
	SearchResult_Page searchResultPage;
	
	@After
	@Override
	public void quitDriver() {
		super.quitDriver();
	}
	
	//*********************************************************************
	//* Part_1
	//*********************************************************************
	@Given("user is in the Question page")
	public void goToQuestionPage() throws IOException {
		initializeWebDriver();
		searchQuestionPage = new SearchQuestions_Page(driver);	
	}
	
	@And("types in the search field {string}")
    public void inputSearchInfo(String string) {
		searchQuestionPage.inputQueryTxt(string);
    } 
	
	@When("user clicks the search button")
    public void clickSearchButton(){
		searchResultPage = searchQuestionPage.hitSearchButton();
    }
   
	
	@Then("an error message is returned with {string}")
    public void readNoQuestionFound(String string) {
		assertEquals(true, searchResultPage.checkSearchResponseContains(string));
	}
	

	//*********************************************************************
	//* Part_2
	//*********************************************************************

	//	Reuse step
	//	Given user is in the Question page
	//	And types in the search field "Science: Computers"
	
	@And("select a search option per category")
	public void select_a_search_option_per_category() throws IOException {
		searchQuestionPage.selectTypeQuestions();
	}
	
	//	When user clicks the search button
	
	@Then("it is displayed {int} elements in the current page")
	public void it_is_displayed_elements_in_the_current_page(int int1) {	
		assertEquals(int1, searchResultPage.countNumberElementsTable());	
	}

	@Then("at bottom of page there are other pages buttons and next button")
	public void at_bottom_of_page_it_appears_more_results_in_other_pages() {
		assertEquals(true, searchResultPage.checkPageNumber1_displayed());
		assertEquals(true, searchResultPage.checkPageNext_displayed());		
	}
	

	//*********************************************************************
	//* Part_3
	//*********************************************************************

	
	//    Reuse steps	
	//    Given user is in the Question page
	//    And types in the search field "Science: Computers"
	//    And select a search option per category
	//    When user clicks the search button
	//    Then it is displayed 25 elements in the current page	
	
	
	@Then("current results is presented at page {int}")
	public void current_results_is_presented_at_page(Integer int1) {
		assertEquals(true, searchResultPage.checkPageNumber1_displayed());
	}

	@Then("the previous page {string} is not displayed before page {int}")
	public void the_previous_page_is_not_displayed_before_page(String string, Integer int1) throws Exception {	
		assertEquals(true, searchResultPage.checkPagePrev_NotDisplayed());
	} 
	
 }
