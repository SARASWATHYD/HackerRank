package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * A string is said to be a child of a another string if it can be formed by
 * deleting 0 or more characters from the other string. Given two strings of
 * equal length, what's the longest string that can be constructed such that it
 * is a child of both?
 * 
 * For example, ABCD and ABDC have two children with maximum length 3, ABC and
 * ABD. They can be formed by eliminating either the D or C from both strings.
 * Note that we will not consider ABCD as a common child because we can't
 * rearrange characters and ABCD ABDC.
 * 
 * Function Description
 * 
 * Complete the commonChild function in the editor below. It should return the
 * longest string which is a common child of the input strings.
 * 
 * commonChild has the following parameter(s):
 * 
 * s1, s2: two equal length strings Input Format
 * 
 * There is one line with two space-separated strings, and .
 * 
 * Constraints
 * 
 * All characters are upper case in the range ascii[A-Z].
 * 
 * @author saraswathy
 *
 */

public class CommonChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();

		System.out.println(new CommonChild().getCommon(s1, s2));
	}

	private int getCommon(String s1, String s2) {
		int i = 0;
		Set<Character> hashset = new HashSet();
		while(s2.length() > i) {
			if(s1.contains(String.valueOf(s2.charAt(i)))){
				hashset.add(s2.charAt(i));
			}
			i++;
		}
		return hashset.size();
	}

}
