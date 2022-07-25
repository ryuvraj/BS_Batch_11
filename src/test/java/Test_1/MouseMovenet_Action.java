package Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovenet_Action {

	public static void main(String[] args) throws InterruptedException {

		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  driver.manage().window().maximize();
		  
		  Actions act=new Actions(driver);
		  
		  Thread.sleep(2000);
		  WebElement Selenium=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		  Thread.sleep(2000);
		  act.moveToElement(Selenium).click().build().perform();
		  
		  Thread.sleep(2000);
		  act.doubleClick(Selenium);
		   //act.contextClick(Selenium); ---> Right click action perform 
		  
		  Thread.sleep(2000);
		  WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		   
		  Thread.sleep(2000);
		  WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		  
		  Thread.sleep(2000);
		  act.dragAndDrop(src, target).build().perform();
		   
		   
		   
		  }

}
