package LongestWord;
/**
 * Constructor for LongestWord.
 *  @author Ebenezer Oludotun
 *  
 */	

public class LongestWord {

	public LongestWord() {}
	
	private String holdCharacters="",maxWord="";
	private int checkingMax,maxlength=0;

	public String validateMaxWord(String countWord) {
			
	 if (countWord == null || countWord.isEmpty()) 
	 {
	    throw new IllegalArgumentException("Sentence can not be null or empty, please try again");
	 }
         counWordValid(countWord);  //pattern validation	
		
	 countWord = countWord+" "; //adding a space at the end, to extract the last word also
	 int len=countWord.length(); //finding the length of the sentence
	 char ch;
         for(int i=0;i<len;i++)
                {
                 ch=countWord.charAt(i); //extracting characters of the string one at a time
                 if(ch!=' ')
                 {
                    holdCharacters=holdCharacters+ch; //adding characters to form word if character is not space
                  }
                 else
                 {
                    checkingMax=holdCharacters.length();
 
                    if(checkingMax>maxlength) //checking for maximum length
                    {
                       maxlength=checkingMax;
                       maxWord=holdCharacters;
                     }  
                      holdCharacters=""; //emptying the temporary variable to store next word
                   }                
                }
                return maxWord + maxlength;
	}
       
	public int getmaxlength() {
		return maxlength;
	}
	
	public String getmaxWord() {
		return maxWord;
	}
	
        private boolean counWordValid(String sentence) {
        return sentence.matches("^[a-zA-Z].*[a-zA-Z][.!?]$");  
	}
}

