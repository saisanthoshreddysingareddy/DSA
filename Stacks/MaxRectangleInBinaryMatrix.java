/*
Problem Description

Given a 2-D binary matrix A of size N x M filled with 0's and 1's,
find the largest rectangle containing only 1's and return its area.

Problem Constraints
  1 <= N, M <= 100

Input Format
  The first argument is a 2-D binary array A.

Output Format
  Return an integer denoting the area of the largest rectangle
  containing only 1's.

Example Input

Input 1:
  A = [
        [1, 1, 1]
        [0, 1, 1]
        [1, 0, 0]
      ]

Input 2:
  A = [
        [0, 1, 0]
        [1, 1, 1]
      ]

Example Output

Output 1:
  4

Output 2:
  3

Example Explanation

Explanation 1:
  The maximum area rectangle is a 2 x 2 rectangle formed by the cells:
    (0,1), (0,2), (1,1), (1,2)

Explanation 2:
  The maximum area rectangle is a 1 x 3 rectangle formed by the cells:
    (1,0), (1,1), (1,2)
*/
