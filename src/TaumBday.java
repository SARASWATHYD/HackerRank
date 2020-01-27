import java.math.BigInteger;
import java.util.Scanner;

public class TaumBday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
		BigInteger b=new BigInteger(sc.next());
		BigInteger w=new BigInteger(sc.next());
		BigInteger x=new BigInteger(sc.next());
		BigInteger y=new BigInteger(sc.next());
		BigInteger z=new BigInteger(sc.next());
		if(x.compareTo(y.add(z))==1)
			System.out.println((b.multiply(y.add(z))).add(w.multiply(y)));
		else if(y.compareTo(x.add(z))==1)
			System.out.println(b.multiply(x).add(w.multiply(x.add(z))));
		else System.out.println(b.multiply(x).add(w.multiply(y)));
			}
		}
}


	


