package TC_Repo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PomRepository.CreateNewLeadPage;
import PomRepository.HomePage;
import PomRepository.LeadsPage;
import genericUtility.BaseClass;

public class LE_002 extends BaseClass{
	@Test
	public void TestCase2()throws Exception
	{
		HomePage h= new HomePage(driver);
		h.clickonleedsmenu();
		LeadsPage led=new LeadsPage(driver);
		led.clickOnCreateNewLeadIcon();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		String fname=ex.getDataFromExcel("Leads", 4, 1);
		String lname=ex.getDataFromExcel("Leads", 4, 2);
		String company=ex.getDataFromExcel("Leads", 4, 3);
		String title=ex.getDataFromExcel("Leads", 4, 4);
		String phone=ex.getDataFromExcel("Leads", 4, 5);
		String mobile=ex.getDataFromExcel("Leads", 4, 7);
		String Noofemp=ex.getDataFromExcel("Leads", 4, 8);
		String street=ex.getDataFromExcel("Leads", 4, 9);
		String pobox=ex.getDataFromExcel("Leads", 4, 10);
		String postal=ex.getDataFromExcel("Leads", 4, 11);
		String city=ex.getDataFromExcel("Leads", 4, 12);
		String country=ex.getDataFromExcel("Leads", 4, 13);
		String state=ex.getDataFromExcel("Leads", 4, 14);
		String Email=ex.getDataFromExcel("Leads", 4, 6);
		cn.CreateNewLead11(fname, lname, company, title, mobile, Email, Noofemp, street, pobox, postal, city, country, state, phone);
	}

	
	
	

}
