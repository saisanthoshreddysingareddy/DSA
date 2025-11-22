// Problem Description
//
// You are given a character array A.
//
// You must determine whether ALL characters in the array are
// alphanumeric — i.e., they belong to:
//   - 'a' to 'z'
//   - 'A' to 'Z'
//   - '0' to '9'
//
// Return 1 if all characters are alphanumeric,
// otherwise return 0.

// Problem Constraints
//   1 <= |A| <= 100000

// Input Format
//   The only argument is a character array A.

// Output Format
//   Return 1 if all characters in A are alphanumeric,
//   otherwise return 0.

// Example Input
// Input 1:
//   A = ['S','c','a','l','e','r','A','c','a','d','e','m','y','2','0','2','0']
//
// Input 2:
//   A = ['S','c','a','l','e','r','#','2','0','2','0']

// Example Output
// Output 1:
//   1
// Output 2:
//   0

// Example Explanation
/*
  Explanation 1:
    All characters are alphanumeric.

  Explanation 2:
    Character '#' is not alphanumeric,
    so the answer is 0.
*/



public class Solution {
    public int solve(ArrayList<Character> A) {
        for(int i=0;i<A.size();i++){
            char ch = A.get(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>=48 &&ch<=57)){
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
