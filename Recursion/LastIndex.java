/*
Problem Description

You are given an array A of size N. Write a recursive function that 
returns the last index at which the integer B is found in the array.

Note:
  If B is not found anywhere in the array, return -1.


Problem Constraints
  1 <= N <= 100
  -1000 <= A[i] <= 1000
  -1000 <= B <= 1000


Input Format
  The function contains two arguments:
    • The first argument is the array A.
    • The second argument is the element B to be searched.


Output Format
  Return an integer representing the last index of B in A.
  If B is not present, return -1.


Example Input

Input 1:
  A = [6, 5, 6, 2]
  B = 6

Input 2:
  A = [0, 1, 0, 2]
  B = 3


Example Output

Output 1:
  2

Output 2:
  -1


Example Explanation

Explanation 1:
  At index 0 → 6 (matches B, but not the last occurrence)  
  At index 1 → 5  
  At index 2 → 6 (matches B and is the last occurrence)  
  Therefore, the answer is 2.

Explanation 2:
  The element 3 does not appear anywhere in the array.
  Hence, return -1.
*/


public class Solution {
    public int LastIndex(ArrayList<Integer> A, int B) {
        int result = helper(A, B, A.size()-1);
        return result;
    }
    public int helper(ArrayList<Integer> A, int B, int index){
        if(index == -1){
            return -1;
        }
        if(A.get(index) == B){
            return index;
        }
        return helper(A, B, index-1);
    }
}
