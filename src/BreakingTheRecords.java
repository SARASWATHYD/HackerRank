import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] a= new int[count];
		for(int i = 0 ; i < count ; i++)
			a[i] = sc.nextInt();
			
		System.out.println(new BreakingTheRecords().breakTheRecord(a));
		
				
	}
	public String  breakTheRecord(int[] a) {
		int mincounter = 0;
		int maxcounter = 0;
		int min = a[0];
		int max = a[0];
		int[] result = new int[2];
		for(int i = 0 ; i < a.length; i ++) {
			if (a[i]> max)
			{
				max = a[i];
				maxcounter ++;
			}
			else if (a[i]< min){
				min = a[i];
				mincounter ++;
			}
			
			
		}
		return maxcounter +" "+mincounter;
	}

}
