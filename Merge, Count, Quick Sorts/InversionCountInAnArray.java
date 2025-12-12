/*
Problem Description

Given an array of integers A.  
If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A.  
Find the total number of inversions in A modulo (10^9 + 7).

Problem Constraints
  1 <= length of the array <= 10^5
  1 <= A[i] <= 10^9

Input Format
  The only argument given is the integer array A.

Output Format
  Return the number of inversions of A modulo (10^9 + 7).

Example Input

Input 1:
  A = [1, 3, 2]

Input 2:
  A = [3, 4, 1, 2]

Example Output

Output 1:
  1

Output 2:
  4

Example Explanation

Explanation 1:
  The pair (1, 2) is an inversion because 1 < 2 and A[1] > A[2].

Explanation 2:
  The inversions are:
    (0, 2) because A[0] > A[2]
    (0, 3) because A[0] > A[3]
    (1, 2) because A[1] > A[2]
    (1, 3) because A[1] > A[3]
*/
