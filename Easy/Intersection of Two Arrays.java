/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 
Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=Arrays.stream(nums1).boxed().collect(
            Collectors.toSet());
        Set<Integer> s2=Arrays.stream(nums2).boxed().collect(
            Collectors.toSet());
        List<Integer> a=new ArrayList<Integer>();
        for(Integer i:s1)
        {
            if(s2.contains(i))
            {
                a.add(i);
            }
        }
        return a.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
