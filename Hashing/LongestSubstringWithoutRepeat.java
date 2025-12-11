/*
Problem Description

Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined as
the length of the longest substring that contains no repeating characters.

Your task is to return an integer representing this "GOOD"ness value.

Note:
  - The solution must run in O(N) time, where N is the length of the string.

Problem Constraints
  1 <= size(A) <= 10^6
  A consists of lowercase letters, uppercase letters, and digits.

Input Format
  The only argument is the string A.

Output Format
  Return an integer representing the length of the longest substring
  of A that contains no repeating characters.

Example Input

Input 1:
  A = "abcabcbb"

Input 2:
  A = "AaaA"

Example Output

Output 1:
  3

Output 2:
  2

Example Explanation

Explanation 1:
  The substring "abc" is the longest substring without repeating characters.
  Hence, the GOODness value is 3.

Explanation 2:
  The substrings "Aa" or "aA" are the longest substrings without repeating characters.
  Hence, the GOODness value is 2.
*/

public class Solution {
    public int lengthOfLongestSubstring(String A) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while(right<A.length()){
            if(set.contains(A.charAt(right))){
                set.remove(A.charAt(left));
                left++;
            }else{
                int len = right-left+1;
                maxLen = Math.max(len, maxLen);
                set.add(A.charAt(right));
                right++;
            }
        }
        return maxLen;
    }
}

