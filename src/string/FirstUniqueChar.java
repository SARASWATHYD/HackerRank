package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

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

//	public int firstUniqChar2(String s) {
//		char[] arr = s.toCharArray();
//		List<char[]> list = Arrays.asList(arr);
//		Optional<Character> chars = list.stream().distinct().collect(Collectors.toList()).findFirst();
//		if (chars.isPresent())
//			return chars.indexOf(chars);
//		else
//			return -1;
//	}
}
