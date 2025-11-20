// -----------------------------------------------------------------------------
// Problem Description
// -----------------------------------------------------------------------------
//
// You are given an integer array C of size A.
// You need to find a subarray (contiguous elements) such that the sum of the
// contiguous elements is maximum, but the sum must not exceed B.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// -----------------------------------------------------------------------------
// 1 <= A <= 10^3
// 1 <= B <= 10^9
// 1 <= C[i] <= 10^6
//
// -----------------------------------------------------------------------------
// Input Format
// -----------------------------------------------------------------------------
// The first argument is the integer A.
// The second argument is the integer B.
// The third argument is the integer array C.
//
// -----------------------------------------------------------------------------
// Output Format
// -----------------------------------------------------------------------------
// Return a single integer which denotes the maximum sum.
//
// -----------------------------------------------------------------------------
// Example Input
// -----------------------------------------------------------------------------
//
// Input 1:
//   A = 5
//   B = 12
//   C = [2, 1, 3, 4, 5]
//
// Input 2:
//   A = 3
//   B = 1
//   C = [2, 2, 2]
//
// -----------------------------------------------------------------------------
// Example Output
// -----------------------------------------------------------------------------
//
// Output 1:
//   12
//
// Output 2:
//   0
//
// -----------------------------------------------------------------------------
// Example Explanation
// -----------------------------------------------------------------------------
//
// Explanation 1:
//   We can select {3, 4, 5}, which sums to 12, and this is the maximum
//   possible sum <= B.
//
// Explanation 2:
//   All elements are greater than B, so no subarray can be selected.
//   Hence, the answer is 0.
//
// -----------------------------------------------------------------------------



public class Solution {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int left = 0;
        int currentSum = 0;
        int ans = 0;
        for(int right = 0; right<A;right++){
            currentSum = currentSum + (C.get(right));
            while(currentSum>B){
                currentSum = currentSum - C.get(left);
                left++;
            }
            ans = Math.max(ans, currentSum);
        }
        return ans;
    }
}
