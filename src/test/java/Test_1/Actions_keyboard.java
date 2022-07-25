package Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_keyboard {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  
		  // email ---> test
		  WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		  Actions act=new Actions(driver);
		  act.keyDown(email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		  
		  //TEST
		  act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		  act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		  
		  WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		  password.click();
		  
		  act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		  //driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
		  
		 }

		
	}

