package leet.interview.interval;

public class IntersectionInterval {

	//Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
//	Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
		int k =0;

		int i =0;
		int j =0;
		int[][] result = new int[firstList.length > secondList.length ? firstList.length:secondList.length][];
		while ( i < firstList.length && j < secondList.length) {
			if(firstList[i][0] > secondList[j][1]) {
				j++;
				continue;
			}
			if(secondList[j][0] > firstList[i][1]) {
				i++;
				continue;
			}
			int intervalStart = Math.max(firstList[i][0],  secondList[j][0]);
			int intervalEnd = Math.min(firstList[i][1],  secondList[j][1]);
			result[k] = new int[] {intervalStart,intervalEnd};
			k++;

			if(firstList[i][1] < secondList[i][1]) {
				i++;
			} else j++;
		}
		return result;
        
    }
	
	

}
