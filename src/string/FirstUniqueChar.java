package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String test = sc.next();
		int index = new FirstUniqueChar().firstUniqChar(test);
		System.out.println(index);
	}

	public int firstUniqChar(String s) {
		char[] names = s.toCharArray();
		Map<Character, Integer> linkedhasset_Char = new LinkedHashMap();
		for (int i = 0; i < names.length; i++) {
			linkedhasset_Char.put(names[i],
					linkedhasset_Char.containsKey(names[i]) ? linkedhasset_Char.get(names[i]) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : linkedhasset_Char.entrySet()) {
			if (entry.getValue() == 1)
				return s.indexOf(entry.getKey());
		}

		return -1;
	}

}
