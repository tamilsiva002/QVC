

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class loginPage extends BasePage{

	 
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="loginbutton")
	private WebElement signButton;
	
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement username()
	{
		return username;
	}
	public WebElement signButton()
	{
		return signButton;
	}
	
	
	
	
	
	

}
