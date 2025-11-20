// -----------------------------------------------------------------------------
// Problem Description
// -----------------------------------------------------------------------------
//
// Given an array A of length N, and integers B and C.
//
// Return 1 if there exists a subarray of length B whose sum is equal to C,
// otherwise return 0.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// -----------------------------------------------------------------------------
// 1 <= N <= 10^5
// 1 <= A[i] <= 10^4
// 1 <= B <= N
// 1 <= C <= 10^9
//
// -----------------------------------------------------------------------------
// Input Format
// -----------------------------------------------------------------------------
// First argument A is an array of integers.
// The remaining arguments B and C are integers.
//
// -----------------------------------------------------------------------------
// Output Format
// -----------------------------------------------------------------------------
// Return 1 if such a subarray exists, and 0 otherwise.
//
// -----------------------------------------------------------------------------
// Example Input
// -----------------------------------------------------------------------------
//
// Input 1:
//   A = [4, 3, 2, 6, 1]
//   B = 3
//   C = 11
//
// Input 2:
//   A = [4, 2, 2, 5, 1]
//   B = 4
//   C = 6
//
// -----------------------------------------------------------------------------
// Example Output
// -----------------------------------------------------------------------------
//
// Output 1:
//   1
//
// Output 2:
//   0
//
// -----------------------------------------------------------------------------
// Example Explanation
// -----------------------------------------------------------------------------
//
// Explanation 1:
//   The subarray [3, 2, 6] has length 3 and sum 11.
//
// Explanation 2:
//   No subarray of length 4 has sum 6.
//
// -----------------------------------------------------------------------------


public class Solution {
    public int solve(ArrayList<Integer> A, int B, int C) {
        // Find first B sum
        int currentSum = 0;
        for(int i=0;i<B; i++){
            currentSum += A.get(i);
        }
        if(currentSum == C){
            return 1;
        }

        for(int i=B; i<A.size(); i++){
            currentSum = currentSum - A.get(i-B);
            currentSum = currentSum + A.get(i);
            if(currentSum == C){
                return 1;
            }
        }
        return 0;
    }
}
