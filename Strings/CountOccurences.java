// Problem Description
//
// Find the number of occurrences of the substring "bob" in a given
// string A consisting of lowercase English alphabets.

// Problem Constraints
//   1 <= |A| <= 1000

// Input Format
//   The first and only argument contains the string A,
//   consisting of lowercase English alphabets.

// Output Format
//   Return an integer representing the number of times
//   "bob" appears in the string.

// Example Input
// Input 1:
//   "abobc"
// Input 2:
//   "bobob"

// Example Output
// Output 1:
//   1
// Output 2:
//   2

// Example Explanation
/*
  Explanation 1:
    The substring "bob" occurs once — starting at index 1.

  Explanation 2:
    The substring "bob" occurs twice — starting at index 0 and index 2.
*/


public class Solution {
    public int solve(String A) {
        int start = 0;
        int end = 2;
        int count =0;
        while(end<A.length()){
            if(A.substring(start,end+1).equals("bob")){
                count++;
            }
            start++;
            end++;
        }
        return count;
    }
}
