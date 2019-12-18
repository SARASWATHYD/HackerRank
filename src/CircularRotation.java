import java.util.Scanner;

public class CircularRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int elem[] = new int[n];
 		for(int i = 0; i < n ; i ++) {
			 elem[i] = sc.nextInt();
		}
 		circularRotation(elem);
	}
	
	public static void circularRotation(int[] elements) {
		
		for(int i = 0 ; i < elements.length ; i ++) {
			elements[0] = elements[elements.length-1];
			elements[i] = elements[i+1];
			
		}
	}

}
