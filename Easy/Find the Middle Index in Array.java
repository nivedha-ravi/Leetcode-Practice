/*
Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

Example 1:

Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4
Example 2:

Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0
Example 3:

Input: nums = [2,5]
Output: -1
Explanation: There is no valid middleIndex.
*/

class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int leftsum=0,rightsum=0;
            //leftsum 
            for(int j=0;j<i;j++)
            {
                leftsum+=nums[j];
            }
            //rightsum
            for(int j=i+1;j<nums.length;j++)
            {
                rightsum+=nums[j];
            }
            if(leftsum==rightsum)
            {
                return i;
            }
        }
        return -1;
    }
}
