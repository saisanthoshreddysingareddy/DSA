/*
Problem Description

You are given a binary array A of length N where each element is either 0 or 1.
Your task is to count the number of subarrays whose bitwise OR is equal to 1.

Problem Constraints
  1 <= N <= 10^4
  A[i] is either 0 or 1

Input Format
  The first and only argument is an integer array A.

Output Format
  Return a single integer representing the number of subarrays where
  the bitwise OR of all elements equals 1.

Example Input

Input 1:
  A = [0, 0, 1, 1, 0]

Input 2:
  A = [0, 0, 0]

Example Output

Output 1:
  11

Output 2:
  0

Example Explanation

Explanation 1:
  The subarrays with OR = 1 are:
    [0, 0, 1],
    [0, 0, 1, 1],
    [1], [1],
    [1, 1],
    [1, 0],
    [1, 1, 0],
    [0, 0, 1, 1, 0],
    [0, 1],
    [0, 1, 1],
    [0, 1, 1, 0]
  Total count = 11.

Explanation 2:
  All elements are 0, so no subarray has OR = 1.
  Therefore, the answer is 0.
*/


public class Solution {
    public int subarraysWithOR1(ArrayList<Integer> A) {
        int zeroes = 0;
        int ans = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i) == 0){
                zeroes++;
            }else{
                ans = ans + (zeroes *(zeroes+1))/2;
                zeroes = 0;
            }
        }
        ans = ans + (zeroes * (zeroes+1))/2;
        int ones = (A.size() * (A.size() +1))/2 - ans;
        return ones;
    }
}
