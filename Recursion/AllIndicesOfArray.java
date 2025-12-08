/*
Problem Description

Given an array of integers A with N elements and a target integer B, 
your task is to find all the indices at which B occurs in the array.

Note:
  The problem encourages recursive logic for learning purposes.
  Although the online judge does not enforce recursion, it is 
  recommended to use a recursive solution to align with the 
  intended learning objective.

Problem Constraints
  1 <= N <= 10^3
  1 <= A[i] <= 10^3
  1 <= B <= 10^3
  It is guaranteed that the target B exists at least once in array A.

Input Format
  The first argument is an array of integers A.
  The second argument is the target integer B.

Output Format
  Return the sorted array of indices where B occurs.

Example Input

Input 1:
  A = [1, 2, 3, 4, 5]
  B = 1

Input 2:
  A = [8, 9, 5, 6, 5, 5]
  B = 5

Example Output

Output 1:
  [0]

Output 2:
  [2, 4, 5]

Example Explanation

Explanation 1:
  The target value 1 occurs at index 0.
  Therefore, the output is [0].

Explanation 2:
  The target value 5 occurs at indices 2, 4, and 5.
  Thus, the returned array is [2, 4, 5].
*/


public class Solution {
    public ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(A, B, 0, arr);
        return arr;
    }
    public void helper(ArrayList<Integer> A, int B, int index,  ArrayList<Integer> arr){
        if(index == A.size()){
            return;
        }
        if(A.get(index) == B){
            arr.add(index);
        }
        helper(A, B, index+1, arr);
    }
}
