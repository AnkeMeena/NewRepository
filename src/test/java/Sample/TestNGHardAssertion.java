package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGHardAssertion {
	@Test
	public void strictComparisonHardAssert()
	{
		String expectedValue="raja";
		String actualValue="raja";
		Assert.assertEquals(actualValue,expectedValue);
		System.out.println(" assertion completed");
		
	}
	@Test
	public void containsComparisonHardassert()
	{
		String expectedValue="corn";
		String actualValue="babycorn";
	    Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains comparison completed");
		
	}


}
