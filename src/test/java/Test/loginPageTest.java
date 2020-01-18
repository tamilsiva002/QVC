package Test;

import org.testng.annotations.Test;

import Base.BasePage;
import Pages.LoginPasswordForgetPage;
import Pages.loginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class loginPageTest {
	
	loginPage LP=new loginPage();
	LoginPasswordForgetPage LPF=new LoginPasswordForgetPage();
	@Test
  public void OpenBrowserandLogin() throws Exception {
	  try {
		  LP.username().sendKeys("tamilsiva");
	//	  LP.takeSnapShot(BasePage.driver, "E:\\Deva Workspace\\application\\ScreenShot\\loginPag.png");
		  LP.signButton().click();
	
		  String name= LPF.loginlableText().getText();
		 System.out.println(name);
	//	 LP.takeSnapShot(BasePage.driver, "E:\\Deva Workspace\\application\\ScreenShot\\PassowordRestPage.png");
		 
	} catch (NoSuchElementException e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}catch (NoClassDefFoundError e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}finally {
		
		System.out.println("The methode OpenBrowser Executed");
	}

  }
  

}
