/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int a[]=new int[26];
        int b[]=new int[26];
        if((s.length()>t.length()) || (t.length()>s.length()))
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
            b[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
        
    }
}
