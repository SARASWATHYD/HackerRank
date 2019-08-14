import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MigratoryBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0 ; i < n ; i ++)
			ar[i] = sc.nextInt();
		
		System.out.println(migratorybirds(ar));

	}
	
	static public int migratorybirds(int ar[]) {
		Map<Integer, Integer> map = new HashMap();
		List<Integer> repeatlist = new ArrayList();
		
		Set<Integer> hashSet = new HashSet();
		List<Integer> numberlist = new ArrayList();
				
				
		for(int i = 0 ; i < ar.length ; i ++) {
			for(int j = 0 ; j < ar.length ; j++)
			{
			numberlist.add(ar[i]);
			hashSet.add(ar[i]);
			}
			
		}
		//check whether number list has repeated number
		for(int i : numberlist) {
			if(hashSet.contains(i)&&!repeatlist.contains(i)) 
				repeatlist.add(i);
			
			}		
		return  Collections.min(repeatlist);
	}
	
}
