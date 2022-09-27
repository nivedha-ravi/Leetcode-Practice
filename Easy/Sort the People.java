/*
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
*/
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++)
        {
            for(int j=i+1;j<heights.length;j++)
            {
                if(heights[i]<heights[j])
                {
                    heights[i]=heights[i]+heights[j];
                    heights[j]=heights[i]-heights[j];
                    heights[i]=heights[i]-heights[j];
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        return names;
    }
}

