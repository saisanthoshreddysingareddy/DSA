/*
Problem Description

Given a matrix of integers A of size N x M and an integer B,
write an efficient algorithm to search for integer B in matrix A.

The matrix A has the following properties:
  - Integers in each row are sorted from left to right.
  - The first integer of each row is greater than or equal to
    the last integer of the previous row.

Return 1 if B is present in A, otherwise return 0.

NOTE:
  - Rows are numbered from top to bottom.
  - Columns are numbered from left to right.

Problem Constraints
  1 <= N, M <= 1000
  1 <= A[i][j], B <= 10^6

Input Format
  The first argument is the integer matrix A.
  The second argument is the integer B.

Output Format
  Return 1 if B is present in A, else return 0.

Example Input

Input 1:
  A = [
        [1,   3,  5,  7],
        [10, 11, 16, 20],
        [23, 30, 34, 50]
      ]
  B = 3

Input 2:
  A = [
        [5, 17, 100, 111],
        [119, 120, 127, 131]
      ]
  B = 3

Example Output

Output 1:
  1

Output 2:
  0

Example Explanation

Explanation 1:
  The value 3 is present in the matrix at position A[0][1],
  so the answer is 1.

Explanation 2:
  The value 3 is not present in the matrix, so the answer is 0.
*/


public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        // [0, 1, 2, 3, 4,  5,  6,  7,  8,  9,  10, 11]
        // [1, 3, 5, 7, 10, 11, 16, 20, 23, 30, 34, 60]
        int row = A.size();
        int col = A.get(0).size();
        int i = 0;
        int j = row*col-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            int row_index = mid/col;
            int col_index = mid%col;
            int ele = A.get(row_index).get(col_index);
            if(ele < B){
                i = mid+1;
            }else if(ele>B){
                j = mid-1;
            }else{
                return 1;
            }
        }
        return 0;
    
    }
}
