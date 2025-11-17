// Problem Description
//
// You are given an array A of integers of size N.
//
// Your task is to find the equilibrium index of the array.
//
// The equilibrium index is defined as an index i such that:
//     sum of elements at lower indexes  ==  sum of elements at higher indexes
//
// If the left side or right side is empty, its sum is considered 0.
//
// Notes:
// • Array indexing starts from 0.
// • If there is no equilibrium index, return -1.
// • If multiple equilibrium indices exist, return the smallest one.
//
// ----------------------------------------------------------------------
//
// Problem Constraints
// 1 <= N <= 10^5
// -10^5 <= A[i] <= 10^5
//
// ----------------------------------------------------------------------
//
// Input Format
// First argument is an array A.
//
// ----------------------------------------------------------------------
//
// Output Format
// Return the equilibrium index of the array.
// If no such index exists, return -1.
//
// ----------------------------------------------------------------------
//
// Example Input
//
// Input 1:
//   A = [-7, 1, 5, 2, -4, 3, 0]
//
// Input 2:
//   A = [1, 2, 3]
//
// ----------------------------------------------------------------------
//
// Example Output
//
// Output 1:
//   3
//
// Output 2:
//   -1
//
// ----------------------------------------------------------------------
//
// Example Explanation
//
// Explanation 1:
//
// Index   Sum of elements on left     Sum of elements on right
//   0                0                              7
//   1               -7                              6
//   2               -6                              1
//   3               -1                             -1   <-- equilibrium
//   4                1                              3
//   5               -3                              0
//   6                0                              0
//
// At index 3:
//   A[0] + A[1] + A[2]  =  A[4] + A[5] + A[6]
//
// Hence, equilibrium index = 3.
//
// ----------------------------------------------------------------------
//
// Explanation 2:
//
// Index   Sum of elements on left     Sum of elements on right
//   0                0                              5
//   1                1                              3
//   2                3                              0
//
// No index satisfies left_sum == right_sum.
// Hence output = -1.
//



public class Solution {
    public int solve(ArrayList<Integer> A) {
        int total = 0;
        for(int i=0; i<A.size();i++){
            total += A.get(i);
        }

        int left_sum = 0;
        int right_sum = 0;
        for(int i=0;i<A.size();i++){
            right_sum = total - A.get(i) - left_sum;
            if(left_sum == right_sum){
                return i;
            }
            left_sum += A.get(i);
        }

        return -1;
    }
}
