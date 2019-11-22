import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigNumber {
	
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(extraLongFactorials(n));
		

	}
	
	public static BigInteger  extraLongFactorials(int n) {
		BigInteger fact = new BigInteger(""+1);
		if(n ==1 || n==0)
            return fact;
		else {
			for(int i = 1 ; i <= n ; i ++) 
			fact = fact.multiply( new BigInteger(""+i));
		}
		return fact;
		
	}

}
