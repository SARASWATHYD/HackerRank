package cyclicsort;

public class FindDuplicateNumber {
//	https://leetcode.com/problems/find-the-duplicate-number/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i]!=i+1){
            int correctIndex = nums[i]-1;
             if(nums[i]!= nums[correctIndex])
                swap(nums,i,correctIndex);
              else return nums[i];
            } else i++;
        }
        return -1;
    }
    private void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
