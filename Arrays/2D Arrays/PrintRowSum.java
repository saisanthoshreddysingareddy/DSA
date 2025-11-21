// Problem Description
//
// You are given a 2D matrix A of integers.
//
// Your task is to compute the sum of elements in each row and return a
// 1D array where each element represents the sum of a corresponding row
// in the matrix.
//
// Problem Constraints
//   1 <= A.size() <= 10^3
//   1 <= A[i].size() <= 10^3
//   1 <= A[i][j] <= 10^3
//
// Input Format
//   The first argument A is a 2D integer matrix.
//
// Output Format
//   Return an integer array containing row-wise sums of the matrix.
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
//   [10, 26, 18]
//
// Example Explanation
//   Row 1: 1 + 2 + 3 + 4 = 10
//   Row 2: 5 + 6 + 7 + 8 = 26
//   Row 3: 9 + 2 + 3 + 4 = 18


public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer>  arr = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            int sum = 0;
            for(int j=0;j<A.get(0).size();j++){
                sum += A.get(i).get(j);
            }
            arr.add(sum);
        }
        return arr;
    }
}
