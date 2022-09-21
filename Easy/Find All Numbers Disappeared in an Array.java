/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a =new ArrayList<Integer>();
        Arrays.sort(nums);
        int[] hash=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        for(int i=1;i<hash.length;i++)
        {
            if(hash[i]==0)
            {
                a.add(i);
            }
        }
        return a;
    }
}
