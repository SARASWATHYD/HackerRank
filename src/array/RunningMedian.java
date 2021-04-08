package array;

import java.util.Arrays;
import java.util.Scanner;

public class RunningMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++)
			a[i] = sc.nextInt();
		double[] d = runningMedian(a);
		System.out.println(Arrays.toString(d));

	}

	static double[] runningMedian(int[] a) {

		double[] result = new double[a.length];
		for (int i = 1; i <= a.length; i++) {
			int[] val = Arrays.copyOfRange(a, 0, i);
			Arrays.sort(val);
			result[i - 1] = getMedian(val);
		}
		return result;
	}


	static void printArr(double[] val) {
		for (int i = 0; i < val.length; i++) {
			System.out.println("arr::" + val[i]);
		}
	}

	static double getMedian(int[] val) {
		System.out.println(Arrays.toString(val));
		return val.length % 2 != 0 ? val[val.length / 2] : getEvenMedian(val);

	}

	static double getEvenMedian(int[] arr) {
//		if (arr.length == 2) {
//			return (double) (arr[0] + arr[1]) / 2;
//		}
		return (double) (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
	}

}
