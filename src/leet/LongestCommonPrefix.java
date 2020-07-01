package leet;

import java.util.Scanner;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * Input: ["flower","flow","flight"] Output: "fl"
 * 
 * @author saraswathy
 *
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] strings = new String[sc.nextInt()];
		for (int i = 0; i < strings.length; i++)
			strings[i] = sc.next();

		System.out.println(longestCommonPrefix(strings));
		}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		int i = 0;
		char ch = '0';
		while (true) {
			for (String str : strs) {
				if (i >= str.length())
					return str;
				if (ch == '0') {
					ch = str.charAt(i);
				}
				if (str.charAt(i) != ch)
					return str.substring(0, i);
			}
			i++;
			ch = '0';
		}
	}

}
