/*
Problem Description

Given an array of integers A, find and return the peak element in the array.

An array element is considered a peak if it is not smaller than its neighbors.
For corner elements, only one neighbor needs to be considered.

NOTE:
  - It is guaranteed that the array contains only a single peak element.
  - The array may contain duplicate elements.
  - The solution is expected to run in O(log N) time.

Problem Constraints
  1 <= |A| <= 100000
  1 <= A[i] <= 10^9

Input Format
  The only argument given is the integer array A.

Output Format
  Return the peak element.

Example Input

Input 1:
  A = [1, 2, 3, 4, 5]

Input 2:
  A = [5, 17, 100, 11]

Example Output

Output 1:
  5

Output 2:
  100

Example Explanation

Explanation 1:
  5 is the peak element.

Explanation 2:
  100 is the peak element.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int start = 0;
        int end = A.size()-1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if((mid == 0 || A.get(mid)>=A.get(mid-1)) && (mid==A.size()-1 || A.get(mid)>=A.get(mid+1))){
                return A.get(mid);
            }else if(mid == A.size()-1 || A.get(mid)<A.get(mid+1)){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
