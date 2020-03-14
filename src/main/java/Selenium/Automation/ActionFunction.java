package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionFunction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naimul\\Documents\\seleniumWebdriver\\chromedriver.exe");

		// WebDriver
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		driver.get(baseUrl);

		// ClickButton
		WebElement clickButton = driver.findElement(By.className("myFunction()"));

		// WebElement rightClickButton =
		// driver.findElement(By.cssSelector(".context-menu-one.btn"));

		// Actions action = new Actions(driver);

		// WebElement doubleClickButton =
		// driver.findElement(By.xpath("//body[@id='authentication']//button"));
		// action.doubleClick(doubleClickButton).perform();

	}

}
