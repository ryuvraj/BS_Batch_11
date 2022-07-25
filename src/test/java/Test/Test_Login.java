package Test;

import java.io.File;
import java.io.IOException;

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

public class Test_Login {

 public static void main(String[] args) throws Exception {

  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.get("https://demo.guru99.com/test/newtours/register.php");
  driver.manage().window().maximize();

  driver.findElement(By.name("firstName")).sendKeys("Test");
  Thread.sleep(2000);
  driver.findElement(By.name("lastName")).sendKeys("Bug");
  Thread.sleep(2000);
  driver.findElement(By.name("phone")).sendKeys("123456789");
  Thread.sleep(2000);
  driver.findElement(By.name("userName")).sendKeys("Test_001@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.name("address1")).sendKeys("Test_Bug Colony");
  Thread.sleep(2000);
  driver.findElement(By.name("city")).sendKeys("Code");
  Thread.sleep(2000);
  driver.findElement(By.name("state")).sendKeys("Test_Script");
  Thread.sleep(2000);
  driver.findElement(By.name("postalCode")).sendKeys("1234");
  Thread.sleep(2000);
  WebElement drp_country=driver.findElement(By.name("country"));
  Thread.sleep(2000);
  Select select=new Select(drp_country);
  select.selectByVisibleText("ANTIGUA AND BARBUDA");
  Thread.sleep(2000);
  
  
  driver.findElement(By.name("email")).sendKeys("Test_1");
  Thread.sleep(2000);
  driver.findElement(By.name("password")).sendKeys("12345678");
  Thread.sleep(2000);
  driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
  Thread.sleep(2000);
  
  driver.findElement(By.name("submit")).click();
  Thread.sleep(4000);
      
  String rm=RandomString.make(5);
  String path="C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\myproject\\\\Screenshot";
  TakesScreenshot ts=(TakesScreenshot)driver;
  File src=ts.getScreenshotAs(OutputType.FILE);
  File destn =new File(path+"\\"+rm+".png");
  FileUtils.copyFile(src, destn);
  

  driver.close();
 }
 
}


