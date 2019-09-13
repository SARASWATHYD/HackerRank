import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ClimbingLeaderBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int leaderscoresCount = sc.nextInt();
		int scores[] = new int[leaderscoresCount];
		for(int i = 0; i < leaderscoresCount; i++)
			scores[i] = sc.nextInt();
		int aliceScoresCount = sc.nextInt();
		int aliceScores[] = new int[aliceScoresCount];
		
		for(int i = 0; i < aliceScoresCount; i++)
			aliceScores[i] = sc.nextInt();
		new ClimbingLeaderBoard().climbingLeaderBoard(scores,aliceScores);
	}
	private void climbingLeaderBoard(int[] scores , int[] aliceScores){
		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		int rank;
		for(int i = 0 ; i < scores.length ; i ++) 
			set.add(scores[i]);
		
			for(int j = 0 ; j < aliceScores.length ; j++) {
				set.add(aliceScores[j]);
				rank =	getIndex(set,aliceScores[j])+1;
				System.out.println(rank);
		}
	}
	public static int getIndex(Set<? extends Object> set, Object value) {
		   int result = 0;
		   for (Object entry:set) {
		     if (entry.equals(value)) return result;
		     result++;
		   }
		   return -1;
		 }

}
