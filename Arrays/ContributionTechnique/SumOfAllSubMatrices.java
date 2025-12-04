/*
Problem Description

Given a 2D matrix A of dimensions N x N, return the sum of all possible submatrices.


Problem Constraints
  1 <= N <= 30
  0 <= A[i][j] <= 10


Input Format
  Single argument representing a 2D array A of size N x N.


Output Format
  Return an integer denoting the sum of all possible submatrices in the given matrix.


Example Input

Input 1:
  A = [ [1, 1],
        [1, 1] ]

Input 2:
  A = [ [1, 2],
        [3, 4] ]


Example Output

Output 1:
  16

Output 2:
  40


Example Explanation

Example 1:
  Number of submatrices with 1 element  = 4 → sum = 4 * 1 = 4
  Number of submatrices with 2 elements = 4 → sum = 4 * 2 = 8
  Number of submatrices with 3 elements = 0
  Number of submatrices with 4 elements = 1 → sum = 4
  Total Sum = 4 + 8 + 4 = 16

Example 2:
  The submatrices are:
    [1], [2], [3], [4],
    [1, 2], [3, 4],
    [1, 3], [2, 4],
    [[1, 2],
     [3, 4]]
  Total sum = 40
*/

public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        //Contribution technique
        int sum=0;
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(i).size();j++){
                int contri = (i+1)*(j+1)*(A.size()-i)*(A.get(i).size()-j);
                sum += A.get(i).get(j) * contri;
            }
        }
        return sum;
    }
}
