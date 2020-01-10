import java.util.Scanner;

public class JumpingClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for(int i=0; i < n; i++)
			c[i] = in.nextInt();
		
		int i=0;
		int count =0;
		while(i<n)
		{
			if((i+1)==n-1)
			{
				i=i+1;count++;
				continue;
			}
			if((i+2)<n)
			{ 
				count++;
				if(c[i+2]!=1)
				i =i+2;
				else
				i =i+1;
			}
			else break;
		}
		System.out.println(count);
	}

}
