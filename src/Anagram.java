
	import java.util.Scanner;

	public class Anagram {

	    static boolean isAnagram(String a, String b) {
	     
	        if (sort(a).equalsIgnoreCase(sort(b)))
	            return true; 
	      else
	           return false;

	    }

	    static String sort(String str) {
	        char[] chars = str.toCharArray();
	        int j = 0;
	        char temp = 0;
	        for (int i = 0; i < chars.length; i++) {
	            for (j = 0; j < chars.length; j++) {
	                if (chars[j] > chars[i]) {
	                    temp = chars[i];
	                    chars[i] = chars[j];
	                    chars[j] = temp;
	                }

	            }

	        }
	        for(int k=0;k<chars.length;k++)
	           chars[k] = chars[k];
	        
	        return new String(chars);
	    }
		static String sort(String str) {
		char[] temparray = str.toCharArray();
		Arrays.sort(temparray);
		return new String(temparray);
	}

	    public static void main(String ar[]) {
	    	    
	            Scanner scan = new Scanner(System.in);
	            String a = scan.next();
	            String b = scan.next();
	            scan.close();
	            boolean ret = isAnagram(a, b);
	            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	        }
	    }
	
	   

