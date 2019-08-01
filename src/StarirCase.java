import java.util.Scanner;

public class StarirCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		staircase(n);
	}
	public  static void  staircase(int n) {
		String s = "";
		for(int i = n ; i < n ; i ++) {
             s = s +"#";
			System.out.println(s);
		
	}
	}
	
	    public static void stair(int n) {
//	        Scanner sc = new Scanner(System.in);
//	        int n = sc.nextInt();
	        for(int i = 1; i <= n; i++) {
	            for(int j = 1; j <= n; j++) {
	                if ((i + j) > n) {
	                    System.out.print("#");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	   

}
