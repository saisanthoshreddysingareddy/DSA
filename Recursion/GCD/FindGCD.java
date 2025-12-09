/*
Problem Description

You are given two non-negative integers A and B.
You need to compute their Greatest Common Divisor (GCD).

The GCD of two integers A and B is the largest integer 'g' such that:
  - g divides A
  - g divides B

You must implement the GCD operation yourself.
Do NOT use any built-in library functions.

Both A and B fit in a 32-bit signed integer.

Problem Constraints
  0 <= A, B <= 10^9

Input Format
  The first argument is an integer A.
  The second argument is an integer B.

Output Format
  Return an integer representing gcd(A, B).

Example Input

Input 1:
  A = 4
  B = 6

Input 2:
  A = 6
  B = 7

Example Output

Output 1:
  2

Output 2:
  1

Example Explanation

Explanation 1:
  2 is the greatest integer that divides both 4 and 6.

Explanation 2:
  1 is the only positive integer that divides both 6 and 7.
*/


public class Solution {
    public int gcd(int A, int B) {
        // Extended Euclids Algorithm
        if(A==0){
            return B;
        }
        if(B==0){
            return A;
        }
        if(A>B){
            return gcd(A%B,B);
        }else{
            return gcd(B%A,A);
        }
    }
}
