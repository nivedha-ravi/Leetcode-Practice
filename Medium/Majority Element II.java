/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
*/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
         Map<Integer,Integer> map=new HashMap<>();
        List<Integer> max=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.containsKey(nums[i])?(map.get(nums[i])+1):1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>(nums.length/3))
            {
                max.add(entry.getKey());
            }
        }
        return max;
        
    }
}
