import java.util.Arrays;
import java.util.Scanner;

public class EqualizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] counts = new int[101];
        for (int i = 0; i < n; i++) {
            counts[sc.nextInt()]++;
        }
        Arrays.sort(counts);
        System.out.println(n-counts[100]);
	}

}
