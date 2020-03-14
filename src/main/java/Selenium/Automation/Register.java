package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naimul\\Documents\\seleniumWebdriver\\chromedriver.exe");

		// WebDriver
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseUrl);

		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		firstname.sendKeys("Naimul");

		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("Islam");

		Thread.sleep(1000);
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("917-348-5970");

		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("islamnaimul1@gmail.com");

		Thread.sleep(1000);
		WebElement address = driver.findElement(By.xpath("//*[contains(@name, 'address1')]"));
		address.sendKeys("5 Avenue C");

		Thread.sleep(1000);
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Brooklyn");

		Thread.sleep(1000);
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("New York");

		Thread.sleep(1000);
		WebElement postalcode = driver.findElement(By.name("postalCode"));
		postalcode.sendKeys("11218");

		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.name("country"));
		Select country = new Select(dropdown);
		dropdown.sendKeys("UNITED STATES");

		Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("Nislam4");

		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");

		Thread.sleep(1000);
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));
		confirmpassword.sendKeys("12345");

		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();

		// Getting the sign up message
		WebElement textElement = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));

		Thread.sleep(1000);
		// Printing out message
		System.out.println(textElement.getText());

		// closes the browser
		driver.close();
	}
}
/*
 * First name = absolute xpath Last name = relative xpath Phone = name Email =ID
 * Address = contains with xpath City = name
 */