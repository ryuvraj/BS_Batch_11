package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/DemoLogin.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Test");
		driver.findElement(By.name("PW")).sendKeys("123456789");
	}

}
