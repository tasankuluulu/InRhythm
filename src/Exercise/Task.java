package Exercise;

public class Task {

	/**
	 * The method to find the length of the sentence and the longest String in it
	 * @param actualText, we expect only String as a input, because we are not handling any exception
	 * @return the sentence length and the longest String
	 */
	public static String toManipulateString(String actualText) {

		/** Replacing all characters inside the String */
		actualText = actualText.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
		
		if(actualText.isEmpty()) {
			return "0";
		}

		/** Splitting the String by spaces and saving into the array of String */
		String[] array = actualText.split(" ");

		/** Finding the length of the sentence */
		int sentenceLength = array.length;

		/** Assuming that the first String in the sentence is the longest */
		String longestString = array[0];

		/** Looping through the array to find the longest String */
		for (int i = 1; i < sentenceLength; i++) {
			if (array[i].length() > longestString.length()) {
				longestString = array[i];
			}
		}
		
		/** Returning the sentence length and the longest String */
		return sentenceLength + " " + longestString;
	}
}
