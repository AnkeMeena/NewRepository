package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	private WebElement LeadsButton;
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement Organization;
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement Contacts;
	@FindBy(xpath="(//img[@src='themes/softed/images/user.PNG']")
	private WebElement icon;
	@FindBy(xpath="//a[text()='Sign Out']") 
	private WebElement signOut;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getLeadsButton()
	{
		return LeadsButton;
	}
	public WebElement getOrganization()
	{
		return Organization;
	}
	public WebElement getContacts()
	{
		return Contacts;
	}
	public WebElement geticon()
	{
		return icon;
	}
	public  WebElement getsignOut()
	{
		return signOut;
	}
	public void getsignOut (WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(icon).perform();
		getsignOut().click();
	}
	
	public void clickonleedsmenu()
	{
		getLeadsButton().click();
	}
	public void clickonorganizationmenu()
	{
		getOrganization().click();
	}
	public void clickoncontactsmenu()
	{
		getContacts().click();
	}

}
