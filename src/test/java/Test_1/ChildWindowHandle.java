package Test_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentwindAdd=driver.getWindowHandle();
		System.out.println(parentwindAdd);
		
		 driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		  
		  Set<String> allAddress=driver.getWindowHandles();
		  System.out.println(allAddress);
		  
		  Iterator<String> it=allAddress.iterator();
		  while(it.hasNext()) {
		   
		   String childwindowAddress=it.next();
		   
		   if(!parentwindAdd.equals(childwindowAddress)) {
		    
		    driver.switchTo().window(childwindowAddress);
		    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("12345");
		    Thread.sleep(2000);
		    driver.close();
		   }
		    
		  }
		  driver.switchTo().window(parentwindAdd);
		  driver.quit();
		  
		 
		
	}

}
