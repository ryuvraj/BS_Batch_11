package Test_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void BS() {
		System.out.println("BS");
	}
	@BeforeTest
	public void BT() {
		System.out.println("BS");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/DemoLogin.html");
		driver.manage().window().maximize();
	}
	

}
