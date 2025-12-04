/*
Problem Description

Given an integer A, generate a square matrix filled with elements from 1 to A^2 
in spiral order and return the generated matrix.

Problem Constraints
  1 <= A <= 1000

Input Format
  The first and only argument is the integer A.

Output Format
  Return a 2-D matrix containing the numbers from 1 to A^2 arranged in spiral order.

Example Input

Input 1:
  1

Input 2:
  2

Input 3:
  5

Example Output

Output 1:
  [ [1] ]

Output 2:
  [ [1, 2],
    [4, 3] ]

Output 3:
  [ [1,  2,  3,  4,  5],
    [16, 17, 18, 19,  6],
    [15, 24, 25, 20,  7],
    [14, 23, 22, 21,  8],
    [13, 12, 11, 10,  9] ]

Example Explanation

Explanation 1:
  Only one element (1) needs to be placed.

Explanation 2:
  The numbers fill the matrix in a clockwise spiral:
    1 → 2
        ↓
    4 ← 3
*/


public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] arr = new int[A][A];
        int r = 0;
        int c = 0;
        int count = 1;

        int loop = A-1;
        while(loop>0){
            int i = r;
            int j = c;
            for(int k=0;k<loop; k++){
                arr[i][j] = count;
                count++;
                j++;
            }

            for(int k=0;k<loop; k++){
                arr[i][j] = count;
                count++;
                i++;
            }

            for(int k=0;k<loop; k++){
                arr[i][j] = count;
                count++;
                j--;
            }

            for(int k=0;k<loop; k++){
                arr[i][j] = count;
                count++;
                i--;
            }

            r++;
            c++;
            loop = loop - 2;
        }
        if(loop == 0){
            arr[r][c] = count;
        }
        return arr;
    }
}
