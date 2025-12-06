/*
Problem Description

You are given an integer A. Print numbers from A down to 1 using recursion.

Note:
  After printing all the numbers from A to 1, print a new line.

Problem Constraints
  1 <= A <= 10^4

Input Format
  The first argument A is an integer.

Output Format
  Print A space-separated integers from A to 1.
  Note: There should be exactly one space after each integer.
  After printing all the integers, print a new line.

Example Input

Input 1:
  10

Input 2:
  5

Example Output

Output 1:
  10 9 8 7 6 5 4 3 2 1 

Output 2:
  5 4 3 2 1 

Example Explanation

Explanation 1:
  Print numbers from 10 down to 1 as space-separated integers.

Explanation 2:
  Print numbers from 5 down to 1 as space-separated integers.
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
        System.out.print(A+" ");
        print(A-1);
    }
}
