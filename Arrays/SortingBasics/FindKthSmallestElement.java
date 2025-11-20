// -----------------------------------------------------------------------------
// Problem Description
// -----------------------------------------------------------------------------
//
// You are given an array A, where A[i] represents the price of a stock on day i.
// You must find the maximum profit that can be earned by performing **at most
// ONE transaction**:
//
//      → Buy one share on any day
//      → Sell that share on a later day
//
// You are NOT allowed to sell before you buy.
// If no profit is possible, return 0.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// -----------------------------------------------------------------------------
// 0 <= A.size() <= 700000
// 1 <= A[i] <= 10^7
//
// -----------------------------------------------------------------------------
// Input Format
// -----------------------------------------------------------------------------
// The only argument is an integer array A.
//
// -----------------------------------------------------------------------------
// Output Format
// -----------------------------------------------------------------------------
// Return an integer representing the maximum possible profit from one transaction.
//
// -----------------------------------------------------------------------------
// Example Input
// -----------------------------------------------------------------------------
//
// Input 1:
//   A = [1, 2]
//
// Input 2:
//   A = [1, 4, 5, 2, 4]
//
// -----------------------------------------------------------------------------
// Example Output
// -----------------------------------------------------------------------------
//
// Output 1:
//   1
//
// Output 2:
//   4
//
// -----------------------------------------------------------------------------
// Example Explanation
// -----------------------------------------------------------------------------
//
// Explanation 1:
//   Buy on day 0 at price = 1
//   Sell on day 1 at price = 2
//   Profit = 2 - 1 = 1
//
// Explanation 2:
//   Buy on day 0 at price = 1
//   Sell on day 2 at price = 5
//   Profit = 5 - 1 = 4
//
// -----------------------------------------------------------------------------


public class Solution {
    public int kthsmallest(final List<Integer> A, int B) {
        Collections.sort(A);
        int val = A.get(B-1);
        return val;
    }
}
