/*
Problem Description

Given an array with N objects colored red, white, or blue,
sort them so that objects of the same color are adjacent,
with the colors appearing in the order: red, white, and blue.

We represent the colors as:
  red   -> 0
  white -> 1
  blue  -> 2

Note:
  - Using the library sort function is not allowed.

Problem Constraints
  1 <= N <= 1,000,000
  0 <= A[i] <= 2

Input Format
  The first and only argument is an integer array A.

Output Format
  Return an integer array sorted in the required order.

Example Input

Input 1:
  A = [0, 1, 2, 0, 1, 2]

Input 2:
  A = [0]

Example Output

Output 1:
  [0, 0, 1, 1, 2, 2]

Output 2:
  [0]

Example Explanation

Explanation 1:
  The array [0, 0, 1, 1, 2, 2] is the required sorted order.

Explanation 2:
  The array [0] is already in the required order.
*/

public class Solution {
    public int[] sortColors(int[] A) {
        int[] freq_arr = new int[3];
        for(int i=0; i<A.length; i++){
            freq_arr[A[i]]++;
        }
        int[] arr = new int[A.length];
        int k = 0;
        for(int i=0; i<freq_arr.length; i++){
            int freq = freq_arr[i];
            while(freq>0){
                arr[k] = i;
                freq--;
                k++;
            }
        }
        return arr;
    }
}
