/*
Problem Description

An integer is given to you in the form of an array, with each element being a
separate digit.

Find the smallest number (leading zeroes are allowed) that can be formed by
rearranging the digits of the given number. Return the smallest number in the
form of an array.

Note:
  - Do NOT use any sorting algorithm or library sort method.

Problem Constraints
  1 <= N <= 10^5
  0 <= A[i] <= 9

Input Format
  The first argument A is an array of length N, representing digits of a number.

Output Format
  Return an array representing the smallest possible number formed
  by rearranging the digits.

Example Input

Input 1:
  A = [6, 3, 4, 2, 7, 2, 1]

Input 2:
  A = [4, 2, 7, 3, 9, 0]

Example Output

Output 1:
  [1, 2, 2, 3, 4, 6, 7]

Output 2:
  [0, 2, 3, 4, 7, 9]

Example Explanation

Explanation 1:
  It can be proved that a rearrangement of digits of 6342721 cannot be
  smaller than 1223467.

Explanation 2:
  Similarly, a rearrangement for 427390 cannot be smaller than 023479,
  i.e., 23479.
*/
