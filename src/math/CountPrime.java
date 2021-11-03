package math;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class CountPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int num  = sc.nextInt();
		for(int i =1 ; i <=num; i++) {
			if(new CountPrime().isPrime(i)) {
				list.add(i);
			}
		}
		System.out.println(list.size());
	}
	private boolean isPrime(int n) {
		 if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

}
