/*
Problem Description

Given an integer A representing the number of square blocks, where the height
of each square block is 1, your task is to create a staircase of maximum height
using these blocks.

The first stair requires 1 block, the second stair requires 2 blocks, and so on.

Find and return the maximum height of the staircase that can be built.

Problem Constraints
  0 <= A <= 10^9

Input Format
  The only argument given is the integer A.

Output Format
  Return the maximum height of the staircase using these blocks.

Example Input

Input 1:
  A = 10

Input 2:
  A = 20

Example Output

Output 1:
  4

Output 2:
  5

Example Explanation

Explanation 1:
  The staircase formed will have steps of height 1, 2, 3, and 4.

Explanation 2:
  The staircase formed will have steps of height 1, 2, 3, 4, and 5.
*/


public class Solution {
    public int solve(int A) {
        int start = 1;
        int end = A;
        int ans = 0;
        while(start <= end){
            int mid = start +(end-start)/2;
            long total = ((long)mid*(mid+1))/2;
            if(total>A){
                end = mid-1;
            }else if(total<A){
                ans = mid;
                start = mid+1;
            }else{
                return mid;
            }
        }
        return ans;
    }
}
