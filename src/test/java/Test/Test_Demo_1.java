package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Demo_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// Locator ---Name
		WebElement emailAddress=driver.findElement(By.name("email"));
		emailAddress.sendKeys("ddif@gmail.com");
		
		// Locator ---Id
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("1234567");
		
		// No Such Element Exception
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
	}

}
