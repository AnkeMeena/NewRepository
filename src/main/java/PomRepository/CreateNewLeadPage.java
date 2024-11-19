package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is a Creating New Lead POM Class
 */
public class CreateNewLeadPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lastname;
	@FindBy(xpath="//input[@name='company']")
	private WebElement Company;
	@FindBy(xpath="//input[@name='designation']")
	private WebElement Title;
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phone;
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement Mobile;
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement Noofemployees;
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement Street;
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement Pobox;
	@FindBy(xpath="//input[@name='code']")
	private WebElement Postalcod;
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	@FindBy(xpath="//input[@name='country']")
	private WebElement Country;
	@FindBy(xpath="//input[@name='state']")
	private WebElement State;
	@FindBy(xpath="//input[@accesskey='S']")
	private WebElement SaveButon;
	
	public CreateNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    public WebElement getFirstname() {
		return Firstname;
	}
	public WebElement getLastname() {
		return Lastname;
	}
	public WebElement getCompany() {
		return Company;
	}
	public WebElement getTitle() {
		return Title;
	}
	public WebElement getPhone() {
		return Phone;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getNoofemployees() {
		return Noofemployees;
	}
	public WebElement getStreet() {
		return Street;
	}
	public WebElement getPobox() {
		return Pobox;
	}
	public WebElement getPostalcod() {
		return Postalcod;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getCountry() {
		return Country;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getSaveButon() {
		return SaveButon;
	}
	public void CreateNewLead(String Firstname,String Lastname,String Company)
    {
		getFirstname().sendKeys(Firstname);
		getLastname().sendKeys(Lastname);
		getCompany().sendKeys(Company);
		getSaveButon().click();
    }
	 /**
	  * this is a business library to create new lead
	  * @param Firstname
	  * @param Lastname
	  * @param Company
	  * @param title
	  * @param mobile
	  * @param email
	  * @param noOfEmployees
	  * @param street
	  * @param poBox
	  * @param postalcode
	  * @param city
	  * @param country
	  * @param state
	  */
	public void CreateNewLead11(String Firstname,String Lastname,String Company,String title,String mobile,String Email,String noOfEmployees,String street,String poBox,String postalcode,String city,String country,String state ,String phone)
	    {
			getFirstname().sendKeys(Firstname);
			getLastname().sendKeys(Lastname);
			getCompany().sendKeys(Company);
			getTitle().sendKeys(title);
			getMobile().sendKeys(mobile);
			getEmail().sendKeys(Email);
			getNoofemployees().sendKeys(noOfEmployees);
			getPhone().sendKeys(phone);
			getStreet().sendKeys(street); 
			getPobox().sendKeys(poBox);
			getPostalcod().sendKeys(postalcode);
			getCity().sendKeys(city);
			getCountry().sendKeys(country);
			getState().sendKeys(state);
			getSaveButon().click();
	    }
	/**
	 * this is a business library to create new lead
	 * @param Firstname
	 * @param Lastname
	 * @param Company
	 * @param title
	 * @param mobile
	 * @param email
	 * @param noOfEmployees
	 * @param state2 
	 * @param country
	 */
	public void CreateNewLead(String Firstname,String Lastname,String Company,String phone,String title,String mobile,String email,String noOfEmployees)
    {
		getFirstname().sendKeys(Firstname);
		getLastname().sendKeys(Lastname);
		getCompany().sendKeys(Company);
		getPhone().sendKeys(phone);
		getMobile().sendKeys(mobile);
		getEmail().sendKeys(email);
		getNoofemployees().sendKeys(noOfEmployees);
		getSaveButon().click();
    }
	public void CreateNewLead(String Firstname,String Lastname,String Company,String street,String poBox,String postalcode,String city,String country,String state )
    {
		getFirstname().sendKeys(Firstname);
		getLastname().sendKeys(Lastname);
		getCompany().sendKeys(Company);
		getStreet().sendKeys(street);
		getPobox().sendKeys(poBox);
		getPostalcod().sendKeys(postalcode);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSaveButon().click();
    }
	

	 
}
