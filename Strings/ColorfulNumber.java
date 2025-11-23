// Problem Description
//
// Given a number A, find if it is a COLORFUL number or not.
//
// If number A is a COLORFUL number return 1, else return 0.
//
// What is a COLORFUL Number:
//   A number can be broken into different consecutive sequences of digits.
//   Example: For 3245 → sequences are:
//     3, 2, 4, 5, 32, 24, 45, 324, 245, 3245
//   The number is COLORFUL if the product of digits of every sequence is unique.
//
// Problem Constraints
//   1 <= A <= 2 * 10^9
//
// Input Format
//   The first and only argument is an integer A.
//
// Output Format
//   Return 1 if integer A is COLORFUL, else return 0.
//
// Example Input
// Input 1:
//   A = 23
//
// Input 2:
//   A = 236
//
// Example Output
// Output 1:
//   1
//
// Output 2:
//   0
//
// Example Explanation
//   Explanation 1:
//     Possible subsequences: [2, 3, 23]
//       2  -> 2
//       3  -> 3
//       23 -> 6 (product of digits)
//     Since all products are different → COLORFUL.
//
//   Explanation 2:
//     Possible subsequences: [2, 3, 6, 23, 36, 236]
//       2   -> 2
//       3   -> 3
//       6   -> 6
//       23  -> 6
//       36  -> 18
//       236 -> 36
//     Product of subsequence 23 equals product of subsequence 6 → NOT COLORFUL.


public class Solution {
    public int colorful(int A) {
        String st = A + "";
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < st.length(); i++){
            int product = 1;

            for(int j = i; j < st.length(); j++){
                int val = Character.getNumericValue(st.charAt(j));
                product = product * val;

                if(set.contains(product)){
                    return 0;
                } else {
                    set.add(product);
                }
            }
        }
        return 1;
    }
}
