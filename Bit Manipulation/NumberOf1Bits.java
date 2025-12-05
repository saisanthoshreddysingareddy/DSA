/*
Problem Description

Write a function that takes an integer A and returns the number of 1 bits
present in its binary representation.

Problem Constraints
  1 <= A <= 10^9

Input Format
  The first and only argument contains the integer A.

Output Format
  Return an integer representing the count of set bits (1s) in A.

Example Input

Input 1:
  11

Input 2:
  6

Example Output

Output 1:
  3

Output 2:
  2

Example Explanation

Explanation 1:
  11 is represented as 1011 in binary, which contains 3 ones.

Explanation 2:
  6 is represented as 110 in binary, which contains 2 ones.
*/


public class Solution {
    public int numSetBits(int A) {
        int count = 0;
        for(int i=0; i<32; i++){
            if((A & (1<<i)) != 0){
                count++;
            }
        }
        return count;
    }
}
