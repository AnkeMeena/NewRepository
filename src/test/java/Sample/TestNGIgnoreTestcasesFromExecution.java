package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreTestcasesFromExecution {
		@Test(priority=1)
		public void createUser()
		{
			System.out.println("created user");
		}
		@Test(priority=2)
		public void modifyUser()
		{
			System.out.println("modify created");
		}
		@Ignore
		@Test(priority=3)
		public void deleteUser()
		{
			System.out.println("delite created");
		}

}
