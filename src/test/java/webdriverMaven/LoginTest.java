package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void doLogin(){
		driver.get("http://gmail.com");
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("murali.sanaa@gmail.com");
		//driver.findElement(By.cssSelector(".ZFr60d.CeoRYc")).click();
		//driver.findElement(By.id("Passwd")).sendKeys("murali@123");
	}
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
}
