/*
Problem Description

Given a binary sorted matrix A of size N x N, find the row with the maximum number of 1s.

NOTE:
  • If two rows have the maximum number of 1s, return the row with the lower index.
  • Rows are numbered from top to bottom and columns from left to right.
  • Assume 0-based indexing.
  • Each row is sorted in non-decreasing order (0s first, then 1s).
  • Expected time complexity is O(rows + columns).

Problem Constraints
  1 <= N <= 1000
  0 <= A[i][j] <= 1

Input Format
  The only argument given is the integer matrix A.


Output Format
  Return the index of the row with the maximum number of 1s.

Example Input

Input 1:
  A = [ [0, 1, 1],
        [0, 0, 1],
        [0, 1, 1] ]

Input 2:
  A = [ [0, 0, 0, 0],
        [0, 0, 0, 1],
        [0, 0, 1, 1],
        [0, 1, 1, 1] ]

Example Output

Output 1:
  0

Output 2:
  3

Example Explanation

Explanation 1:
  Row 0 has the maximum number of 1s.

Explanation 2:
  Row 3 has the maximum number of 1s.
*/


public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col = A.get(0).size();
        int max_Ones = Integer.MIN_VALUE;
        int i = 0;
        int j = col-1;
        int ones_count =0;
        int result_i = -1;
        while(i<A.size() && j>=0){
            if(A.get(i).get(j) == 1){
                ones_count++;
                j--;
                result_i = i;
            }else{
                i++;
            }
        }
        return result_i;

    }
}
