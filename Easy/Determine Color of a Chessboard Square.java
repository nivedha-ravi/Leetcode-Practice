/*
You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.

Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.

Example 1:

Input: coordinates = "a1"
Output: false
Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
Example 2:

Input: coordinates = "h3"
Output: true
Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
Example 3:

Input: coordinates = "c7"
Output: false
*/
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum=0;
        for(int i=0;i<coordinates.length();i++)
        {
            switch(coordinates.charAt(i))
            {
                case 'a':
                    sum+=1;
                    break;
                case 'b':
                    sum+=2;
                    break;
                case 'c':
                    sum+=3;
                    break;
                case 'd':
                    sum+=4;
                    break;
                case 'e':
                    sum+=5;
                    break;
                case 'f':
                    sum+=6;
                    break;
                case 'g':
                    sum+=7;
                    break;
                case 'h':
                    sum+=8;
                    break;
                default:
                    sum+=(coordinates.charAt(i)-'0');
                    break;  
                    
            }
        }
        return !(sum%2==0);
    }
}
