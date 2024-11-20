package TC_Repo;

import org.testng.annotations.Test;

import PomRepository.CreateNewLeadPage;
import PomRepository.HomePage;
import PomRepository.LeadsPage;
import genericUtility.BaseClass;

public class LE_004 extends BaseClass{
	@Test(groups="Regression")
	public void TestCase4 ()throws Exception
	{
		HomePage h=new HomePage(driver);
		h.clickonleedsmenu();
		LeadsPage led=new LeadsPage(driver);
		led.clickOnCreateNewLeadIcon();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		 String fname=ex.getDataFromExcel("Leads", 10, 1);
		 String lastName=ex.getDataFromExcel("Leads", 10, 2);
		 String Company=ex.getDataFromExcel("Leads", 10, 3);
		 String street=ex.getDataFromExcel("Leads", 10, 4);
		 String pobox=ex.getDataFromExcel("Leads", 10, 5);
		 String postal=ex.getDataFromExcel("Leads", 10, 6);
		 String city=ex.getDataFromExcel("Leads", 10, 7);
		 String country=ex.getDataFromExcel("Leads", 10, 8);
		 String state=ex.getDataFromExcel("Leads", 10, 9);
		 cn.CreateNewLead(lastName, lastName, Company, street, pobox, postal, city, country, state);
		 System.out.println("testecase le004 is executed");
		 System.out.println("Hello");
	}
}
