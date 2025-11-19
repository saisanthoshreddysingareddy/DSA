// Problem Description
//
// You are given an integer array A of size N.
//
// You must perform exactly B operations.
// In each operation, you may remove either:
//     → the leftmost element of the array, OR
//     → the rightmost element of the array.
//
// After removing exactly B elements, return the maximum possible sum of the removed elements.
//
// Example:
// If B = 3 and A has 10 elements, the allowed choices are:
//   • Remove 3 from the front, 0 from the back
//   • Remove 2 from the front, 1 from the back
//   • Remove 1 from the front, 2 from the back
//   • Remove 0 from the front, 3 from the back
//
// -----------------------------------------------------------------------------
// Problem Constraints
// 1 <= N <= 10^5
// 1 <= B <= N
// -10^3 <= A[i] <= 10^3
//
// -----------------------------------------------------------------------------
// Input Format
// First argument: integer array A
// Second argument: integer B
//
// -----------------------------------------------------------------------------
// Output Format
// Return an integer representing the maximum sum of the B removed elements.
//
// -----------------------------------------------------------------------------
// Example Input
//
// Input 1:
//   A = [5, -2, 3, 1, 2]
//   B = 3
//
// Input 2:
//   A = [2, 3, -1, 4, 2, 1]
//   B = 4
//
// -----------------------------------------------------------------------------
// Example Output
//
// Output 1:
//   8
//
// Output 2:
//   9
//
// -----------------------------------------------------------------------------
// Example Explanation
//
// Explanation 1:
//   Remove A[0] = 5 from the front,
//   then remove A[3] = 1 and A[4] = 2 from the back.
//   Total = 5 + 1 + 2 = 8.
//
// Explanation 2:
//   Remove the first element (2) from the front,
//   and the last three elements (4, 2, 1) from the back.
//   Total = 2 + 4 + 2 + 1 = 9.


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        //Fidn first B elements sum
        int current_sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<B;i++){
            current_sum += A.get(i);
        }
        maxSum = current_sum; //6
        for(int i=1;i<=B;i++){
            current_sum = current_sum - A.get(B-i);
            current_sum = current_sum + A.get(A.size()-i);
            maxSum = Math.max(current_sum,maxSum);
        }
        return maxSum;
    }
}
