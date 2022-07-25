package Test;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class DropDownHandle {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		  
		  Select sel=new Select(drp_country);
		  System.out.println(sel.getFirstSelectedOption().getText());
		  
		  sel.selectByIndex(10);
		  
		  Thread.sleep(2000);
		  sel.selectByValue("ANDORRA");
		  Thread.sleep(2000);

		  sel.selectByVisibleText("ANTIGUA AND BARBUDA"); 
		  
		   System.out.println(sel.getFirstSelectedOption().getText());
		  
		  List<WebElement> list=sel.getOptions();
		  
		  for(int i=0;i<list.size();i++) {
		   Thread.sleep(3000);
		   String value=list.get(i).getText();
		   System.out.println(value);
		   
		   if(value.equals("ANTIGUA AND BARBUDA")) {
		    
		    sel.selectByVisibleText("ANTIGUA AND BARBUDA");
		    break;
		   }
		  }
		  
		  custom_handleDropDown(drp_country,"ANDORRA");
		  
		 }
		 
		 public static void custom_handleDropDown(WebElement element,String text) {
		  
		  Select sel1=new Select(element);
		  sel1.selectByVisibleText(text);
		  
		 
		 }
		

}
