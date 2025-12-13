/*
Problem Description

Given an array A, sort this array using the Count Sort Algorithm
and return the sorted array.

Problem Constraints
  1 <= |A| <= 10^5
  1 <= A[i] <= 10^5

Input Format
  The first argument is an integer array A.

Output Format
  Return an integer array that is the sorted version of A.

Example Input

Input 1:
  A = [1, 3, 1]

Input 2:
  A = [4, 2, 1, 3]

Example Output

Output 1:
  [1, 1, 3]

Output 2:
  [1, 2, 3, 4]

Example Explanation

For Input 1:
  The array in sorted order is [1, 1, 3].

For Input 2:
  The array in sorted order is [1, 2, 3, 4].
*/


public class Solution {
    public int[] solve(int[] A) {
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            if(A[i]>maxValue){
                maxValue = A[i];
            }
        }

        int[] freq_arr = new int[maxValue+1];
        for(int i=0; i<A.length; i++){
            freq_arr[A[i]]++;
        }

        int[] arr = new int[A.length];
        int k = 0;
        for(int i=0; i<freq_arr.length; i++){
            int freq = freq_arr[i];
            if(freq==0){
                continue;
            }
            while(freq>0){
                arr[k] = i;
                freq--;
                k++;
            }
        }
        return arr;
    }
}
