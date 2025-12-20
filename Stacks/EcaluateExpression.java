/*
Problem Description

An arithmetic expression is given as a string array A of size N.
Evaluate the value of the arithmetic expression written in
Reverse Polish Notation (Postfix Expression).

Valid operators are:
  +, -, *, /

Each element of the array can be either an integer or an operator.

NOTE:
  Reverse Polish Notation is also known as Postfix Notation,
  where operators are written after their operands.

Problem Constraints
  1 <= N <= 10^5

Input Format
  The only argument given is the string array A.

Output Format
  Return the value of the arithmetic expression formed using
  Reverse Polish Notation.

Example Input

Input 1:
  A = ["2", "1", "+", "3", "*"]

Input 2:
  A = ["4", "13", "5", "/", "+"]

Example Output

Output 1:
  9

Output 2:
  6

Example Explanation

Explanation 1:
  Starting from the end:
      * : () * ()
      3 : () * (3)
      + : (() + ()) * (3)
      1 : (() + (1)) * (3)
      2 : ((2) + (1)) * (3)
  Final evaluation:
      ((2) + (1)) * (3) = 9

Explanation 2:
  Starting from the end:
      + : () + ()
      / : () + (() / ())
      5 : () + (() / (5))
      13 : () + ((13) / (5))
      4 : (4) + ((13) / (5))
  Final evaluation:
      (4) + ((13) / (5)) = 6
*/
