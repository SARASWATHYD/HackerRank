import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DesignerPDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[26];
		List<Integer> values = new ArrayList();
		Map<Character, Integer> map = new HashMap<>(26);
		for(char i = 'a' ; i <='z' ; i ++) 
			map.put(i, sc.nextInt());
		
		String input = sc.next();
		char[] inputChar = input.toCharArray();
		for(int i = 0; i < inputChar.length; i ++) 
			values.add( map.get(inputChar[i]));
		Integer maxValue = Collections.max(values);
		System.out.println(maxValue *(inputChar.length));
	           
	}

}
