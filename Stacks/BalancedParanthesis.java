/*
Problem Description

Given an expression string A, examine whether the pairs and the order of
"{", "}", "(", ")", "[", "]" are correct in the string.

Refer to the examples for better understanding.

Problem Constraints
  1 <= |A| <= 100

Input Format
  The first and only argument of input contains the string A
  having the parenthesis sequence.

Output Format
  Return 1 if the parenthesis sequence is balanced.
  Return 0 if the parenthesis sequence is not balanced.

Example Input

Input 1:
  A = "{([])}"

Input 2:
  A = "(){"

Input 3:
  A = "()[]"

Example Output

Output 1:
  1

Output 2:
  0

Output 3:
  1

Example Explanation

In the first and third examples, the parenthesis sequence is valid
because every opening bracket has a corresponding closing bracket
in the correct order.

In the second example, there is no closing bracket for "{",
so the parenthesis sequence is invalid.
*/

public class Solution {
    public int solve(String A) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return 0;
                }
                char val = st.peek();
                if((val == '[' && ch == ']') || (val == '(' && ch == ')') || (val == '{' && ch == '}') ){
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()){
            return 0;
        }
        return 1;
    }
}
