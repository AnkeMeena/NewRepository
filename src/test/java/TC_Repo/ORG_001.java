package TC_Repo;

import org.testng.Assert;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import PomRepository.CreatingNewOrganizationPage;
import PomRepository.HomePage;
import PomRepository.OrganizationsPage;
import genericUtility.BaseClass;
@Listeners(genericUtility.ListenersEmplimentation.class)

public class ORG_001 extends BaseClass{
	@Test(groups="smoke")
	public void org_001() throws Exception
	{
       
		HomePage h=new HomePage(driver);
		h.clickonorganizationmenu();
		OrganizationsPage og=new OrganizationsPage(driver);
		og.clickOnCreateNewOrganizationIcon();
		Assert.fail();
		CreatingNewOrganizationPage co=new CreatingNewOrganizationPage(driver);
		String orgname=ex.getDataFromExcel("Organizations", 1,1);
		String website=ex.getDataFromExcel("Organizations", 1,2);
		String empname=ex.getDataFromExcel("Organizations", 1,3);
		co.CreateNewOrganization(orgname, website, empname);
		System.out.println("testcase org1 is executed");
	}

}
