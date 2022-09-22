/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 
Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/

class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(isVowel(ch[i]) && isVowel(ch[j]))
               {
                    char c=ch[i];
                    ch[i]=ch[j];
                    ch[j]=c;
                       i++;
                       j--;
               }
               else if(isVowel(ch[i]))
               {
                   j--;
               }
               else if(isVowel(ch[j]))
               {
                   i++;
               }
               else
               {
                   i++;
                   j--;
               }
        }
        return new String(ch);
    }
    public boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
