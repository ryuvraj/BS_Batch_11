package Test_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {
	
	WebDriver driver;
	 
	 
	 @BeforeSuite
	 public void BS() {
	  System.out.println("BS");
	 }
	 @BeforeTest
	 public void BT() {
	  System.out.println("BT");
	 }
	 @BeforeClass
	 public void BC() {
	  System.out.println("BC");
	 }
	    @BeforeMethod
	    public void BM() {
	     System.out.println("BM");
	     
	     WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	    }
	    @Test
	    public void test_1() {
	     System.out.println("Test 1");
	    }
	    
	    @Test
	    public void test_2() {
	     System.out.println("Test 2");
	    }
	    
	    @Test
	    public void test_3() {
	     System.out.println("Test 3");
	    }
	    
	    
	    @AfterMethod
	    public void AM() {
	     System.out.println("AM");
	     
	     driver.close();
	     
	    }
	    @AfterClass
	    public void AC() {
	     System.out.println("AC");
	    }
	    @AfterTest
	    public void AT() {
	     System.out.println("AT");
	    }
	    @AfterSuite
	    public void AS() {
	     System.out.println("AS");
	    }
	    
	}
