/*
Given a string s containing only lowercase English letters and the '?' character, convert all the '?' characters into lowercase letters such that the final string does not contain any consecutive repeating characters. You cannot modify the non '?' characters.

It is guaranteed that there are no consecutive repeating characters in the given string except for '?'.

Return the final string after all the conversions (possibly zero) have been made. If there is more than one solution, return any of them. It can be shown that an answer is always possible with the given constraints.
 
Example 1:

Input: s = "?zs"
Output: "azs"
Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all are valid. Only "z" is an invalid modification as the string will consist of consecutive repeating characters in "zzs".
Example 2:

Input: s = "ubv?w"
Output: "ubvaw"
Explanation: There are 24 solutions for this problem. Only "v" and "w" are invalid modifications as the strings will consist of consecutive repeating characters in "ubvvw" and "ubvww".
*/

class Solution {
    public String modifyString(String s) {
       StringBuffer sb=new StringBuffer(s);
      String alpha="abcdefghijklmnopqrstuvwxyz";
      int counter=0;
      for(int i=0;i<sb.length();i++)
      {
          if(sb.charAt(i)=='?')
          {
            if(sb.length()==1) /* replace sb as "a"*/
            {
              sb.replace(i,i+1,alpha.charAt(0)+"");
            }
            else if(i>0 && i<sb.length()-1) /* check for i-1 && i+1 not equal to alpha character*/
            {
              if(sb.charAt(i-1)==alpha.charAt(counter) || sb.charAt(i+1)==alpha.charAt(counter))
              {
                counter++;
                i--;
              }
              else
              {
                sb.replace(i,i+1,alpha.charAt(counter)+"");
                counter=0;
               
              }
            }
            else if(i==0 || i==s.length()-1)
            {
              if(sb.charAt((i==0)?i+1:i-1)==alpha.charAt(counter))
              {
                counter++; 
                i--;
              }
              else
              {
                sb.replace(i,i+1,alpha.charAt(counter)+"");
                counter=0;
               
              }
            }
          }
  
      }
      return sb.toString();
    }
}
