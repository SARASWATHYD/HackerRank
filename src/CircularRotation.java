import java.util.Scanner;

public class CircularRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rotationCount = sc.nextInt();
		int quriesCount = sc.nextInt();
		int quries[] = new int[quriesCount];
		int elem[] = new int[n];
		int result[] = new int[n];
 		for(int i = 0; i < n ; i ++) 
			 elem[i] = sc.nextInt();
		
 		for(int i = 0; i < quriesCount ; i ++) 
 			quries[i] = sc.nextInt();
		
 		 result = circularRotation(elem,rotationCount);
 		for(int i = 0; i < quriesCount ; i ++) 
 		 System.out.println(result[i]);
	}
	
	public static int[] circularRotation(int[] elements,int rotationCount) {
		
		for(int j = 0 ; j < rotationCount ; j++) {
			 int temp = elements[elements.length-1];
			 for (int i = elements.length - 1; i > 0; i--) 
				 elements[i] = elements[i-1];
			 	elements[0] = temp;
			 	
		}
		
		return elements;
	}

}
