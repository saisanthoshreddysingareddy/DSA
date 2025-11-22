// Problem Description
//
// You are given a character string A having length N, consisting of
// only lowercase and uppercase Latin letters.
//
// You have to toggle the case of each character in string A.
//   - 'A' becomes 'a'
//   - 'e' becomes 'E'
//   - and so on...

// Problem Constraints
//   1 <= N <= 100000
//   A[i] ∈ ['a' - 'z', 'A' - 'Z']

// Input Format
//   The first and only argument is a character string A.

// Output Format
//   Return a character string after toggling the case of each character.

// Example Input
// Input 1:
//   A = "Hello"
// Input 2:
//   A = "tHiSiSaStRiNg"

// Example Output
// Output 1:
//   "hELLO"
// Output 2:
//   "ThIsIsAsTrInG"

// Example Explanation
/*
  Explanation 1:
    'H' → 'h'
    'e' → 'E'
    'l' → 'L'
    'l' → 'L'
    'o' → 'O'

  Explanation 2:
    "tHiSiSaStRiNg" becomes "ThIsIsAsTrInG"
*/


public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch>='A' && ch<='Z'){
                sb.append((char)(ch+32));
            }else if(ch>='a' && ch<='z'){
                sb.append((char)(ch-32));
            }
        }
        return sb.toString();
    }
}
