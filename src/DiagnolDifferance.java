import java.util.Scanner;

public class DiagnolDifferance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[][] = new int[n][n];
		for(int i = 0 ; i< n ; i++)
			for(int j = 0; j< n; j++)
			ar[i][j] = sc.nextInt();
		System.out.print(Math.abs(getEfficientsolDiadiff(ar)));
	}
	
	public static int getDiagnalDifference(int a[][]) {
		int diagnol1 = 0, diagnol2= 0;
		for(int i = 0;i < a.length ; i++) {
			for(int j = 0; j< a.length ; j++)
				if(i==j)
					diagnol1 = diagnol1 + a[i][j];
		}
		for(int i = 0;i < a.length ; i++) {
			for(int j = 0; j< a.length ; j++)
				if(i+j==a.length-1)
			diagnol2 = diagnol2 +a[i][j];
		}
		return diagnol2-diagnol1;
		
	}
	// efficient algorithm
	
	public static int getEfficientsolDiadiff( int ar[][]) {
		int result = 0, l =0, r = 0;
		for(int i = 0; i< ar.length;i++)
		{
			l = l+ar[i][i];
			r = r + ar[ar.length-1-i][i];
		}
		System.out.println("left ::"+l);
		System.out.println("Right ::"+r);
		result =Math.abs(l-r);
		
		return result;
	}
	
	

}
