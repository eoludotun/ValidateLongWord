# ValidateLongWord
In the LongestWord class, I declared two String variables, for storing each word of a sentence temporarily, for storing the longest word.

Similarly, I defined integer variables, storing the length of the temporary word, and initialized with the length of the original string with 0. Because whatever there word in the sentence, its length will always be greater than 0. However, I've word pattern validation and also null is not allowed too.

The technique used for taking out words from the sentence one at a time is that we extract all characters one by one and add them to a temporary String variable until I get a space. I we get a space, we know that a word has ended.

Note: Since I know that when I encounter a space, a word has ended, so to implement this concept I added a space at the end of the original string, otherwise the last word will not be extracted.

In the for loop, I are extracting one characetr at a time and storing it in a character variable ‘ch’.

As soon as I get a space, we have got a word, and hence the control goes to the else block, where we find the length of that word
In the end, I emptying the temporary String variable in order to make it ready to accept the next word.

Finally I've two Unit test in the Unit Test Class, one unit is test (testWordCount) is to validate the longest word. 
The second Unit test (testlengthOfCharacter) is basically to validate the longest word count.
