/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
*/
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.containsKey(nums[i])?(map.get(nums[i])+1):1);
        }
        int max=nums.length/2,maxelement=-1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                maxelement=entry.getKey();
            }
        }
        return maxelement;
    }
}
