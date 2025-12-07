/*
Problem Description

Write a recursive function to check whether a given string A is a palindrome.

A palindrome is a string that reads the same forwards and backwards.

You must return 1 if the string A is a palindrome, otherwise return 0.

Problem Constraints
  1 <= |A| <= 50000
  String A consists only of lowercase English letters.

Input Format
  The first and only argument is a string A.

Output Format
  Return 1 if the string A is a palindrome, else return 0.

Example Input

Input 1:
  A = "naman"

Input 2:
  A = "strings"

Example Output

Output 1:
  1

Output 2:
  0

Example Explanation

Explanation 1:
  The string "naman" reads the same forward and backward.
  Therefore, it is a palindrome and the function should return 1.

Explanation 2:
  The string "strings" does not read the same backward.
  Therefore, it is not a palindrome, so return 0.
*/


public class Solution {
    public int solve(String A) {
        int result = helper(A, 0, A.length()-1);
        return result;
    }
    public int helper(String A, int s, int e){
        if(s>=e){
            return 1;
        }
        if(A.charAt(s) != A.charAt(e)){
            return 0;
        }
        return helper(A, s+1, e-1);
    }
}
