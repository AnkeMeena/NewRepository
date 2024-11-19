package TC_Repo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomRepository.CreateNewLeadPage;
import PomRepository.HomePage;
import PomRepository.LeadsPage;
import genericUtility.BaseClass;
@Listeners(genericUtility.ListenersEmplimentation.class)
public class LE_001Test extends BaseClass {
	@Test
	public void le_001() throws Exception
	{
		System.out.println("Test method started");
		HomePage h=new HomePage(driver);
		h.clickonleedsmenu();
		LeadsPage l= new LeadsPage(driver);
		l.clickOnCreateNewLeadIcon();
		//Assert.fail();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		String fname=ex.getDataFromExcel("Leads", 1, 1);
		String lname=ex.getDataFromExcel("Leads", 1, 2);
		String company=ex.getDataFromExcel("Leads", 1, 3);
		cn.CreateNewLead(fname, lname, company);

	}
}
