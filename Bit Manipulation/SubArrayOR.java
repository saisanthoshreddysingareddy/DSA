/*
Problem Description

You are given an array of integers A of size N.

The value of a subarray is defined as the BITWISE OR of all elements in that subarray.

Your task is to return the sum of values of all subarrays of A,
modulo (10^9 + 7).

Problem Constraints
  1 <= N <= 10^5
  1 <= A[i] <= 10^8

Input Format
  The first argument given is the integer array A.

Output Format
  Return an integer representing the sum of the values of all subarrays of A,
  modulo (10^9 + 7).

Example Input

Input 1:
  A = [1, 2, 3, 4, 5]

Input 2:
  A = [7, 8, 9, 10]

Example Output

Output 1:
  71

Output 2:
  110

Example Explanation

Explanation 1:
  Value([1]) = 1
  Value([1, 2]) = 3
  Value([1, 2, 3]) = 3
  Value([1, 2, 3, 4]) = 7
  Value([1, 2, 3, 4, 5]) = 7

  Value([2]) = 2
  Value([2, 3]) = 3
  Value([2, 3, 4]) = 7
  Value([2, 3, 4, 5]) = 7

  Value([3]) = 3
  Value([3, 4]) = 7
  Value([3, 4, 5]) = 7

  Value([4]) = 4
  Value([4, 5]) = 5

  Value([5]) = 5

  Sum of all these values = 71

Explanation 2:
  The sum of OR values of all subarrays of [7, 8, 9, 10] is 110.
*/


public class Solution {
    public int solve(ArrayList<Integer> A) {

        long MOD = 1_000_000_007;
        long total = 0;
        int n = A.size();

        for (int bit = 0; bit < 32; bit++) {
            long totalSubarrays = (long) n * (n + 1) / 2;
            long subarraysWithoutBit = 0;
            long len = 0;

            for (int i = 0; i < n; i++) {
                if ((A.get(i) & (1 << bit)) == 0) {
                    len++;
                } else {
                    subarraysWithoutBit += len * (len + 1) / 2;
                    len = 0;
                }
            }

            // Add the last segment if it ends without the bit
            subarraysWithoutBit += len * (len + 1) / 2;

            long subarraysWithBit = totalSubarrays - subarraysWithoutBit;
            total = (total + subarraysWithBit * (1L << bit)) % MOD;
    }

    return (int) total;


    }
}
