/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicogrpahically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicogrpahically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
*/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char lexo=letters[0];
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<letters.length;i++)
        {
            if(Math.abs(letters[i]-target)>=1 && letters[i]>target) 
            {
                if(diff>Math.abs(letters[i]-target))
                {
                  diff=Math.abs(letters[i]-target);
                  lexo=letters[i];
                }
            }
        }
        return lexo;
    }
}
