package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement creatNewOrganization;
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreatNewOrganization() {
		return creatNewOrganization;
	}
	/**
	 * this is business library to click on Create new Organization icon
	 */
	public void clickOnCreateNewOrganizationIcon()
	{
		 getCreatNewOrganization().click();
	}
	

}