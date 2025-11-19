// Problem Description
//
// You are given a string A consisting of uppercase English letters.
//
// You need to find the number of pairs (i, j) such that:
//     A[i] = 'A'
//     A[j] = 'G'
//     and i < j
//
// In other words, count how many times the subsequence "AG" appears.
//
// ----------------------------------------------------------------------
//
// Problem Constraints
// 1 <= length(A) <= 10^5
//
// ----------------------------------------------------------------------
//
// Input Format
// First and only argument is a string A.
//
// ----------------------------------------------------------------------
//
// Output Format
// Return a long integer denoting the answer.
//
// ----------------------------------------------------------------------
//
// Example Input
//
// Input 1:
//   A = "ABCGAG"
//
// Input 2:
//   A = "GAB"
//
// ----------------------------------------------------------------------
//
// Example Output
//
// Output 1:
//   3
//
// Output 2:
//   0
//
// ----------------------------------------------------------------------
//
// Example Explanation
//
// Explanation 1:
//   The subsequence "AG" appears 3 times.
//   Valid pairs are:
//     (0, 3), (0, 5), and (4, 5)
//
// Explanation 2:
//   No valid "AG" subsequence exists in the string.
//   Hence, the answer is 0.
//


public class Solution {
    public Long solve(String A) {
        long g_count = 0;
        long pair_count = 0;
        for(int i=A.length()-1;i>=0;i--){
            if(A.charAt(i) == 'G'){
                g_count++;
            }else if(A.charAt(i) == 'A'){
                pair_count += g_count;
            }
        }
        return pair_count;

    }
}
