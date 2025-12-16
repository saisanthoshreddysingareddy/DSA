/*
Problem Description

Given an array of integers A of size N and an integer B.

In a single operation, any one element of the array can be increased by 1.
You are allowed to perform at most B such operations.

Your task is to find the number with the maximum number of occurrences after
performing at most B operations.

Return an array C of size 2 where:
  - C[0] represents the maximum number of occurrences
  - C[1] represents the number having the maximum occurrence

If there are multiple such numbers, return the minimum one.

Problem Constraints
  1 <= N <= 10^5
  -10^9 <= A[i] <= 10^9
  0 <= B <= 10^9

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return an array C of size 2, where:
    - C[0] is the number of occurrences
    - C[1] is the number with the maximum occurrence

Example Input

Input 1:
  A = [3, 1, 2, 2, 1]
  B = 3

Input 2:
  A = [5, 5, 5]
  B = 3

Example Output

Output 1:
  [4, 2]

Output 2:
  [3, 5]

Example Explanation

Explanation 1:
  Apply operations on A[2] and A[4]:
    A = [3, 2, 2, 2, 2]

  Maximum occurrence = 4
  Minimum value with maximum occurrence = 2

Explanation 2:
  A = [5, 5, 5]

  Maximum occurrence = 3
  Minimum value with maximum occurrence = 5
*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n = A.size();

        // prefix sum for quick window sum calculation
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + A.get(i);
        }

        int low = 1, high = n;
        int bestFreq = 1, bestNum = A.get(0);

        while (low <= high) {
            int mid = (low + high) / 2;
            int num = isPossible(A, prefix, B, mid);
            if (num != -1) {
                bestFreq = mid;
                bestNum = num;
                low = mid + 1;   // try for bigger frequency
            } else {
                high = mid - 1;  // reduce frequency
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(bestFreq);
        result.add(bestNum);
        return result;
        
    }
     private static int isPossible(ArrayList<Integer> A, long[] prefix, int B, int k) {
        int n = A.size();
        for (int i = k - 1; i < n; i++) {
            long sum = prefix[i + 1] - prefix[i + 1 - k];
            long target = (long) A.get(i) * k;
            long cost = target - sum;
            if (cost <= B) {
                return A.get(i);  // we can make k occurrences of A[i]
            }
        }
        return -1;
    }
}
