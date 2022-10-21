/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
          map1.put(nums1[i], map1.containsKey(nums1[i])?(map1.get(nums1[i])+1):1);
        }
        for(int i=0;i<nums2.length;i++)
        {
          map2.put(nums2[i], map2.containsKey(nums2[i])?(map2.get(nums2[i])+1):1);
        }
         for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
              if(map2.containsKey(entry.getKey()))
              {
                int times=(entry.getValue()>=map2.get(entry.getKey()))?map2.get(entry.getKey()):entry.getValue();
                  for(int i=0;i<times;i++)
                  {
                    list.add(entry.getKey());
                  }
              }
          }
      return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
