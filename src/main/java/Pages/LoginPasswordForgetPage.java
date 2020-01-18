package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class LoginPasswordForgetPage extends loginPage{

	
	@FindBy(xpath="//div[@id='header_block']/span")
	private WebElement loginlableText;
	 
	
	public LoginPasswordForgetPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement loginlableText()
	{
		return loginlableText;
	}
	 
	
	
}
