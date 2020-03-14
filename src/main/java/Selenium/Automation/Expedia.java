package Selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expedia {
    public String baseUrl = "https://www.expedia.com/";
    public WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Naimul\\Documents\\seleniumWebdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Expedia - booking flights";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
       // WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
        //lastname.sendKeys("Islam");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void terminateBrowser() {
        driver.close();
    }
}