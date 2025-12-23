/*
Problem Description

Given a stack of integers A, sort the stack using another stack.

Return the array of integers after sorting the stack using
an additional stack.

Problem Constraints
  1 <= |A| <= 5000
  0 <= A[i] <= 10^9

Input Format
  The only argument is a stack given as an integer array A.

Output Format
  Return the array of integers after sorting the stack
  using another stack.

Example Input

Input 1:
  A = [5, 4, 3, 2, 1]

Input 2:
  A = [5, 17, 100, 11]

Example Output

Output 1:
  [1, 2, 3, 4, 5]

Output 2:
  [5, 11, 17, 100]

Example Explanation

Explanation 1:
  The given stack is sorted in ascending order.

Explanation 2:
  The given stack is sorted in ascending order.
*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Stack<Integer> inputStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        for(int i=0;i<A.size();i++){
            inputStack.push(A.get(i));   
        }

        while(!inputStack.isEmpty()){
            int curr = inputStack.pop();
            while(!tempStack.isEmpty() && curr < tempStack.peek()){
                inputStack.push(tempStack.pop());
            }
            tempStack.push(curr);
        }

        ArrayList<Integer> values_arr = new ArrayList<>();
        while(!tempStack.isEmpty()){
            values_arr.add(tempStack.pop()); // 100 17 11 5
        }
        ArrayList<Integer> sorted_arr = new ArrayList<>();
        for(int i=values_arr.size()-1; i>=0; i--){
            sorted_arr.add(values_arr.get(i));
        }
        return sorted_arr;
    }
}
