import java.util.Arrays;
import java.util.Scanner;

public class HurdleRace {
/**
 * Dan is playing a video game in which his character competes in a hurdle race. Hurdles are of varying heights, and Dan has a maximum height he can jump. There is a magic potion he can take that will increase his maximum height by  unit for each dose. How many doses of the potion must he take to be able to jump all of the hurdles.

Given an array of hurdle heights , and an initial maximum height Dan can jump, , determine the minimum number of doses Dan must take to be able to clear all the hurdles in the race.

For example, if  and Dan can jump  unit high naturally, he must take  doses of potion to be able to jump all of the hurdles.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arraysize = sc.nextInt();
		int ablityHght = sc.nextInt();
		int ar[] = new int[arraysize];
		for(int i = 0 ;  i < arraysize ; i ++) {
			 ar[i] = sc.nextInt();
		}
		
		System.out.println(hurdlerace(ar,ablityHght));
	}

	static int hurdlerace(int[] ar, int hght){
		Arrays.sort(ar);
		if(ar[ar.length-1] < hght)
			return 0 ;
		else
		return ar[ar.length-1] - hght;
		
		
	}
}
