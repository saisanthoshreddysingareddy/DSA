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

import java.util.*;

public class Solution {
    public String solve(String A) {
        StringBuilder output = new StringBuilder(); // Efficient
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char curr = A.charAt(i);

            if (Character.isLetter(curr)) {  // Operand
                output.append(curr);
            } 
            else if (curr == '(') {         // Opening brace
                st.push(curr);
            } 
            else if (curr == ')') {         // Closing brace
                while (!st.isEmpty() && st.peek() != '(') {
                    output.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();  // pop '('
            } 
            else {                          // Operator
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(curr)) {
                    output.append(st.pop());
                }
                st.push(curr);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            output.append(st.pop());
        }

        return output.toString();
    }

    private int precedence(char op) {
        if (op == '^') return 3;
        if (op == '*' || op == '/') return 2;
        if (op == '+' || op == '-') return 1;
        return 0;
    }
}
