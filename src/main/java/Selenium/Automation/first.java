package Selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naimul\\Documents\\seleniumWebdriver\\chromedriver.exe");
		// WebDriver driver;

		WebDriver driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.close();
	}

}
