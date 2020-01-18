package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="loginbutton")
	private WebElement signButton;
	
	public HomePage() {
		// TODO Auto-generated constructor stub
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
