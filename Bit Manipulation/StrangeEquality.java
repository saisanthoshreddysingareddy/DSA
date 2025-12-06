/*
Problem Description

Given an integer A.

Two numbers X and Y are defined as follows:

  • X is the greatest number smaller than A such that
    (X XOR A) = (X + A).

  • Y is the smallest number greater than A such that
    (Y XOR A) = (Y + A).

You must find and return the value of (X XOR Y).

NOTE 1:
  XOR of X and Y is defined as (X ^ Y), where '^' is the BITWISE XOR operator.

NOTE 2:
  Your code will be tested against up to 100000 test cases,
  so an efficient solution is required.

Problem Constraints
  1 <= A <= 10^9

Input Format
  The first and only argument is an integer A.


Output Format
  Return an integer denoting the value of (X XOR Y).

Example Input
  A = 5

Example Output
  10

Example Explanation

  For A = 5:

    X is the greatest integer less than 5 such that:
      X XOR 5 = X + 5
    This condition holds for X = 2.

    Y is the smallest integer greater than 5 such that:
      Y XOR 5 = Y + 5
    This condition holds for Y = 8.

  Therefore,
    X XOR Y = 2 ^ 8 = 10.
*/
