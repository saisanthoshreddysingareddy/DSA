/*
Problem Description

Given an array A, find the nearest smaller element G[i] for every element A[i]
in the array such that the element has an index smaller than i.

More formally:

G[i] for an element A[i] is an element A[j] such that:
  - j is maximum possible
  - j < i
  - A[j] < A[i]

If no such element exists, consider G[i] = -1.

Problem Constraints
  1 <= |A| <= 100000
  -10^9 <= A[i] <= 10^9

Input Format
  The only argument given is the integer array A.

Output Format
  Return an integer array G such that G[i] contains the nearest smaller
  element to the left of A[i]. If no such element exists, G[i] should be -1.

Example Input

Input 1:
  A = [4, 5, 2, 10, 8]

Input 2:
  A = [3, 2, 1]

Example Output

Output 1:
  [-1, 4, -1, 2, 2]

Output 2:
  [-1, -1, -1]

Example Explanation

Explanation 1:
  Index 0: No element less than 4 on the left, G[0] = -1
  Index 1: A[0] = 4 is less than A[1] = 5, G[1] = 4
  Index 2: No element less than 2 on the left, G[2] = -1
  Index 3: A[2] = 2 is the nearest smaller element, G[3] = 2
  Index 4: A[2] = 2 is the nearest smaller element, G[4] = 2

Explanation 2:
  Index 0: No element less than 3 on the left, G[0] = -1
  Index 1: No element less than 2 on the left, G[1] = -1
  Index 2: No element less than 1 on the left, G[2] = -1
*/
