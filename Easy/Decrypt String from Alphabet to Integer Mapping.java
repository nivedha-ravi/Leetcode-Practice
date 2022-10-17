/*
You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
*/

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
          if(s.charAt(i)=='#')
          {

              sb.append((char)(Integer.parseInt(s.substring(i-2,i))+96));
              i-=2;
          }
          else
          {
              sb.append((char)(Integer.parseInt(s.substring(i,i+1))+96));            
          }

        }
        return sb.reverse().toString();
    }
}
 
