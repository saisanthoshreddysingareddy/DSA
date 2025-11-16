// Problem Description
//
// Given an integer array A, determine whether it forms a palindrome.
// A palindrome array reads the same forwards and backwards.
//
// You must solve this using the two-pointer technique.
//
// Problem Constraints
//   1 <= |A| <= 10^5
//   1 <= A[i] <= 10^9
//
// Input Format
//   The argument A is an integer array.
//
// Output Format
//   Return 1 if the array is a palindrome.
//   Return 0 otherwise.
//
// Example Input
// Input 1:
//   A = [1, 2, 3, 2, 1]
// Input 2:
//   A = [1, 2, 3, 4, 5]
// Input 3:
//   A = [7, 7]
// Input 4:
//   A = [10]
//
// Example Output
// Output 1: 1
// Output 2: 0
// Output 3: 1
// Output 4: 1
//
// Example Explanation
//   Input 1 is symmetric → palindrome.
//   Input 2 is not symmetric.
//   Inputs 3 and 4 are trivially palindromes.


public class Solution {
    public int solve(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            if (A[i] != A[j]) {
                return 0;   // Not a palindrome
            }
            i++;
            j--;
        }
        return 1;   // Palindrome
    }
}

// TC - O(N)
// SC - O(1)
