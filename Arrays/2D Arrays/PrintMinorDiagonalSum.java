// Problem Description
//
// You are given an N x N integer matrix A.
// You have to find the sum of all the minor diagonal elements of A.
//
// The minor diagonal of an M x M matrix A consists of elements A[i][j]
// such that (i + j = M + 1) using 1-based indexing.
//
// Problem Constraints
//   1 <= N <= 10^3
//   -1000 <= A[i][j] <= 1000
//
// Input Format
//   The first and only argument is a 2D integer matrix A.
//
// Output Format
//   Return an integer denoting the sum of the minor diagonal elements.
//
// Example Input
// Input 1:
//   A = [
//     [ 1, -2, -3],
//     [-4,  5, -6],
//     [-7, -8,  9]
//   ]
//
// Input 2:
//   A = [
//     [3, 2],
//     [2, 3]
//   ]
//
// Example Output
// Output 1:
//   -5
//
// Output 2:
//   4
//
// Example Explanation
//   Explanation 1:
//     Minor diagonal elements (1-based indexing):
//       A[1][3] = -3
//       A[2][2] = 5
//       A[3][1] = -7
//     Sum = -3 + 5 - 7 = -5
//
//   Explanation 2:
//     Minor diagonal elements:
//       A[1][2] = 2
//       A[2][1] = 2
//     Sum = 2 + 2 = 4



public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int row = 0;
        int col = A.get(0).size()-1;
        int sum = 0;
        while(row<A.size() && col >=0){
            sum += A.get(row).get(col);
            row++;
            col--;
        }
        return sum;
    }
}
