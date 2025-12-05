/*
Problem Description

You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return the resulting number in
decimal representation.

Note:
  Bit positions are 0-indexed, meaning the least significant bit (LSB)
  has index 0.

Problem Constraints
  0 <= A <= 30
  0 <= B <= 30

Input Format
  The first argument A is an integer.
  The second argument B is an integer.

Output Format
  Return an integer representing the value obtained after setting
  the A-th and B-th bits.

Example Input

Input 1:
  A = 3
  B = 5

Input 2:
  A = 4
  B = 4

Example Output

Output 1:
  40

Output 2:
  16

Example Explanation

Explanation 1:
  Setting the 3rd and 5th bits gives the binary expression 101000,
  which equals 40 in decimal.

Explanation 2:
  Setting the 4th bit gives the binary expression 10000,
  which equals 16 in decimal.
*/


public class Solution {
    public int solve(int A, int B) {
        int ans = 0;
        ans = ans | (1<<A);
        ans = ans | (1<<B);
        return ans;
    }
}
