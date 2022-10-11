/*
Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
*/
class Solution {
    public int[] sumZero(int n) {
        int[] c=new int[n];
        int counter=1;
        /*Add positive negative pair from 1*/
        for(int i=0;i<((n%2==0)?n:n-1);i++)
        {
           c[i]=(i%2==0)?counter:counter*-1;
           counter=(i%2==0)?counter:counter+1;
        }
        c[n-1]=(n%2==1)?0:c[n-1];
        return c;
        
    }
}
