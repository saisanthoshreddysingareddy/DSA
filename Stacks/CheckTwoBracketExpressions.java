/*
Problem Description

Given two strings A and B, where each string represents an arithmetic
expression consisting of:
  - Lowercase English alphabets
  - Operators '+', '-'
  - Parentheses '(' and ')'

Your task is to compare the two expressions and check whether they are
logically identical.

If both expressions represent the same expression, return 1.
Otherwise, return 0.

NOTE:
  - There are at most 26 operands from 'a' to 'z'.
  - Each operand appears only once in the expression.

Problem Constraints
  1 <= length of each string <= 100

Input Format
  The input consists of two strings A and B.

Output Format
  Return 1 if both expressions are identical, else return 0.

Example Input

Input 1:
  A = "-(a+b+c)"
  B = "-a-b-c"

Input 2:
  A = "a-b-(c-d)"
  B = "a-b-c-d"

Example Output

Output 1:
  1

Output 2:
  0

Example Explanation

Explanation 1:
  The expression "-(a+b+c)" can be expanded as "-a-b-c",
  which is identical to expression B.

Explanation 2:
  The two expressions are different and are not equivalent.
*/
