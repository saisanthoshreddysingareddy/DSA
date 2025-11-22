// Problem Description
//
// Given a string A of size N, find and return the longest
// palindromic substring in A.
//
// A substring of string A is A[i...j] where 0 <= i <= j < len(A).
//
// Palindrome string:
//   A string that reads the same backward as forward.
//   More formally, A is a palindrome if reverse(A) = A.
//
// In case of a conflict (multiple answers),
// return the substring that appears first
// — i.e., the one with the smallest starting index.

// Problem Constraints
//   1 <= N <= 6000

// Input Format
//   The first and only argument is a string A.

// Output Format
//   Return the longest palindromic substring of A.

// Example Input
// Input 1:
//   A = "aaaabaaa"
// Input 2:
//   A = "abba"

// Example Output
// Output 1:
//   "aaabaaa"
// Output 2:
//   "abba"

// Example Explanation
/*
  Explanation 1:
    The longest palindromic substring is "aaabaaa",
    which has length 7.

  Explanation 2:
    The longest palindromic substring is "abba",
    which has length 4.
*/


public class Solution {
    public String longestPalindrome(String A) {
        StringBuilder sb = new StringBuilder();
        int maxLen = 1;
        int start = 0;
        for(int i=0; i<A.length()-1; i++){
            int evenLength = findLength(i,i+1,A);
            int oddLength = findLength(i,i,A);
            int len = Math.max(evenLength,oddLength);
            if(len>maxLen){
                maxLen = len;
                start = i-(len-1)/2;
            }
        }
        int end = start+maxLen;
        return A.substring(start,end);

    }
    public int findLength(int s, int e, String A){
        while((s>=0 && e<A.length()) &&  A.charAt(s)==A.charAt(e)){
            s--;
            e++;
        }
        return e-s-1;
    }
}
