/*
Problem Description

Imagine a histogram where the bars' heights are given by the array A. 
Each bar has a uniform width of 1 unit. When it rains, water will accumulate 
in the valleys formed between the bars.

Your task is to calculate the total amount of water that can be trapped 
between these bars.

Example:
  For A = [5, 4, 1, 4, 3, 2, 7], the total amount of trapped rainwater is 11.

Problem Constraints
  1 <= |A| <= 10^5
  0 <= A[i] <= 10^5

Input Format
  The first and only argument is the integer array A.

Output Format
  Return an integer representing the total amount of water 
  that can be trapped between the bars.

Example Input

Input 1:
  A = [0, 1, 0, 2]

Input 2:
  A = [1, 2]


Example Output

Output 1:
  1

Output 2:
  0

Example Explanation

Explanation 1:
  1 unit of water is trapped above the 3rd bar.

Explanation 2:
  No water is trapped since the bars never form a valley.
*/


public class Solution {
    public int trap(final List<Integer> A) {
        int n = A.size();
        if (n == 0) return 0;

        int[] left_arr = new int[n];
        left_arr[0] = A.get(0);
        for (int i = 1; i < n; i++) {
            left_arr[i] = Math.max(A.get(i), left_arr[i - 1]);
        }

        int[] right_arr = new int[n];
        right_arr[n - 1] = A.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            right_arr[i] = Math.max(A.get(i), right_arr[i + 1]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int water = Math.min(left_arr[i], right_arr[i]) - A.get(i);
            if (water > 0) {
                sum += water;
            }
        }
      
        return sum;
    }
}
