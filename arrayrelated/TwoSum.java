package com.arun.arrayrelated;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
               
            }
        }
        return new int[]{};
    }
	
	public static void main(String[] args) {
		int arr[]= {3,2,4};
		int target=6;
		
		int[] twoSum = twoSum(arr,target);
		for(int i=0;i<twoSum.length;i++) {
			System.out.println(twoSum[i]);
		}
	}

}
