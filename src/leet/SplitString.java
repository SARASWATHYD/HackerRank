package leet;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println(new SplitString().balancedStringSplit(sc.next()));
	}

	public int balancedStringSplit(String s) {
		int l=0,r=0,count=0;
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i)=='L')
				l++;
			if(s.charAt(i)=='R')
				r++;
			if (l == r)
				count++;

		}
		return count;
	}
}
