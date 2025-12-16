/*
Problem Description

Given two integers A and B, and an array of integers C of size N,
where C[i] represents the length of the i-th board.

You have to paint all N boards: C[0], C[1], C[2], ..., C[N-1].

There are A painters available, and each painter takes B units of time
to paint 1 unit length of a board.

Your task is to calculate and return the minimum time required to paint
all boards under the following constraints:

  - A painter can paint only contiguous boards.
  - A board cannot be painted partially by multiple painters.

NOTE:
  1. Two painters cannot share a board.
  2. A painter can only paint contiguous sections of boards.

Return the answer modulo 10000003.

Problem Constraints
  1 <= A <= 1000
  1 <= B <= 10^6
  1 <= N <= 10^5
  1 <= C[i] <= 10^6

Input Format
  The first argument is the integer A.
  The second argument is the integer B.
  The third argument is the integer array C.

Output Format
  Return the minimum time required to paint all boards under the given
  constraints modulo 10000003.

Example Input

Input 1:
  A = 2
  B = 5
  C = [1, 10]

Input 2:
  A = 10
  B = 1
  C = [1, 8, 11, 3]

Example Output

Output 1:
  50

Output 2:
  11

Example Explanation

Explanation 1:
  Possibility 1:
    One painter paints both boards.
    Time taken = (1 + 10) * 5 = 55 units.

  Possibility 2:
    Painter 1 paints board 1.
    Painter 2 paints board 2.
    Time taken = max(5, 50) = 50 units.

  The minimum time required is 50.
  ans = 50 % 10000003

Explanation 2:
  Each board is painted by a different painter.
  Time taken = max(1, 8, 11, 3) = 11 units.
  ans = 11 % 10000003
*/


public class Solution {
    private static final int MOD = 10000003;

    public int paint(int A, int B, ArrayList<Integer> C) {
        int maxValue = maxOfArray(C);
        long start = (long) maxValue * B;
        long sumValue = sumOfArray(C);      
        long end = sumValue * B;

        long ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossible(C, mid, A, B)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) (ans % MOD);
    }

    private boolean isPossible(ArrayList<Integer> arr, long mid, int painters, int B) {
        int no_of_painters = 1;
        long sum = 0L;
        for (int val : arr) {
            long workload = (long) val * B;
            if (workload > mid) return false;      // single board doesn't fit
            if (sum + workload > mid) {
                sum = workload;
                no_of_painters++;
                if (no_of_painters > painters) return false; // early exit
            } else {
                sum += workload;
            }
        }
        return true;
    }

    private int maxOfArray(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int v : arr) if (v > max) max = v;
        return max;
    }

    private long sumOfArray(ArrayList<Integer> arr) {
        long sum = 0L;
        for (int v : arr) sum += v;
        return sum;
    }
}
