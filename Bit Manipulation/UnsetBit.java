/*
Problem Description

You are given two integers A and B.
If the B-th bit in A is set, make it unset.
If the B-th bit in A is unset, leave it as it is.
Return the updated value of A.

Note:
  The bit position is 0-indexed, meaning the least significant bit (LSB)
  has index 0.

Problem Constraints
  1 <= A <= 10^9
  0 <= B <= 30

Input Format
  The first argument A is an integer.
  The second argument B is an integer.

Output Format
  Return an integer representing the updated value of A.

Example Input

Input 1:
  A = 4
  B = 1

Input 2:
  A = 5
  B = 2

Example Output

Output 1:
  4

Output 2:
  1

Example Explanation

Explanation 1:
  N = 4 is 100 in binary. The 1st bit is already unset, so A remains 4.

Explanation 2:
  N = 5 is 101 in binary. The 2nd bit is set, so we unset it.
  The result becomes 001 in binary, which is 1 in decimal.
*/


public class Solution {
    public int solve(int A, int B) {
        if((A & (1<<B)) !=0){
            A = A^(1<<B);
        }
        return A;
    }
}
