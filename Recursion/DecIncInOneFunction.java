/*
Problem Description

Print N numbers in decreasing order and then in increasing order using recursion.

You are given a positive integer N.
You must print numbers from N down to 1, and then from 1 up to N.
You are not allowed to use any loops.
Do not change the signature of the function `DecThenInc`.

Note:
  Print a new line after printing the output.

Problem Constraints
  1 <= N <= 100

Input Format
  The first line contains a single integer N.

Output Format
  Print a single line containing numbers from N to 1 and then from 1 to N.
  Each number should be followed by a space.

Example Input

Input 1:
  1

Input 2:
  4

Example Output

Output 1:
  1 1

Output 2:
  4 3 2 1 1 2 3 4

Example Explanation

Explanation 1:
  For N = 1 → print "1" in decreasing order and "1" in increasing order.

Explanation 2:
  For N = 4 → print:
    4 3 2 1 (decreasing order)
    1 2 3 4 (increasing order)
*/

public class Solution {
    public void DecThenInc(int A) {
        helper(A);
        System.out.println();
    }
    public void helper(int A){
        if(A==1){
            System.out.print("1 1 ");
            return;
        }
        System.out.print(A + " ");
        helper(A-1);
        System.out.print(A + " ");
    }
}


// public class Solution {
//     public void DecThenInc(int A) {
//         printDec(A);
//         printInc(A);
//         System.out.println();
//     }
//     public void printDec(int A){
//         if(A==1){
//             System.out.print(A+" ");
//             return;
//         }
//         System.out.print(A+" ");
//         printDec(A-1);
//     }
//     public void printInc(int A){
//         if(A==1){
//             System.out.print(A+" ");
//             return;
//         }
//         printInc(A-1);
//         System.out.print(A+" ");
//     }
// }
