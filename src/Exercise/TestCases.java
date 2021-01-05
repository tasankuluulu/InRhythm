package Exercise;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCases {
	
	/**
	 * Test case to verify the Task method
	 * @param actualText
	 * @param expectedResult
	 */
	@Test(dataProvider = "getDataFromDataProvider")
	public void testMethod(String actualText, String expectedResult) {
		String actualResult = Task.toManipulateString(actualText);
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	/**
	 * The method to provide test data
	 * @return Object[][] where the first column contains actual text and the second column contains expected result
	 */
	@DataProvider
	public Object[][] getDataFromDataProvider() {
		return new Object[][] {
			{"Knowing the word count of a text can be important", "10 important"},
			{"Keep track of the number of words you write each day using the activity button", "15 activity"},
			{"To check word count, simply place your cursor into the text box above and start typing", "16 simply"}
		};
	}
	
}
