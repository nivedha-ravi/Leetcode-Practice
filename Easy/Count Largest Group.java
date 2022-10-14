/*
You are given an integer n.

Each number from 1 to n is grouped according to the sum of its digits.

Return the number of groups that have the largest size.

Example 1:

Input: n = 13
Output: 4
Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
There are 4 groups with largest size.
Example 2:

Input: n = 2
Output: 2
Explanation: There are 2 groups [1], [2] of size 1
*/
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> hashmap=new HashMap<>();
        int max=0,count=0;
        for(int i=1;i<=n;i++)
        {
            int num=sum(i);
            hashmap.put(num, hashmap.containsKey(num)?(hashmap.get(num)+1):1);
            max=Math.max(hashmap.get(num),max);
        }
        for(Map.Entry<Integer,Integer> entry:hashmap.entrySet())
        {
            count+=(entry.getValue()==max)?1:0;
        }
        return count;
    }
    public int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    
}
