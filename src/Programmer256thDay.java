import java.util.Scanner;

public class Programmer256thDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year == 1917)
			System.out.println("26.09."+year);
		else if (year <= 1917) {
		if(year % 4 == 0)
			System.out.println("13.09."+year);
		else 
			System.out.println("12.09."+year);
		}
		else {
		if((year%400==0) || (year%4==0 && year%100!=0))
			System.out.println("12.09.");
			 else System.out.println("13.09.");
		System.out.println(year);
		}
	

	}

}
