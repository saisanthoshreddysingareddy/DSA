/*
Problem Description

You are given an integer A. Print numbers from 1 to A using recursion.

Note:
  After printing all the numbers from 1 to A, print a new line.

Problem Constraints
  1 <= A <= 10^4

Input Format
  The first argument A is an integer.

Output Format
  Print A space-separated integers from 1 to A.
  Note: There should be exactly one space after each integer.
  After printing all the integers, print a new line.

Example Input

Input 1:
  A = 10

Input 2:
  A = 5

Example Output

Output 1:
  1 2 3 4 5 6 7 8 9 10 

Output 2:
  1 2 3 4 5 

Example Explanation

Explanation 1:
  Print 1 to 10 as space-separated integers.

Explanation 2:
  Print 1 to 5 as space-separated integers.
*/


public class Solution {
    public void solve(int A) {
        print(A);
        System.out.println();
    }
    public void print(int A){
        if(A==1){
            System.out.print(A+" ");
            return;
        }
        print(A-1);
        System.out.print(A+" ");
    }
}
