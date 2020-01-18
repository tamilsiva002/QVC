package Test;

import java.awt.Desktop.Action;
import java.awt.SecondaryLoop;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.loginPage;

public class excersice {
	WebDriver driver;
	
	
	
	@BeforeSuite
	public void openbrowser() {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakthi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Browser open");
	}
	
	
	

	
	
	@Test (groups = {"Smoke"}, enabled = false)
	public void fetchurl() {
		  
		driver.get("https://www.facebook.com/");
	}
	
	@Test (enabled = false) 
	public void loginclick() {
		
		// driver - chromeBrowser 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Login Page
		
		//loginPage LP=new loginPage(driver);
		//LP.username.sendKeys("tamilsiva002@gmail");
		/*
		 * WebElement username=driver.findElement(By.id("email"));
		 * username.sendKeys("tamilsiva002@gmail.com");
		 */
		//WebElement loginsign=driver.findElement(By.id("loginbutton"));
		Actions ac=new Actions(driver);
		//ac.moveToElement(LP.loginsign).build().perform();
		ac.click().build().perform();
		
		// Login Page - Password Wrong.
		
		//WebElement target=driver.findElement(By.id("loginbutton"));
		//WebElement source=driver.findElement(By.id("loginbutton"));
		//ac.dragAndDrop(source, target);
		//loginsign.click();
		WebElement loginlable=driver.findElement(By.xpath("//div[@id='header_block']/span"));
		String name=loginlable.getText();
		System.out.println(name);
		driver.navigate().refresh();
		System.out.println("login button click");
	}
	
	@Test (enabled = false)
	public void prac() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.navigate().back();
		driver.navigate().forward();
		WebElement dropdowncontry=driver.findElement(By.xpath("//div[@id='header_block']/span"));
		
		Select s1=new Select(dropdowncontry);
		s1.selectByIndex(0);
		s1.selectByValue("534");
		s1.selectByVisibleText("china");
		s1.deselectAll();
		
		
		
	}
	@AfterClass
	public void close() {
		driver.close();
		System.out.println("close browser");
	}
	
	
	

}
