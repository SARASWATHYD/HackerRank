import java.util.Scanner;

public class BeautifuldaysOnMovies {
/***
 * Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Print the number of beautiful days in the range.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int startdate = sc.nextInt();
		int endDate = sc.nextInt();
		int divisor = sc.nextInt();
		for(int i = startdate ; i <= endDate ; i ++  ) {
			if(Math.abs(i-reverse(i))%divisor==0)
				counter++;	
		}
		System.out.println(counter);
		
	}
	static int reverse(int  num ) {
		int  reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

		return reversed;
	}

}
