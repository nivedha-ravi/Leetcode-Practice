/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
*/
class Solution {
    public boolean checkIfPangram(String sentence) {
        int a[]=new int[26];
        for(int i=0;i<sentence.length();i++)
        {
            a[sentence.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}
