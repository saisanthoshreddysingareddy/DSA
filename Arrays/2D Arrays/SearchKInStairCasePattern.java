/*
Problem Description

Given a matrix of integers A of size N x M and an integer B.

In the given matrix, every row and column is sorted in non-decreasing order.
Find and return the position of B in the matrix in the following form:

  If A[i][j] = B, return (i * 1009 + j)
  If B is not present, return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple positions where A[i][j] = B, return the smallest value of (i * 1009 + j).
Note 3: Expected time complexity is linear.
Note 4: Use 1-based indexing.

Problem Constraints
  1 <= N, M <= 1000
  -100000 <= A[i] <= 100000
  -100000 <= B <= 100000


Input Format
  The first argument given is the integer matrix A.
  The second argument given is the integer B.

Output Format
  Return the position of B, or -1 if B is not present in A.
Example Input

Input 1:
  A = [[1, 2, 3],
       [4, 5, 6],
       [7, 8, 9]]
  B = 2

Input 2:
  A = [[1, 2],
       [3, 3]]
  B = 3

Example Output

Output 1:
  1011

Output 2:
  2019

Example Explanation

Explanation 1:
  A[1][2] = 2
  1 * 1009 + 2 = 1011

Explanation 2:
  A[2][1] = 3
  2 * 1009 + 1 = 2019

  A[2][2] = 3
  2 * 1009 + 2 = 2020

  The minimum value among them is 2019.
*/


public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int row = 0;
        int col = A.get(0).size()-1;
        int val = 0;
        int minVal = Integer.MAX_VALUE;
        while(row<A.size() && col>=0){
            int ele = A.get(row).get(col);
            if(ele == B){
                val = (row+1)*1009 + col+1;
                minVal = Math.min(val,minVal);
                col--;
            }
            else if(ele>B){
                col --;
            }else{
                row++;
            }
        }
        if(minVal ==Integer.MAX_VALUE){
            return -1;
        }
        return minVal;

    }
}
