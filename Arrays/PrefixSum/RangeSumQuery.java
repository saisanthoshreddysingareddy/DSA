// Problem Description
//
// You are given an integer array A of length N.
// You are also given a 2D integer array B with dimensions M x 2,
// where each row denotes a [L, R] query.
//
// For each query, you have to find the sum of all elements
// from L to R indices in A (0-indexed).
//
// More formally, compute:
//   A[L] + A[L + 1] + A[L + 2] + ... + A[R]
//
// ----------------------------------------------------------------------
//
// Problem Constraints
// 1 <= N, M <= 10^5
// 1 <= A[i] <= 10^9
// 0 <= L <= R < N
//
// ----------------------------------------------------------------------
//
// Input Format
// The first argument is the integer array A.
// The second argument is the 2D integer array B.
//
// Output Format
// Return an integer array of length M where the ith element
// is the sum for the ith query in B.
//
// ----------------------------------------------------------------------
//
// Example Input
//
// Input 1:
//   A = [1, 2, 3, 4, 5]
//   B = [[0, 3], [1, 2]]
//
// Input 2:
//   A = [2, 2, 2]
//   B = [[0, 0], [1, 2]]
//
// ----------------------------------------------------------------------
//
// Example Output
//
// Output 1:
//   [10, 5]
//
// Output 2:
//   [2, 4]
//
// ----------------------------------------------------------------------
//
// Example Explanation
//
// Explanation 1:
//   Sum of A[0 ... 3] = 1 + 2 + 3 + 4 = 10
//   Sum of A[1 ... 2] = 2 + 3 = 5
//
// Explanation 2:
//   Sum


public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
        // Build prefix array
        long[] prefix_array = new long[A.length];
        for(int i=0;i<A.length;i++){
            if(i==0){
                prefix_array[i] = A[i];
            }else{
                prefix_array[i] = prefix_array[i-1]+A[i];
            }
        }

        long[] arr = new long[B.length];
        for(int i=0;i<B.length;i++){
            int L = B[i][0];
            int R = B[i][1];
            long val = 0;

            if(L==0){
                val = prefix_array[R];
                arr[i] = val;
            }else{
                val = prefix_array[R] - prefix_array[L-1];
                arr[i] = val;
            }
        }
        return arr;
    }
}
