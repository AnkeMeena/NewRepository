package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
	@Test(retryAnalyzer=genericUtility.RetryAnalyzerImplimentation.class)
	//@Test(invocationCount =3)
	public void Sample()
	{
		Assert.fail();
		System.out.println("Hi");
	}

}
