package leet;

public class MedianTwoSortedArrays {


	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0, j = 0, k = 0;
		int n1 = nums1.length;
		int n2 = nums2.length;
		int[] merge = new int[n1 + n2];

		while (i < n1 && j < n2) {
			if (nums1[i] < nums2[j])
				merge[k++] = nums1[i++];
			else
				merge[k++] = nums2[j++];
		}
		while (i < n1)
			merge[k++] = nums1[i++];
		while (j < n2)
			merge[k++] = nums2[j++];

		return findMedian(merge);
	}

	private  static double findMedian(int[] num){
       int size = num.length;
      return (size % 2 == 0) ? ((Double.valueOf(num[size / 2]) + Double.valueOf(num[(size / 2) - 1])) / 2)
				: Double.valueOf(num[(size / 2)]);

	}
	
}
