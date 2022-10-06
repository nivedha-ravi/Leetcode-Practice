/*
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
*/
class Solution {
    public boolean halvesAreAlike(String s) {
        int firsthalfvowel=0,secondhalfvowel=0;
        for(int i=0;i<s.length()/2;i++)
        {
            firsthalfvowel+=(isVowel(s.charAt(i)))?1:0;
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            secondhalfvowel+=(isVowel(s.charAt(i)))?1:0;
            if(secondhalfvowel>firsthalfvowel)
            {
                return false;
            }
        }
        return (firsthalfvowel==secondhalfvowel)?true:false;
    }
    public boolean isVowel(char ch)
    {
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
