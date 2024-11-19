package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernameTextField;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement PasswordTextField;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement LoginbuttonTextField;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getUserNameTextField()
	{
		return usernameTextField;
	}
	public WebElement getPasswordTextField()
	{
		return PasswordTextField;
	}
	public WebElement getLoginButtonTestField()
	{
		return LoginbuttonTextField;
	}
	public void loginToApp(String Username,String Password)
	{
		getUserNameTextField().sendKeys(Username);
		getPasswordTextField().sendKeys(Password);
		getLoginButtonTestField().click();
	}

}
