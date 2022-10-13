/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 
Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
*/
class Solution {
    public boolean rotateString(String s, String goal) {
        int len=s.length();
        for(int i=0;i<s.length();i++)
        {
            String prev=s.substring(1,len)+s.substring(0,1);
            if(prev.equals(goal))
            {
                return true;
            }
            s=new String(prev);
        }
        return false;
    }
}
 
