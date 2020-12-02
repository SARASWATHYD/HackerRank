package hashtable;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will
 * be traced back to him through his handwriting. He found a magazine and wants
 * to know if he can cut out whole words from it and use them to create an
 * untraceable replica of his ransom note. The words in his note are
 * case-sensitive and he must use only whole words available in the magazine. He
 * cannot use substrings or concatenation to create the words he needs.
 * 
 * Given the words in the magazine and the words in the ransom note, print Yes
 * if he can replicate his ransom note exactly using whole words from the
 * magazine; otherwise, print No.
 * 
 * For example, the note is "Attack at dawn". The magazine contains only "attack
 * at dawn". The magazine has all the right words, but there's a case mismatch.
 * The answer is .
 * 
 * Function Description
 * 
 * Complete the checkMagazine function in the editor below. It must print if the
 * note can be formed using the magazine, or .
 * 
 * checkMagazine has the following parameters:
 * 
 * magazine: an array of strings, each a word in the magazine note: an array of
 * strings, each a word in the ransom note Input Format
 * 
 * The first line contains two space-separated integers, and , the numbers of
 * words in the and the .. The second line contains space-separated strings,
 * each . The third line contains space-separated strings, each .
 * 
 * Constraints
 * 
 * . Each word consists of English alphabetic letters (i.e., to and to ). Output
 * Format
 * 
 * Print Yes if he can use the magazine to create an untraceable replica of his
 * ransom note. Otherwise, print No.
 * 
 * Sample Input
 * 
 * 6 4 give me one grand today night give one grand today Sample Output
 * 
 * Yes
 * 
 * @author saraswathy
 *
 */
public class RansomNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int firstSize = sc.nextInt();
		int secondSize = sc.nextInt();
		String[] first = new String[firstSize];
		String[] second = new String[secondSize];
		for (int i = 0; i < firstSize; i++)
			first[i] = sc.next();
		for (int i = 0; i < secondSize; i++)
			second[i] = sc.next();

		String result = new RansomNotes().isRansomNotes(first, second) ? "Yes" : "No";
		System.out.println(result);

	}

	private static boolean isRansomNotes(String[] magazine, String[] notes) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < magazine.length; i++) {
			if (hm.containsKey(magazine[i])) {
				hm.put(magazine[i], hm.get(magazine[i]) + 1);
			} else {
				hm.put(magazine[i], 1);
			}
		}
		for (int i = 0; i < notes.length; i++) {
			if (hm.containsKey(notes[i])) {
				hm.put(notes[i], hm.get(notes[i]) - 1);
				if (hm.get(notes[i]) < 0)
					return false;

			} else
				return false;

		}
		return true;
	}

}
