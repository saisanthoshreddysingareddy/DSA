/*
Problem Description

You are given:
  - An integer A representing a target sum
  - An array of integers B

Your task is to determine whether there exists a pair of indices (i, j)
such that:

      B[i] + B[j] = A
      i != j

If such a pair exists, return 1.
Otherwise, return 0.

You do NOT need to return the actual pair, only whether it exists.

Problem Constraints
  1 <= Length of array B <= 100000
  0 <= B[i] <= 10^9
  0 <= A <= 10^9

Input Format
  The first argument is the target sum A.
  The second argument is the integer array B.

Output Format
  Return 1 if a valid pair exists, otherwise return 0.

Example Input

Input 1:
  A = 8
  B = [3, 5, 1, 2, 1, 2]

Input 2:
  A = 21
  B = [9, 10, 7, 10, 9, 1, 5, 1, 5]

Example Output

Output 1:
  1

Output 2:
  0

Example Explanation

Explanation 1:
  A pair (3, 5) adds up to 8. Hence, return 1.

Explanation 2:
  No two elements in the array sum to 21. Hence, return 0.
*/


