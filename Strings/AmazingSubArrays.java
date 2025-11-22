// Problem Description
//
// You are given a string S, and you have to find all the amazing substrings
// of S.
//
// An amazing substring is one that starts with a vowel.
// Vowels considered: a, e, i, o, u, A, E, I, O, U.

// Input Format
//   The only argument given is the string S.

// Output Format
//   Return a single integer X % 10003,
//   where X is the number of amazing substrings of S.

// Constraints
//   1 <= length(S) <= 1e6
//   S may contain special characters.

// Example Input
// Input:
//   S = "ABEC"

// Example Output
// Output:
//   6

// Example Explanation
/*
  Amazing substrings of "ABEC" are:
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC

  Total = 6
  6 % 10003 = 6
*/



public class Solution {
    public int solve(String A) {
        int count = 0;
        int mod = 10003;
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(findVowel(ch)){
                count = (count + (A.length()-i))%mod;
            }
        }
        return count;
    }
    public boolean findVowel(char ch){
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
