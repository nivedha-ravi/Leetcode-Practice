/*
Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
*/

class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<String,Integer> hashmap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hashmap.put(s.charAt(i)+"", hashmap.containsKey(s.charAt(i)+"")?(hashmap.get(s.charAt(i)+"")+1):1);
        }
        int prev=hashmap.get(s.charAt(0)+"");
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            if(entry.getValue()!=prev)
            {
                return false;
            }
        }
        return true;
    }
}
 
