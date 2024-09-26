package Com.mar7.examTest;

import java.util.Arrays;

public class FourSum 
{

	    public static void findFourSum(int[] nums, int target) 
	    {
	        Arrays.sort(nums);
	        int n = nums.length;
	        //10, 20, 30, 40, 1, 2
	        
	        //0    1   2   | \         => i loop
	        
	        //0    1   2   3         => j loop
	        
	        for (int i = 0; i < n - 3; i++) 
	        {
	            for (int j = i + 1; j < n - 2; j++)
	            {
	                int left = j + 1; 
	                int right = n - 1; 
	             
	                while (left < right) 
	                {
	                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
	                   
	                    if (sum == target) 
	                    {
	                        System.out.println("(" + nums[i] + ", " + nums[j] + ", " + nums[left] + ", " + nums[right] + ")");
	                        left++;
	                        right--;
	                    } 
	                    else if (sum < target)
	                    {
	                        left++;
	                    } 
	                    else
	                    {
	                        right--;
	                    }
	                }
	            }
	        }
	    }

	    public static void main(String[] args)
	    {
	        int[] nums = {10, 20, 30, 40, 1, 2};
	        int target = 53;

	        System.out.println("Groups of four elements whose sum is " + target + ":");
	        findFourSum(nums, target);
	    }
}








































































