/*
Problem Description

Given an array of integers A, find and return a local minimum element in the array.

An array element is considered a local minimum if it is not greater than its neighbors.
For corner elements, only one neighbor needs to be considered.

NOTE:
  - It is guaranteed that the array contains at least one local minimum.
  - The array may contain duplicate elements.
  - The solution is expected to run in O(log N) time.

Problem Constraints
  1 <= |A| <= 100000
  1 <= A[i] <= 10^9

Input Format
  The only argument given is the integer array A.

Output Format
  Return any one local minimum element.

Example Input

Input 1:
  A = [5, 4, 3, 6, 7]

Input 2:
  A = [9, 6, 7, 8]

Example Output

Output 1:
  3

Output 2:
  6

Example Explanation

Explanation 1:
  3 is smaller than both its neighbors (4 and 6), so it is a local minimum.

Explanation 2:
  6 is smaller than both its neighbors (9 and 7), so it is a local minimum.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int start = 0;
        int end = A.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 || A.get(mid) <= A.get(mid - 1)) &&
                (mid == A.size() - 1 || A.get(mid) <= A.get(mid + 1))) {
                return A.get(mid);
            }
            else if (mid > 0 && A.get(mid) > A.get(mid - 1)) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
