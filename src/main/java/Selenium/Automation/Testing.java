package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naimul\\Documents\\seleniumWebdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL = "http://www.Linkedin.com";
		String expectedTitile = "Linkedin";

//		driver = new FirefoxDriver();
		driver.get(baseURL); // will navigate and wait till the entire page is loaded
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		// Thread.sleep(5000);

		driver.findElement(By.name("q")).sendKeys("Automation jobs");

		driver.findElement(By.className("btnk")).click();

		driver.findElement(By.className("btnk"));

		// driver.findElement(By.className("googleSearchButton.click"));

		String actualTitile = driver.getTitle();

		if (actualTitile.contentEquals(expectedTitile)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		// closes the browser
		driver.close();

	}
}
