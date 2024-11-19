package Sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertion {
	@Test
	public void strictComparisonSoftAssert()
	{
		String expectedValue="raja";
		String actualValue="raja";
		SoftAssert s =new SoftAssert();
		System.out.println("Strict comparison soft assertion completed");
		s.assertAll();
	}
	@Test
	public void containsComparisonsoftassert()
	{
		String expectedValue="corn";
		String actualValue="babycorn";
		SoftAssert s =new SoftAssert();
		s.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains comparison soft assert completed");
		s.assertAll();
	}

}
