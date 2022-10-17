/*
Given a binary string s and a positive integer n, return true if the binary representation of all the integers in the range [1, n] are substrings of s, or false otherwise.

A substring is a contiguous sequence of characters within a string.

Example 1:

Input: s = "0110", n = 3
Output: true
Example 2:

Input: s = "0110", n = 4
Output: false
*/
class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++)
        {
          if(!s.contains(Integer.toBinaryString(i)))
          {
            return false;
          }
        }
      return true;
    }
}
