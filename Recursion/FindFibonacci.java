/*
Problem Description

The Fibonacci numbers are the numbers in the following integer sequence:

  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

In mathematical terms, the sequence F(n) of Fibonacci numbers is defined by the recurrence relation:

  F(n) = F(n - 1) + F(n - 2)

Given an integer A, find and return the A-th Fibonacci number using recursion.

It is given that:
  F(0) = 0
  F(1) = 1

Problem Constraints
  0 <= A <= 20

Input Format
  The first and only argument is an integer A.

Output Format
  Return an integer denoting the A-th term of the Fibonacci sequence.

Example Input

Input 1:
  A = 2

Input 2:
  A = 9

Example Output

Output 1:
  1

Output 2:
  34

Example Explanation

Explanation 1:
  F(2) = F(1) + F(0) = 1 + 0 = 1

Explanation 2:
  F(9) = F(8) + F(7) = 21 + 13 = 34
*/


public class Solution {
    public int findAthFibonacci(int A) {
        if(A==0 || A==1){
            return A;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=2; i<=A; i++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }
}

// TC - O(N)

// public class Solution {
//     public int findAthFibonacci(int A) {
//         if(A==0 || A==1){
//             return A;
//         }
//         int first = findAthFibonacci(A-1);
//         int second = findAthFibonacci(A-2);
//         return first+second;
//     }
// }

// TC - O(2^N)
