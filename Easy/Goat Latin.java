/*
You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
For example, the word "apple" becomes "applema".
If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
Return the final sentence representing the conversion from sentence to Goat Latin.

Example 1:

Input: sentence = "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: sentence = "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
*/
class Solution {
    public String toGoatLatin(String sentence) {
        String addA="a";
        String[] sen=sentence.split(" ");
        String[] s=new String[sen.length];
        for(int i=0;i<sen.length;i++)
        {
            if(isVowel(sen[i].charAt(0)))
            {
                s[i]=sen[i]+"ma"+addA;
            }
            else
            {
                s[i]=sen[i].substring(1,sen[i].length())+sen[i].charAt(0)+"ma"+addA;
            }
            addA+='a';
        }
        return String.join(" ",s);
    }
      public boolean isVowel(char ch)
    {
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
