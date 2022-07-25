package Test_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {

		 // Step 1: open Browser --->
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		 // Step 2: enter the customerid 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234567");
		
		 // Step 3: click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// Step 4: verify text on alert
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());    // Do you really want to delete this Customer?    
		
		alt.accept(); 
		//alt.dismiss();
		
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();
		
		
	}

}
