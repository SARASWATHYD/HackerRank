import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sticks= new int[n];
		for(int i = 0; i <n ; i++)
			sticks[i]= sc.nextInt();
	//solve it 		
		Arrays.sort(sticks);
		int sticksLeft = n;
        
        int curr = sticks[0];
        int currCount = 0;
        System.out.println(n);
        
        //Works by decrementing sticksLeft by the frequency of the smallest stick each time
        for(int i = 0; i < n; i++)
        {
            if(curr == sticks[i])
            {
                currCount++;
            }
            else
            {
                sticksLeft -= currCount;
                currCount = 1;
                curr = sticks[i];
                System.out.println(sticksLeft);
            }

	}
	}
	}
	
	

