// Problem Description
//
// You are given a 2D integer matrix A.
// Return a 1D integer array containing the column-wise sums of the matrix.
//
// Problem Constraints
//   1 <= A.size() <= 10^3
//   1 <= A[i].size() <= 10^3
//   1 <= A[i][j] <= 10^3
//
// Input Format
//   The first argument is a 2D integer matrix A.
//
// Output Format
//   Return an integer array where each element is the sum of the values
//   in one column of the matrix.
//
// Example Input
// Input 1:
//   A = [
//     [1, 2, 3, 4],
//     [5, 6, 7, 8],
//     [9, 2, 3, 4]
//   ]
//
// Example Output
// Output 1:
//   [15, 10, 13, 16]
//
// Example Explanation
//   Column 1: 1 + 5 + 9 = 15
//   Column 2: 2 + 6 + 2 = 10
//   Column 3: 3 + 7 + 3 = 13
//   Column 4: 4 + 8 + 4 = 16


public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<A.get(0).size(); i++){
            int sum = 0;
            for(int j=0; j<A.size(); j++){
                sum += A.get(j).get(i);
            }
            arr.add(sum);
        }
        return arr;
    }
}
