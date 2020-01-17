import java.util.Scanner;

public class HalloweenSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int p = sc.nextInt();
		int d = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		System.out.println(howManyGames(p,d,m,s));
	}
	
	static int howManyGames(int p, int d, int m, int s) {
	    int n=Math.abs( (p-m)/d +1);
	    if( (n*(2*p-(n-1)*d))/2 <= s)
	    {
	        return n + (s-(n*(2*p-(n-1)*d)/2))/m;
	    }
	    else
	    {
	        return Math.floorDiv((-d-2*p)+Math.sqrt((-2*p-d)*(-2*p-d)-(8*d*s)), ((-2*d)));
	    }
	}
}
