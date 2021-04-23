package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchQuestions_Page {
	WebDriver driver;
	By txt_inputQuery = By.name("query");
	By btn_search     = By.xpath("//form/div/button");
	By drp_type       = By.id("type");
	
	public SearchQuestions_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void inputQueryTxt (String str) {
		driver.findElement(txt_inputQuery).sendKeys(str);
	}

	public SearchResult_Page hitSearchButton() {
		driver.findElement(btn_search).click();
		return new SearchResult_Page(driver);
	}
	
	public void selectTypeQuestions() {
		Select drpTypeSearch = new Select(driver.findElement(drp_type));
		drpTypeSearch.selectByVisibleText("Category");
	}
	
}
