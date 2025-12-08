/*
Problem Description

Given an array A of size N, write a recursive function that returns 
the maximum element in the array.


Problem Constraints
  1 <= N <= 100
  -1000 <= A[i] <= 1000


Input Format
  The first line contains the array A.


Output Format
  Return a single integer representing the maximum value 
  present in the array.


Example Input

Input 1:
  A = [12, 10, 3, 4, 5]

Input 2:
  A = [1, -5, 80, -40]


Example Output

Output 1:
  12

Output 2:
  80


Example Explanation

Explanation 1:
  The maximum element in the array [12, 10, 3, 4, 5] is 12.

Explanation 2:
  The maximum element in the array [1, -5, 80, -40] is 80.
*/


public class Solution {
    public int getMax(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int result = helper(A, 0);
        return result;
    }
    public int helper(ArrayList<Integer> A, int index){
        if(index == A.size()-1){
            return A.get(index);
        }
        return Math.max(A.get(index), helper(A,index+1));
    }
}
