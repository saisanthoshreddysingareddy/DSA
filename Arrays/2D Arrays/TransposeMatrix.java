// Problem Description
//
// Given a 2D integer array A, return the transpose of A.
//
// The transpose of a matrix is the matrix flipped over its main diagonal,
// switching the matrix's row and column indices.
//
// Problem Constraints
//   1 <= A.size() <= 1000
//   1 <= A[i].size() <= 1000
//   1 <= A[i][j] <= 1000
//
// Input Format
//   First argument is a 2D matrix of integers.
//
// Output Format
//   Return the transpose of this 2D matrix.
//
// Example Input
// Input 1:
//   A = [[1, 2, 3],
//        [4, 5, 6],
//        [7, 8, 9]]
//
// Input 2:
//   A = [[1, 2],
//        [1, 2],
//        [1, 2]]
//
// Example Output
// Output 1:
//   [[1, 4, 7],
//    [2, 5, 8],
//    [3, 6, 9]]
//
// Output 2:
//   [[1, 1, 1],
//    [2, 2, 2]]
//
// Example Explanation
//   Explanation 1:
//     After converting rows to columns and columns to rows,
//     [[1, 2, 3],
//      [4, 5, 6],
//      [7, 8, 9]]
//     becomes
//     [[1, 4, 7],
//      [2, 5, 8],
//      [3, 6, 9]].
//
//   Explanation 2:
//     After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]].


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> two_d = new ArrayList<>();
        for(int i=0;i<A.get(0).size();i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<A.size();j++){
                arr.add(A.get(j).get(i));
            }
            two_d.add(arr);
        }
        return two_d;
    }
}
