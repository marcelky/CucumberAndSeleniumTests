package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchResult_Page {
	WebDriver driver;
	By tbl_list = By.xpath("//td[contains(.,'Science: Computers')]");
	By page_number1 = By.xpath("(//a[contains(text(),'1')])");
	By page_next    = By.xpath("(//a[contains(text(),'>')])");
	By page_prev    = By.xpath("(//a[contains(text(),'<')])");

	public SearchResult_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkSearchResponseContains(String string) {
		if (driver.getPageSource().contains(string)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int countNumberElementsTable() {
		List<WebElement> rows = driver.findElements(By.xpath("//td[contains(.,'Science: Computers')]"));
		return rows.size(); 
	}
	
	public boolean checkPageNumber1_displayed() {
		if (driver.findElement(page_number1)!=null) {
			return true;
		}else {
			return false;
		}
	}

	public boolean checkPageNext_displayed() {
		if (driver.findElement(page_next)!=null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkPagePrev_NotDisplayed() {
		try {
			driver.findElement(page_prev);
			return false;

		} catch (NoSuchElementException e) {
			return true; 
		}

	}
	
	
}
