package leet.interview;
/*
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

 
 */
public class ReversePrefix {

	//Input: word = "abcdefd", ch = "d"
//	Output: "dcbaefd"
//		Explanation: The first occurrence of "d" is at index 3. 
//		Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
		String reveresed = new String(reverse(word.toCharArray(),0,index));
        return reveresed;
    }
	
	 private char[] reverse(char[] arr, int i, int j){
	        while(i<j){
	            char temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	        return arr;
	    }

}
