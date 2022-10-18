/*
Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.

Example 1:

Input: num = 33
Output: [10,11,12]
Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
Example 2:

Input: num = 4
Output: []
Explanation: There is no way to express 4 as the sum of 3 consecutive integers.
*/
class Solution {
    public long[] sumOfThree(long num) {
      long res=num/3;
      if(res+res+1+res-1==num)
      {
        return new long[]{res-1,res,res+1};
      }
      return new long[0];
    }
}
