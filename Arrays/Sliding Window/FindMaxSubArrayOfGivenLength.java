// -----------------------------------------------------------------------------
// Problem Description
// -----------------------------------------------------------------------------
//
// Given an array A of length N,
// find the maximum subarray sum among all possible subarrays of length B.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// -----------------------------------------------------------------------------
// 1 <= N <= 10^5
// 1 <= A[i] <= 10^6
//
// -----------------------------------------------------------------------------
// Input Format
// -----------------------------------------------------------------------------
// First argument A is an array of integers.
// Second argument B is the length of the subarray.
//
// -----------------------------------------------------------------------------
// Output Format
// -----------------------------------------------------------------------------
// Return a single integer — the maximum subarray sum.
//
// -----------------------------------------------------------------------------
// Example Input
// -----------------------------------------------------------------------------
//
// Input 1:
//   A = [6, 7, 8, 2]
//   B = 2
//
// Input 2:
//   A = [3, 9, 5, 6, 5, 11]
//   B = 3
//
// -----------------------------------------------------------------------------
// Example Output
// -----------------------------------------------------------------------------
//
// Output 1:
//   15
//
// Output 2:
//   22
//
// -----------------------------------------------------------------------------
// Example Explanation
// -----------------------------------------------------------------------------
//
// Explanation 1:
//   The subarray with the maximum sum is [7, 8], with sum 15.
//
// Explanation 2:
//   The subarray with the maximum sum is [6, 5, 11], with sum 22.
//
// -----------------------------------------------------------------------------


public class Solution {
    public Long solve(ArrayList<Integer> A, int B) {
        long ans = -1;
        // Find first B sum
        long currentSum = 0;
        for(int i=0; i<B; i++){
            currentSum += A.get(i);
        }
        ans = Math.max(ans, currentSum);

        for(int i=B; i<A.size(); i++){
            currentSum = currentSum - A.get(i-B);
            currentSum = currentSum + A.get(i);
            ans = Math.max(ans, currentSum);
        }
        return ans;

    }
}
