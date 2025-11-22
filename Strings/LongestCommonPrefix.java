// Problem Description
//
// Given an array of strings A, you need to find the longest string S,
// which is the prefix of ALL the strings in the array.
//
// The longest common prefix between two strings S1 and S2 is the
// longest string S which is a prefix of both S1 and S2.
//
// Example:
//   Longest common prefix of "abcdefgh" and "abcefgh" is "abc".

// Problem Constraints
//   0 <= sum of lengths of all strings <= 1,000,000

// Input Format
//   The only argument given is an array of strings A.

// Output Format
//   Return the longest common prefix of all strings in A.

// Example Input
// Input 1:
//   A = ["abcdefgh", "aefghijk", "abcefgh"]
// Input 2:
//   A = ["abab", "ab", "abcd"]

// Example Output
// Output 1:
//   "a"
// Output 2:
//   "ab"

// Example Explanation
/*
  Explanation 1:
    The longest common prefix of all strings is "a".

  Explanation 2:
    The longest common prefix of all strings is "ab".
*/


public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        String firstString = A.get(0); //abab
        for(int i=1; i<A.size(); i++){
            String current = A.get(i); //ab
            int j = 0;
            while(j<firstString.length() && j<current.length() && firstString.charAt(j) == current.charAt(j)){
                j++;
            }
            firstString = firstString.substring(0,j);
            if(firstString.isEmpty()){
                return "";
            }
        }
        return firstString;
    }
}
