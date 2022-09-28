/*
You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.

Example 1:

Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
Example 2:

Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.
 */
 class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            int count=0;
            for(int j=0;j<pref.length() && j<words[i].length();j++)
            {
                if(words[i].charAt(j)!=pref.charAt(j))
                {
                    break;
                }
                else
                {
                    count++;
                }
            }
            if(count==pref.length())
            {
                c+=1;
            }
        }
        return c;
    }
}
