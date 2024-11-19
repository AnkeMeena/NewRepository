package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage {
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement Organizationname;
	@FindBy(xpath="//input[@name='website']")
	private WebElement Website;
	@FindBy(xpath="//input[@name='employees']")
	private WebElement Employees;
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phone;
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement Otherphone;
	@FindBy(xpath="//input[@name='email1']")
	private WebElement Email;
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAddress;
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement BillingCity;
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement BillingState;
	@FindBy(xpath="//input[@name='crmbutton small save']")
	private WebElement SaveButton;
	public CreatingNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getOrganizationname() {
		return Organizationname;
	}
	
	public WebElement getWebsite() {
		return Website;
	}
	
	public WebElement getEmployees() {
		return Employees;
	}
	
	public WebElement getPhone() {
		return Phone;
	}
	
	public WebElement getOtherphone() {
		return Otherphone;
	}
	
	public WebElement getEmail() {
		return Email;
	}
	
	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	
	public WebElement getBillingCity() {
		return BillingCity;
	}
	
	public WebElement getBillingState() {
		return BillingState;
	}
	
	public WebElement getSaveButton() {
		return SaveButton;
	}
	public void CreateNewOrganization(String Organizationname,String Website,String Employees)
    {
		getOrganizationname().sendKeys(Organizationname);
		getWebsite().sendKeys(Website);
		getEmployees().sendKeys(Employees);
		getSaveButton().click();
    }
	public void CreateNewOrganization(String Organizationname,String Website,String Employees,String Phone,String Otherphone,String Email)
    {
		getOrganizationname().sendKeys(Organizationname);
		getWebsite().sendKeys(Website);
		getEmployees().sendKeys(Employees);
		getPhone().sendKeys(Phone);
		getOtherphone().sendKeys(Otherphone);
		getEmail().sendKeys(Email);
		getSaveButton().click();
    }
	public void CreateNewOrganization(String Organizationname,String Website,String BillingAddress,String BillingCity,String BillingState )
    {
		getOrganizationname().sendKeys(Organizationname);
		getWebsite().sendKeys(Website);
		getBillingAddress().sendKeys(BillingAddress);
		getBillingCity().sendKeys(BillingCity);
		getBillingState().sendKeys(BillingState);
		getSaveButton().click();
    }
	public void CreateNewOrganization(String Organizationname,String Website,String Employees,String Phone,String Otherphone,String Email,String BillingAddress,String BillingCity,String BillingState)
    {
		getOrganizationname().sendKeys(Organizationname);
		getWebsite().sendKeys(Website);
		getEmployees().sendKeys(Employees);
		getPhone().sendKeys(Phone);
		getOtherphone().sendKeys(Otherphone);
		getEmail().sendKeys(Email);
		getBillingAddress().sendKeys(BillingAddress);
		getBillingCity().sendKeys(BillingCity);
		getBillingState().sendKeys(BillingState);
		getSaveButton().click();
    }
	
}
