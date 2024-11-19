package TC_Repo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomRepository.CreateNewLeadPage;
import PomRepository.HomePage;
import PomRepository.LeadsPage;
import genericUtility.BaseClass;
@Listeners(genericUtility.ListenersEmplimentation.class)

public class LE_003 extends BaseClass {
	@Test
	public void TestCase3 ()throws Exception
	{
			HomePage h=new HomePage(driver);
			h.clickonleedsmenu();
			LeadsPage led=new LeadsPage(driver);
			led.getCreateNewLeadIcon();
			//Assert.fail();
			CreateNewLeadPage cn=new CreateNewLeadPage(driver);
			 String fname=ex.getDataFromExcel("Leads", 7, 1);
			 String lastName=ex.getDataFromExcel("Leads", 7, 2);
			 String Company=ex.getDataFromExcel("Leads", 7, 3);
			 String Title=ex.getDataFromExcel("Leads", 7, 4);
			 String phone=ex.getDataFromExcel("Leads", 7, 5);
			 String mobile=ex.getDataFromExcel("Leads", 7, 6);
			 String email=ex.getDataFromExcel("Leads", 7, 7);
			 String noofemployees=ex.getDataFromExcel("Leads", 7, 8);
			 cn.CreateNewLead(lastName, lastName, Company, Company, Title, phone, mobile, email, noofemployees);
	}
	}

