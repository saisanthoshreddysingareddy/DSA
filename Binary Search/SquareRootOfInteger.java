/*
Problem Description

Given an integer A, compute and return the square root of A.
If A is not a perfect square, return floor(sqrt(A)).

Note:
  - The value of A * A can cross the range of Integer.
  - Do not use the sqrt function from the standard library.
  - The solution is expected to run in O(log(A)) time.

Problem Constraints
  0 <= A <= 10^9

Input Format
  The first and only argument given is the integer A.

Output Format
  Return floor(sqrt(A)).

Example Input

Input 1:
  11

Input 2:
  9

Example Output

Output 1:
  3

Output 2:
  3

Example Explanation

Explanation 1:
  When A = 11, the square root of A is approximately 3.316.
  Since it is not a perfect square, we return the floor value, which is 3.

Explanation 2:
  When A = 9, it is a perfect square of 3, so we return 3.
*/


public class Solution {
    public int sqrt(int A) {
        long start = 1;
        long end = A;
        long ans = 0;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid<=A){
                ans = mid;
                start = mid+1;
            }else if(mid*mid>A){
                end = mid-1;
            }
        }
        return (int)ans;
    }
}
