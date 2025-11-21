// Problem Description
//
// You are given a matrix A and an integer B.
// You must perform scalar multiplication of matrix A with the integer B.
//
// Scalar multiplication means: multiply every element of the matrix by B.
//
// Problem Constraints
//   1 <= A.size() <= 1000
//   1 <= A[i].size() <= 1000
//   1 <= A[i][j] <= 1000
//   1 <= B <= 1000
//
// Input Format
//   First argument is a 2D integer matrix A.
//   Second argument is an integer B.
//
// Output Format
//   Return a 2D integer matrix after performing scalar multiplication.
//
// Example Input
// Input 1:
//   A = [
//     [1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]
//   ]
//   B = 2
//
// Input 2:
//   A = [
//     [1]
//   ]
//   B = 5
//
// Example Output
// Output 1:
//   [
//     [2, 4, 6],
//     [8, 10, 12],
//     [14, 16, 18]
//   ]
//
// Output 2:
//   [
//     [5]
//   ]
//
// Example Explanation
//   Explanation 1:
//     Multiply every element of A by 2:
//       [[1*2, 2*2, 3*2],
//        [4*2, 5*2, 6*2],
//        [7*2, 8*2, 9*2]]
//     Result:
//       [[2, 4, 6],
//        [8, 10, 12],
//        [14, 16, 18]]
//
//   Explanation 2:
//     [[1]] * 5 = [[5]]


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).size();j++){
                int val = A.get(i).get(j);
                A.get(i).set(j,val*B);
            }
        }
        return A;
    }
}
