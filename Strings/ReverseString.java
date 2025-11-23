// Problem Description
//
// You are given a string A of size N.
// Return the string A after reversing the string word by word.
//
// NOTE:
//   • A sequence of non-space characters is considered a word.
//   • The reversed string must NOT contain leading or trailing spaces.
//   • Multiple spaces between words should be reduced to a single space
//     in the final reversed string.
//
// Problem Constraints
//   1 <= N <= 3 * 10^5
//
// Input Format
//   The only argument given is a string A.
//
// Output Format
//   Return the string A after reversing the string word by word.
//
// Example Input
// Input 1:
//   A = "the sky is blue"
// Input 2:
//   A = "this is ib"
//
// Example Output
// Output 1:
//   "blue is sky the"
// Output 2:
//   "ib is this"
//
// Example Explanation
//   Explanation 1:
//     After reversing the words, the string becomes "blue is sky the".
//   Explanation 2:
//     After reversing the words, the string becomes "ib is this".


public class Solution {
    public String solve(String A) {
        String[] st = A.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=st.length-1; i>=0; i--){
            sb.append(st[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
