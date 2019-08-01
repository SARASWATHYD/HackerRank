import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinusProblem {

	/*
	 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

	Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

	For example, given the array  there are  elements, two positive, two negative and one zero. Their ratios would be ,  and . It should be printed as
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int ar[] = new int[n];
		for(int i =0 ; i < n ; i++) {
			ar[i] = sc.nextInt();
		}
		plusminus(ar);
	}
	
	public static void plusminus(int ar[]) {
		int posCounter = 0,negCounter = 0;
//		 final DecimalFormat df = new DecimalFormat("0.00000");

		for(int i = 0; i < ar.length ; i ++) {
			
		
			if(ar[i] > 0) 
				posCounter++;
			else if (ar[i] < 0)
				negCounter ++;
		}
		
		
		
		System.out.printf("%6f\n" ,posCounter/(float)ar.length);
		System.out.printf("%6f\n",negCounter/(float)ar.length);
		System.out.printf("%6f\n",( ar.length-(posCounter+negCounter))/(float)ar.length);
		
	}
			
	}


