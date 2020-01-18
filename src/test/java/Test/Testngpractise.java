package Test;

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

public class Testngpractise {
	WebDriver driver;
	@BeforeSuite
	public void need() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakthi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();  


	}
	@BeforeTest
	public void no() {
		driver.get("https://www.google.com/");
	}
	@BeforeClass
	public void normal() {
		System.out.println("testcase+ beforeclass");

	}
	@BeforeMethod
	public void mtd() {
		System.out.println("tested+ before mtd");
		
		
	}
	@AfterMethod
	public void normal1() {
		System.out.println("testcase normal after method");
		
	}
	
	@AfterClass
	public void name () {
		System.out.println("after calss ");
	}
	@AfterTest
	public void name1 () {
		System.out.println("after test ");
	}
	@AfterSuite
	public void send1() {
		driver.close();
		
	}
	

@Test 
public void page () {
	System.out.println("tesescript pass");
}
@Test 
public void click() {
	System.out.println("tesescript fail");
}
@Test
public void send() {
	System.out.println("tesescript inter");
}



}
