/*
Problem Description

Given a string A denoting an infix expression, convert the infix
expression into a postfix expression.

The string A consists of:
  - Lowercase English alphabets as operands
  - Operators: ^, /, *, +, -
  - Parentheses: (, )

Operator Precedence:
  - ^ has the highest precedence
  - / and * have equal precedence, higher than + and -
  - + and - have equal precedence and the lowest precedence

Problem Constraints
  1 <= length of the string <= 500000

Input Format
  The only argument given is the string A.

Output Format
  Return a string denoting the postfix expression of A.

Example Input

Input 1:
  A = "x^y/(a*z)+b"

Input 2:
  A = "a+b*(c^d-e)^(f+g*h)-i"

Example Output

Output 1:
  xy^az* /b+

Output 2:
  abcd^e-fgh*+^*+i-

Example Explanation

Explanation 1:
  The output denotes the postfix expression of the given infix input.
*/
