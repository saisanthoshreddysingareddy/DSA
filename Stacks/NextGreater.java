/*
Problem Description

Given an array A, find the next greater element G[i] for every element A[i]
in the array.

The next greater element for an element A[i] is the first greater element
on the right side of A[i] in the array.

More formally:

G[i] for an element A[i] is an element A[j] such that:
  - j is the minimum possible index
  - j > i
  - A[j] > A[i]

If no such element exists, consider G[i] = -1.

Problem Constraints
  1 <= |A| <= 10^5
  1 <= A[i] <= 10^7

Input Format
  The first and only argument of input contains the integer array A.

Output Format
  Return an integer array representing the next greater element
  for each index in A.

Example Input

Input 1:
  A = [4, 5, 2, 10]

Input 2:
  A = [3, 2, 1]

Example Output

Output 1:
  [5, 10, 10, -1]

Output 2:
  [-1, -1, -1]

Example Explanation

Explanation 1:
  For 4, the next greater element on the right is 5.
  For 5 and 2, the next greater element on the right is 10.
  For 10, there is no greater element on the right, so G[i] = -1.

Explanation 2:
  Since the array is in descending order, there is no next greater
  element for any of the elements.
*/

public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            arr.add(0);
        }
        for(int i=A.size()-1; i>=0; i--){
            while(!st.isEmpty() && A.get(i)>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                arr.set(i, -1);
            }else{
                arr.set(i, st.peek());
            }
            st.push(A.get(i));
        }
        return arr;
    }
}
