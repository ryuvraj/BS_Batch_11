package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_Screenshot {

	public static void main(String[] args) throws Exception {

		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  driver.manage().window().maximize();
		  
		  Test_Screenshot.getCapture(driver);
		  

	}

	public static void getCapture(WebDriver driver) throws Exception {
		String rm=RandomString.make(5);
		  String path="C:\\Users\\Admin\\eclipse-workspace\\myproject\\Screenshot";
		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File destn =new File(path+"\\"+rm+".png");
		  
		  FileUtils.copyFile(src, destn);
		  
	}

}
