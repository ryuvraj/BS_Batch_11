package Test_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {

	WebDriver driver;
	
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/DemoLogin.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test_1() {
		driver.findElement(By.name("email")).sendKeys("Test123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.xpath("")).click();
	}
	@AfterMethod
	public void AM() {
		driver.close();
	}
}
