package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewcontactsIcon;
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreateNewcontactsIcon() {
		return createNewcontactsIcon;
	}
	/**
	 * this is a business to click on create new contact icon
	 */
	public void clickOnCreateContactIcon()
	{
		getCreateNewcontactsIcon().click();
	}
}
