/*
Problem Description

You are given an array A. Your task is to print all elements of the array
using recursion.

You must not use any loops. However, you may create new helper functions.
Do not change the signature of the function PrintArray.

Print the array elements in sequential order, followed by a new empty line.

Problem Constraints
  1 <= |A| <= 100
  -1000 <= A[i] <= 1000

Input Format
  One line containing the array A.

Output Format
  Print all elements of the array in the same order, separated by spaces.

Example Input

Input 1:
  A = [6, -2, 5, 3]

Input 2:
  A = [1]

Example Output

Output 1:
  6 -2 5 3 

Output 2:
  1 

Example Explanation

Explanation:
  Print the elements of the array in the order in which they appear.
*/

public class Solution {
    public void PrintArray(ArrayList<Integer> A) {
        helper(A, 0);
        System.out.println();
    }
    public void helper(ArrayList<Integer> arr, int index){
        if(index == arr.size()){
            return;
        }
        System.out.print(arr.get(index)+" ");
        helper(arr, index+1);
    }
}
