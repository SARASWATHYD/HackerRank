package leet;

import java.util.Scanner;

public class MedianTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[sc.nextInt()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int ar2[] = new int[sc.nextInt()];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = sc.nextInt();
		}
		System.out.println(findMedianSortedArrays(ar, ar2));

		System.out.println(findMedian(ar));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length <= 0)
			return findMedian(nums2);
		if (nums2.length <= 0)
			return findMedian(nums1);
		return (findMedian(nums1) + findMedian(nums2)) / 2;
	}

	private  static double findMedian(int[] num){
       int size = num.length;
      return (size % 2 == 0) ? ((Double.valueOf(num[size / 2]) + Double.valueOf(num[(size / 2) - 1])) / 2)
				: Double.valueOf(num[(size / 2)]);


}
