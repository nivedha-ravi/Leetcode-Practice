/*
Given an integer n, add a dot (".") as the thousands separator and return it in string format.

Example 1:

Input: n = 987
Output: "987"
Example 2:

Input: n = 1234
Output: "1.234"
*/
class Solution {
    public String thousandSeparator(int n) {
        String s=Integer.toString(n);
        StringBuffer sb=new StringBuffer(s);
        for(int i=s.length();i>=0;i-=3)
        {
          if(i!=s.length() && i!=0)
            sb.insert(i,".");
            
        }
        return sb.toString();
        
    }
}
