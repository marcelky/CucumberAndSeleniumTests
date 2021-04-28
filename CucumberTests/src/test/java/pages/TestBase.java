package pages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {  
public WebDriver driver;  

	public void initializeWebDriver() throws IOException {  
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().driverVersion("90.0.4430.93").setup();
		driver = new ChromeDriver(chromeOptions);
		

		driver.manage().window().maximize();  

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("https://opentdb.com/browse.php");

	}  

	public void quitDriver() {  
		driver.quit();  
	}  
}