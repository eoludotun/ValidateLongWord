package LongestWord;

import test.java.LongestWord.UnitTest;

public class WordLongest {
	/**
	 * main for  LongestWordFinder.
	 *  @author Ebenezer Oludotun
	 */
	
	public static void main(String[] args) {
		String countWords = "the cow jumped over the moon.";
		UnitTest countWordObj = new UnitTest();
		countWordObj.testWordCount(countWords);
		countWordObj.testlengthOfCharacter(countWords);
	}
}

