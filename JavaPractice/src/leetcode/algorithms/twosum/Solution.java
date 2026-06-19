package leetcode.algorithms.twosum;

public class Solution {
	
	public static int[] twoSum(int[] nums, int target) {
		
		int[] solution = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = 0; j < nums.length; j++) {
				
				if(i != j) {
					if(nums[i] + nums[j] == target) {
						solution[0] = i;
						solution[1] = j;
						return solution;
					}
				}
			}
		}
		
		return solution;
	}
	
	public static void main(String[] args) {
		
//		int[] nums = { 2, 7, 11, 15};
		int[] nums = { 3,2,4};
//		int[] nums = { 2, 7, 11, 15};
//		int target = 9;
		int target = 6;
//		int target = 9;
		
		int[] solution = twoSum(nums, target);
		
		for(Integer i : solution) {
			System.out.println(i);
		}
	}
}
