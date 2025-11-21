// Problem Description
//
// You are given an N x N integer matrix A.
// Your task is to find the sum of all the main diagonal elements.
//
// The main diagonal of a matrix A consists of elements A[i][j]
// such that i = j.
//
// Problem Constraints
//   1 <= N <= 10^3
//   -1000 <= A[i][j] <= 1000
//
// Input Format
//   There is 1 line in the input.
//   First two integers R and C denote the number of rows and columns.
//   Then R * C integers follow, representing the matrix elements in row-wise order.
//
// Output Format
//   Return an integer representing the sum of the main diagonal elements.
//
// Example Input
// Input 1:
//   3 3 1 -2 -3 -4 5 -6 -7 -8 9
//
// Input 2:
//   2 2 3 2 2 3
//
// Example Output
// Output 1:
//   15
//
// Output 2:
//   6
//
// Example Explanation
//   Explanation 1:
//     Matrix size = 3.
//     Main diagonal elements (0-based indexing):
//       A[0][0] = 1
//       A[1][1] = 5
//       A[2][2] = 9
//     Sum = 1 + 5 + 9 = 15
//
//   Explanation 2:
//     Matrix size = 2.
//     Main diagonal elements:
//       A[0][0] = 3
//       A[1][1] = 3
//     Sum = 3 + 3 = 6


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        for(int i=0; i<A.size();i++){
            sum += A.get(i).get(i);
        }
        return sum;
    }
}
