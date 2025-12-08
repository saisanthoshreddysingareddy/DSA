/*
Problem Description

Given a number A, check whether it is a magic number or not.

A number is said to be a magic number if the sum of its digits is 
repeatedly calculated until a single digit is obtained. If this 
single digit is equal to 1, then the number is considered a 
magic number.


Problem Constraints
  1 <= A <= 10^9


Input Format
  The first and only argument is an integer A.


Output Format
  Return 1 if the given number is a magic number,
  otherwise return 0.


Example Input

Input 1:
  A = 83557

Input 2:
  A = 1291


Example Output

Output 1:
  1

Output 2:
  0


Example Explanation

Explanation 1:
  Sum of digits of 83557 = 28
  Sum of digits of 28    = 10
  Sum of digits of 10    = 1
  The final single digit is 1, so 83557 is a magic number.
  Return 1.

Explanation 2:
  Sum of digits of 1291 = 13
  Sum of digits of 13   = 4
  The final single digit is 4, not 1.
  Therefore, 1291 is not a magic number.
  Return 0.
*/

public class Solution {
    public int solve(int A) {
        int result = helper(A);
        if(result==1){
            return 1;
        }
        return 0;
    }
    public int helper(int A){
        if(A<10){
            return A;
        }
        int sum = 0;
        while(A>0){
            sum =sum + A%10;
            A = A/10;
        }
        return helper(sum);
    }
}
