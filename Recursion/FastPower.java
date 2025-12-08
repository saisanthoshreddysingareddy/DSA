/*
Problem Description

You are given two positive integers A and B. 
Your task is to compute A raised to the power B (A^B) using the Fast Power algorithm.

Note:
  You must use the optimized approach (binary exponentiation / fast power)
  as taught in the class.

Problem Constraints
  A^B will fit in a 64-bit integer.

Input Format
  Two integers A and B.

Output Format
  Return a single integer representing A^B.

Example Input

Input 1:
  A = 2, B = 10

Input 2:
  A = 1, B = 100000000

Example Output

Output 1:
  1024

Output 2:
  1

Example Explanation

Explanation 1:
  Using fast power:
    2^10 = (2^5) * (2^5)
    2^5  = (2^2) * (2^2) * 2
    2^2  = 4
  Therefore, 2^10 = 1024.

Explanation 2:
  Any power of 1 is always 1.
*/


public class Solution {
    public Long power(int A, int B) {
        long result = helper(A, B);
        return result;
    }
    public Long helper(int A, int B){
        if(B==0){
            return 1L;
        }
        long sa = helper(A, B/2);
        if(B%2==0){
            return sa*sa;
        }
        return sa*sa*A;
    }
}
// TC - O(logN)
// SC - O(logN)

// public class Solution {
//     public Long power(int A, int B) {
//         long result = helper(A, B);
//         return result;
//     }
//     public Long helper(int A, int B){
//         if(B==0){
//             return 1L;
//         }
//         return A * helper(A, B-1);
//     }
// }

// TC - O(N)
// SC - O(N)
