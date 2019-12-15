import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for(int i = 0 ; i < times ; i ++) {
			int number = sc.nextInt();
			int temp = number;
			int digit , count= 0;
			while(temp > 0)
			{
				digit=temp % 10;

				if(digit!=0 && number%digit==0)

					count++;

				temp=temp/10;

			}
			System.out.println(count);
		}
	}

}
