package test.java.LongestWord;

import org.junit.Assert;
import org.junit.Test;

import LongestWord.LongestWord;


public class UnitTest {
	
	/**
	 * UnitTest for LongestWordFinder.
	 *  @author Ebenezer Oludotun
	 */
 private LongestWord longestWordFinder = new LongestWord();

	@Test
	public void testWordCount(String countWords) {
        longestWordFinder.validateMaxWord(countWords);
		System.out.println("Expected long word is : jumped " + " Actual: " + longestWordFinder.getmaxWord());
		Assert.assertEquals(longestWordFinder.getmaxWord(), "jumped");
	}
			
	@Test
	public void testlengthOfCharacter(String wordlength) {
		longestWordFinder.validateMaxWord(wordlength);
		System.out.println("Expected word length is : 6 " + " Actual: " + longestWordFinder.getmaxlength());
		Assert.assertEquals(longestWordFinder.getmaxlength(), 6);
		}
}
