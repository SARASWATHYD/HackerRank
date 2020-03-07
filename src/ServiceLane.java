import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int arInput[] = new int[input];
		int indexCheckSize = sc.nextInt();
		for(int i = 0; i < input ; i++) {
			arInput[i] = sc.nextInt();
		}
	

	    for(int i = 0; i < indexCheckSize; ++i) {
	        int l, r;
	         l = sc.nextInt();
	         r = sc.nextInt();
	    
	        int ans = arInput[l];
	        while(l <= r) {
	            ans = min(ans, arInput[l]);
	            l++;
	        }
			System.out.println(ans);
	    }
		

	}

	public static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

}
