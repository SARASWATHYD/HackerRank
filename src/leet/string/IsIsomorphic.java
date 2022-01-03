package leet.string;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
//	Given two strings s and t, determine if they are isomorphic.
//
//	Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//	All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//	 
//
//	Example 1:
//
//	Input: s = "egg", t = "add"
//	Output: true
//	Example 2:
//
//	Input: s = "foo", t = "bar"
//	Output: false
//	Example 3:
//
//	Input: s = "paper", t = "title"
//	Output: true
//	 
//
//	Constraints:
//
//	1 <= s.length <= 5 * 104
//	t.length == s.length
//	s and t consist of any valid ascii character.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean isIsomorphic(String s, String t) {
	        Map<Character,Character> map = new HashMap<>();
	        for(int i =0; i< s.length();i++){
	            char x = s.charAt(i);
	            char y = t.charAt(i);
	      
	        if(map.containsKey(x)){
	            if( y!=map.get(x))
	                return false;
	        } else if(map.containsValue(y)){
	                return false;
	        }
	        else  map.put(x,y);      
	        }
	    return true; 
	    }

}
