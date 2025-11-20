// -----------------------------------------------------------------------------
// Problem Description
// -----------------------------------------------------------------------------
//
// Given an array A of size N, find the subarray of size B with the least average.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// -----------------------------------------------------------------------------
// 1 <= B <= N <= 10^5
// -10^5 <= A[i] <= 10^5
//
// -----------------------------------------------------------------------------
// Input Format
// -----------------------------------------------------------------------------
// First argument contains an array A of integers of size N.
// Second argument contains integer B.
//
// -----------------------------------------------------------------------------
// Output Format
// -----------------------------------------------------------------------------
// Return the index of the first element of the subarray of size B
// that has the least average.
// Array indexing starts from 0.
//
// -----------------------------------------------------------------------------
// Example Input
// -----------------------------------------------------------------------------
//
// Input 1:
//   A = [3, 7, 90, 20, 10, 50, 40]
//   B = 3
//
// Input 2:
//   A = [3, 7, 5, 20, -10, 0, 12]
//   B = 2
//
// -----------------------------------------------------------------------------
// Example Output
// -----------------------------------------------------------------------------
//
// Output 1:
//   3
//
// Output 2:
//   4
//
// -----------------------------------------------------------------------------
// Example Explanation
// -----------------------------------------------------------------------------
//
// Explanation 1:
//   Subarray between indexes 3 and 5:
//   {20, 10, 50} has the least average among all subarrays of size 3.
//
// Explanation 2:
//   Subarray between indexes [4, 5] has the minimum average.
//
// -----------------------------------------------------------------------------


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int minIndex = 0;
        int currentIndex = minIndex;
        int sum = 0;
        int currentSum = 0;
        for(int i=0; i<B; i++){
            sum += A.get(i);
        }
        currentSum = sum;

        for(int i=B; i<A.size(); i++){
            sum = sum - A.get(i-B) + A.get(i);
            minIndex++;
            if(sum<currentSum){
                currentSum = sum;
                currentIndex = minIndex;
            }
        }
        return currentIndex;
    }
}
