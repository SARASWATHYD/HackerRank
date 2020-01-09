import java.util.Scanner;

public class RepeatedString {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        long n = in.nextLong();
	        System.out.println( getRepeatedCount(n,s));
	    }
	 public static long getRepeatedCount(long n, String s ) {
		 long num = n/s.length();
	        long rem = n%s.length();
	        long count = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i)=='a') {
	            	count += num;
	                if (i < rem)
	                	count++;
	            }
	        }
	        return count;
	 }
}
