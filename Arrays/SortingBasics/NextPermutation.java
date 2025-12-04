/*
Problem Description

Implement the next permutation operation, which rearranges numbers into the
numerically next greater permutation for a given array A of size N.

If such an arrangement is not possible, rearrange the array into the lowest
possible order (i.e., sorted in ascending order).

NOTE:
  • The replacement must be done in-place; do not allocate extra memory.
  • DO NOT USE LIBRARY FUNCTIONS for next permutation. Using them will
    disqualify your submission retroactively and result in penalty points.


Problem Constraints
  1 <= N <= 5 * 10^5
  1 <= A[i] <= 10^9


Input Format
  The first and only argument is an integer array A.


Output Format
  Return an array of integers representing the next permutation of A.


Example Input

Input 1:
  A = [1, 2, 3]

Input 2:
  A = [3, 2, 1]


Example Output

Output 1:
  [1, 3, 2]

Output 2:
  [1, 2, 3]


Example Explanation

Explanation 1:
  The next permutation of [1, 2, 3] is [1, 3, 2].

Explanation 2:
  No greater permutation exists for [3, 2, 1], so we return the lowest
  possible ordering: [1, 2, 3].
*/


public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        if(A.size()<=1){
            return A;
        }
        // [1, 2, 3, 6, 5, 4]
        // Find the index where pattern breaks
        int i = A.size()-2;
        while(i>=0 && A.get(i)>=A.get(i+1)){
            i--;
        }

        // Find the minimum element on the right 
        int j = A.size()-1;
        if(i>=0){
            while(j>=0 && A.get(j)<=A.get(i)){
                j--;
            }
            swap(A,i,j);
        }

        //Reverse the second part 
        //[1 2 4 6 5 3]
        int start = i+1;
        int end = A.size()-1;
        while(start<end){
            swap(A, start, end);
            start++;
            end--;
        }
        return A;
    }
    public void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(j);
        A.set(j, A.get(i));
        A.set(i, temp);
    }
}

