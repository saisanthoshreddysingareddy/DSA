/*
Problem Description

Given a sorted array of integers A, where every element appears exactly twice
except for one element which appears only once, find and return that single
element.

The elements that appear twice are adjacent to each other.

NOTE:
  - The solution is expected to run in O(log N) time.

Problem Constraints
  1 <= |A| <= 100000
  1 <= A[i] <= 10^9

Input Format
  The only argument given is the integer array A.

Output Format
  Return the single element that appears only once.

Example Input

Input 1:
  A = [1, 1, 7]

Input 2:
  A = [2, 3, 3]

Example Output

Output 1:
  7

Output 2:
  2

Example Explanation

Explanation 1:
  The element 7 appears only once.

Explanation 2:
  The element 2 appears only once.
*/


public class Solution {
    public int solve(ArrayList<Integer> A) {
        int start = 0;
        int end = A.size() - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (mid % 2 == 1) {
                mid--;
            }

            if (A.get(mid).equals(A.get(mid + 1))) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }

        return A.get(start);
    }
}
