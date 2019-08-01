import java.util.HashSet;
import java.util.Set;

public class TwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twoString("hello","world"));

	}
	static String twoString(String s1, String s2) {
		
		Set<Character> charset = new HashSet<>();
		char[] chararr = s1.toCharArray();
		for(char ar : chararr)
			charset.add(ar);
		Set<Character> charset2 = new HashSet<>();
		System.out.println(charset);
		char[] chararr2 = s2.toCharArray();
		for(char ar : s2.toCharArray()) {
			if(charset.contains(ar))
				return "YES";
		}
		
		
				return "NO";
		}
		
	
		
	}


