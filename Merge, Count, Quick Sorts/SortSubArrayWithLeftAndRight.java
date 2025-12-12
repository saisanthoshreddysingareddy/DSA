/*
Problem Description

You are given an array A of integers of length N and two indices B and C.

Your task is to sort the subarray A[B..C] within the given array.
The rest of the array should remain unchanged.

Problem Constraints
  1 <= N <= 10^5
  0 <= A[i] <= 10^9
  0 <= B <= C <= N - 1

Input Format
  The first argument is the array A of length N.
  The next two arguments are the integers B and C.

Output Format
  Return the array after sorting the subarray [B, C].

Example Input

Input 1:
  A = [59, 11, 8, 91, 49, 44, 8]
  B = 4
  C = 6

Input 2:
  A = [50, 40, 30, 20, 10]
  B = 0
  C = 3

Example Output

Output 1:
  [59, 11, 8, 91, 8, 44, 49]

Output 2:
  [20, 30, 40, 50, 10]

Example Explanation

Explanation 1:
  The subarray A[4..6] = [49, 44, 8].
  After sorting, it becomes [8, 44, 49].
  The rest of the array remains unchanged.

Explanation 2:
  The subarray A[0..3] = [50, 40, 30, 20].
  After sorting, it becomes [20, 30, 40, 50].
  The rest of the array remains unchanged.
*/
