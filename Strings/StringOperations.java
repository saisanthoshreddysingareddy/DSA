// Problem Description
//
// Akash likes playing with strings. One day he thought of applying the
// following operations on the string in the given order:
//
//   1. Concatenate the string with itself.
//   2. Delete all the uppercase letters.
//   3. Replace each vowel with '#'.
/*
   You are given a string A of size N consisting of lowercase and 
   uppercase alphabets. Return the resultant string after applying
   the above operations.

   NOTE: 'a', 'e', 'i', 'o', 'u' are vowels.
*/

// Problem Constraints
//   1 <= N <= 100000

// Input Format
//   The first argument is a string A of size N.

// Output Format
//   Return the resultant transformed string.

// Example Input
// Input 1:
//   A = "aeiOUz"
// Input 2:
//   A = "AbcaZeoB"

// Example Output
// Output 1:
//   "###z###z"
// Output 2:
//   "bc###bc###"

// Example Explanation
/*
  Explanation 1:
    - Concatenate string with itself → "aeiOUzaeiOUz"
    - Delete all uppercase letters → "aeizaeiz"
    - Replace all vowels with '#' → "###z###z"

  Explanation 2:
    - Concatenate string with itself → "AbcaZeoBAbcaZeoB"
    - Delete all uppercase letters → "bcaeobcaeo"
    - Replace vowels with '#' → "bc###bc###"
*/


public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<A.length();i++){
            char ch = A.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append("#");
            }else if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
        }
        int sb_length = sb.length();
        for(int i=0; i<sb_length;i++){
            sb.append(sb.charAt(i));
        }
        return sb.toString();
    }
}
