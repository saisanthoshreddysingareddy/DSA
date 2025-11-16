// Problem Description

// Given a sorted integer array A, remove the duplicates in-place such that each element appears only once, and return the number of unique elements. You must perform this operation in-place using constant extra memory.
//
// NOTE:
//   After removing duplicates, the first 'k' elements of the array (where 'k' is the returned value) will contain the unique elements in sorted order.
//   The values beyond index 'k - 1' do not matter.

// Problem Constraints
//   1 <= |A| <= 10^5
//   1 <= A[i] <= 10^9
//
// Input Format:   First argument is a sorted integer array A.
// Output Format:   Return an integer — the count of unique elements.
//
// Example Input
// Input 1:   A = [1, 1, 2]
// Input 2:   A = [0, 0, 0, 1, 1, 2, 2, 3]

// Example Output
// Output 1:   2
// Output 2:   4
//
// Example Explanation
// Explanation 1:
//   Unique elements are [1, 2].
//   So the function returns 2.
//
// Explanation 2:
//   Unique elements are [0, 1, 2, 3].
//   So the function returns 4.


public class Solution {
    public int solve(int[] A) {
        if (A.length == 0){
          return 0;
        }
        int index = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                A[index] = A[i];
                index++;
            }
        }
        return index;
    }
}

// TC - O(N)
// SC - O(1)
