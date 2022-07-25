package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_FBPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("yuvraj@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		
	}

}
