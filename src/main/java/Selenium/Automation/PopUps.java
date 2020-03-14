package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naimul\\Documents\\seleniumWebdriver\\chromedriver.exe");

		// WebDriver
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/";
		driver.get(baseUrl);

		Thread.sleep(2000);
		// ClickButton
		WebElement clickButton = driver.findElement(By.xpath("//a[@id='cookie_action_close_header']"));
		clickButton.click();

		// WebElement rightClickButton =
		// driver.findElement(By.cssSelector(".context-menu-one.btn"));

		// Actions action = new Actions(driver);

		// WebElement doubleClickButton =
		// driver.findElement(By.xpath("//body[@id='authentication']//button"));
		// action.doubleClick(doubleClickButton).perform();

	}

}
