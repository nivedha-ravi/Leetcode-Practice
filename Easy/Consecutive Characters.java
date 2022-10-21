/*
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
*/
class Solution {
    public int maxPower(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
          int count=1;
          for(int j=i+1;j<s.length();j++)
          {
            if(s.charAt(i)==s.charAt(j))
            {
              count++;
            }
            else
            {
              break;
            }
          }
          max=Math.max(count,max);
        }
      return max;
    }
}
