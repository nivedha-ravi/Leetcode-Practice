/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hashmap.put(nums[i], hashmap.containsKey(nums[i])?(hashmap.get(nums[i])+1):1);
        }
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}
