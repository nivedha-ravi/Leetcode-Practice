/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
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
