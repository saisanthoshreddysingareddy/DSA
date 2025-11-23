// Problem Description
//
// You are given two lowercase strings A and B, each of length N.
// Return 1 if they are anagrams of each other, and 0 otherwise.
//
// Note:
//   Two strings A and B are anagrams if A can be formed by rearranging
//   the letters of B.
//
// Problem Constraints
//   1 <= N <= 10^5
//   A and B consist only of lowercase English letters.
//
// Input Format
//   The arguments A and B are two strings.
//
// Output Format
//   Return 1 if A and B are anagrams, else return 0.
//
// Example Input
// Input 1:
//   A = "cat"
//   B = "bat"
//
// Input 2:
//   A = "secure"
//   B = "rescue"
//
// Example Output
// Output 1:
//   0
//
// Output 2:
//   1
//
// Example Explanation
//   For Input 1:
//     The characters of "cat" cannot be rearranged to form "bat".
//     Hence, they are not anagrams.
//
//   For Input 2:
//     The words "secure" and "rescue" contain the same characters
//     in different order. Hence, they are anagrams.


public class Solution {
    public int solve(String A, String B) {
        if(A.length() != B.length()){
            return 0;
        }

        int[] arr = new int[26];
        for(int i=0;i<A.length();i++){
            int val1 = A.charAt(i) - 'a';
            int val2 = B.charAt(i) - 'a';
            arr[val1] = arr[val1]+1;
            arr[val2] = arr[val2]-1;
        }
        for(int i=0;i<26;i++){
            if(arr[i] != 0){
                return 0;
            }
        }
        return 1;
    }
}
