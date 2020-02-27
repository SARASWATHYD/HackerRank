import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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

		Map<Integer, Integer> elements = new HashMap<>();
		List<Integer> count = new ArrayList();
		List<Integer> keys = new ArrayList<>();
		for (int i : ar) {
			if (elements.containsKey(i))
				elements.put(i, elements.get(i) + 1);
			else
				elements.put(i, 1);
		}
		for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
			count.add(entry.getValue());
		}

		for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
			if (entry.getValue() == Collections.max(count))
				keys.add(entry.getKey());
		}
		return Collections.min(keys);
	}
	
}
