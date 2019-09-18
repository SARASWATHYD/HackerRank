import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cycles = sc.nextInt();
		int[] requested  = new int[cycles];
		for(int i = 0 ; i < cycles ; i ++)
		{
			requested[i] = sc.nextInt();
		
		System.out.println(utopian(requested[i]));
		}
	}
	static int utopian(int n ){
		
		       int h = 1;
		       for(int i = 1 ; i <= n ; i ++)
		       {
		            if(i %2 != 0 ) {
		             h = h *2; 
		             System.out.println( n+"odd :: "+h);
		            }
		            else {
		            h++;
		             System.out.println( n+"even :: "+h);
		            }
		       }
		       return h ;
		        
		    }
		
	}


