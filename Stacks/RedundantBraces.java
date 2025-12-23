/*
Problem Description

Given a string A denoting an arithmetic expression.
The expression contains the following operators:
  '+', '-', '*', '/'

Check whether the expression A contains redundant braces or not.

NOTE:
  - A is always a valid expression.
  - The expression does not contain any white spaces.

Problem Constraints
  1 <= |A| <= 10^5

Input Format
  The only argument given is the string A.

Output Format
  Return 1 if the expression contains redundant braces.
  Otherwise, return 0.

Example Input

Input 1:
  A = "((a+b))"

Input 2:
  A = "(a+(a+b))"

Example Output

Output 1:
  1

Output 2:
  0

Example Explanation

Explanation 1:
  The expression "((a+b))" contains redundant braces,
  so the output is 1.

Explanation 2:
  The expression "(a+(a+b))" does not contain any redundant
  braces, so the output is 0.
*/

public class Solution {
    public int braces(String A) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            boolean hasOperator = false;
            if(ch == ')' ){ 
                while(!st.isEmpty() && st.peek() != '('){
                    char top = st.pop();
                    if(top == '+' || top == '-' || top == '*' || top == '/'){
                        hasOperator = true;
                    }   
                }
                st.pop();
                if(!hasOperator){
                    return 1;
                }
            }else{
                st.push(ch);
            }
        }
        return 0;
    }
}
