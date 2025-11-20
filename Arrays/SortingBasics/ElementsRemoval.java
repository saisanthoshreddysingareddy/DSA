// -----------------------------------------------------------------------------
// Problem Description
// -----------------------------------------------------------------------------
//
// You are given an integer array A of size N.
// You may remove **any one element** from the array in one operation.
//
// The cost of each removal operation is:
//        → The sum of ALL elements still present in the array
//          **BEFORE** the element is removed.
//
// After removing an element, the array becomes smaller,
// and the next removal cost is calculated based on the new array.
//
// Your task:
//        Find the **minimum total cost** required to remove all elements.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// -----------------------------------------------------------------------------
// 0 <= N <= 1000
// 1 <= A[i] <= 10^3
//
// -----------------------------------------------------------------------------
// Input Format
// -----------------------------------------------------------------------------
// The first and only argument is an integer array A.
//
// -----------------------------------------------------------------------------
// Output Format
// -----------------------------------------------------------------------------
// Return an integer denoting the total cost of removing all elements.
//
// -----------------------------------------------------------------------------
// Example Input
// -----------------------------------------------------------------------------
//
// Input 1:
//   A = [2, 1]
//
// Input 2:
//   A = [5]
//
// -----------------------------------------------------------------------------
// Example Output
// -----------------------------------------------------------------------------
//
// Output 1:
//   4
//
// Output 2:
//   5
//
// -----------------------------------------------------------------------------
// Example Explanation
// -----------------------------------------------------------------------------
//
// Explanation 1:
//   A = [2, 1]
//
//   Operation 1:
//      Remove 2 → Remaining array = [1]
//      Cost = (2 + 1) = 3
//
//   Operation 2:
//      Remove 1 → Remaining array = []
//      Cost = (1) = 1
//
//   Total cost = 3 + 1 = 4
//
// Explanation 2:
//   Only one element (5).
//   Removing it costs = 5
// -----------------------------------------------------------------------------


public class Solution {
    public int solve(ArrayList<Integer> A) {
         Collections.sort(A, Collections.reverseOrder());

        int totalCost = 0;
        int sum = 0;

        // Calculate sum of all elements first
        for (int num : A) {
            sum += num;
        }

        // Remove elements in descending order
        for (int num : A) {
            totalCost += sum; 
            sum -= num;
        }

        return totalCost;
    }
}
