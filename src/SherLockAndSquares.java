import java.util.Scanner;

public class SherLockAndSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		for(int i = 0 ; i < numberOfTestCases ; i ++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(findNumberOfSquareInbetweenStartAndEnd(start,end));
		}
	}
	public static int findNumberOfSquareInbetweenStartAndEnd(int start, int end) {
		//find how many squares.
		int count =0;
		for(int num=start ; num <=end ; num ++) {
			int d = num%10;
			System.out.println("last diguit :: "+d);
			 if(d==2 || d==7 || d==3 ||d==8 )
		           continue;
			for( int i = 1 ; i * i <=num ; i++) {
				if( num % i == 0 && num / i == i ) 
					count++;
				}
		}
		return count;
	}

}
