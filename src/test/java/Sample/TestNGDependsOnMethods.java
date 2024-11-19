package Sample;

import org.testng.annotations.Test;

public class TestNGDependsOnMethods {

		@Test(priority=3)
		public void createUser()
		{
			System.out.println("created user");
		}
		@Test(priority=2,dependsOnMethods= {"createUser","deleteUser"})
		public void modifyUser()
		{
			System.out.println("modify created");
		}
		@Test(priority=1)
		public void deleteUser()
		{
			System.out.println("delite created");
		}

}
