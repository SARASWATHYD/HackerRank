import java.util.Scanner;

public class AppendAndDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String firstString = sc.next();
		String desiredString = sc.next();
		int numberOfOperation = sc.nextInt();
		System.out.println(solve(firstString.toCharArray(),desiredString.toCharArray(),numberOfOperation)
									? "YES" : "NO");
	}

	public static boolean solve(char[] s , char[] t, int n) {
		if(s.length + t.length < n )
			return true;
		int i = -1;
		while(i++ < Math.min(s.length, t.length)-1) {
			if(s[i]!=t[i])
				break;
		}
		if (i == s.length && s.length == t.length) {
            // if k is odd, there will always be 1 operation left over
            // else, you can delete and re-append last character to use up k operations
            return ((n & 1) == 1) ? false : true;
        }

        // Else
        // Reduce k by number of necessary deletions and insertions
        n = n - (s.length - i) - (t.length - i);

        // If k < 0 or there is an odd number of operations left over, false
        // else we need exactly k operations or the number of extra ops is even, true
        return (n < 0 || (n & 1) == 1) ? false : true;
        
    }
    
	}

