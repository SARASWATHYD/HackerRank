import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BirthdayChoclates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int ar[] = new int[n];
      for(int i =0 ; i < n ; i++)
    	  ar[i] = sc.nextInt();
      int day = sc.nextInt();
      int month = sc.nextInt();
      System.out.println(solve(n,ar,day,month));
	}
	
	public static int birthday(int ar[], int day, int month) {
		int c = 0,count =0 , j = month;
		for(int  i = 0 ; i < ar.length - month ; i ++) {
			 j = month -1;
			while(j >= 0) {
			 c = ar[i + j] + c;
			 j--;
			}
			if(c==day)
			{
			count++;
			}
			c=0;
			}
			return c;
		}
	
	
		static int solve(int n, int[] s, int d, int m){
			int i=0,j=m;
			int c=0;
			int count=0;
			for(;i<=n-m;i++)
			{
			j=m-1;
			while(j>=0)
			{
			c=s[i+j]+c;
			j-- ;
			}
			if(c==d)
			{
			count++;
			}
			c = 0;
			}
			return count;
			}
	
		
	}


