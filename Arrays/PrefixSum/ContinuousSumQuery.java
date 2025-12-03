// Problem Description
//
// There are A beggars sitting in a row outside a temple. Each beggar initially
// has an empty pot. When the devotees come to the temple, they donate some
// amount of coins to these beggars. Each devotee gives a fixed amount of coin
// (according to their faith and ability) to some K beggars sitting next to 
// each other.
//
// Given the amount P donated by each devotee to the beggars ranging from 
// index L to R, where 1 <= L <= R <= A, find the final amount of money in 
// each beggar's pot at the end of the day, assuming they don't receive coins 
// by any other means.
//
// For the ith devotee:
//   B[i][0] = L
//   B[i][1] = R
//   B[i][2] = P
// These are provided in the 2D array B.
//
//
// Problem Constraints
//   1 <= A <= 2 * 10^5
//   1 <= L <= R <= A
//   1 <= P <= 10^3
//   0 <= len(B) <= 10^5
//
//
// Input Format
//   The first argument is a single integer A.
//   The second argument is a 2D integer array B.
//
//
// Output Format
//   Return an array (0-based indexing) that stores the total number of coins 
//   in each beggar's pot.
//
//
// Example Input
// Input 1:
//   A = 5
//   B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
//
//
// Example Output
// Output 1:
//   10 55 45 25 25
//
//
// Example Explanation
//   Explanation 1:
//     First devotee donated 10 coins to beggars from index 1 to 2.
//     After first devotee:  [10, 10, 0, 0, 0]
//
//     Second devotee donated 20 coins to beggars from index 2 to 3.
//     After second devotee: [10, 30, 20, 0, 0]
//
//     Third devotee donated 25 coins to beggars from index 2 to 5.
//     After third devotee:  [10, 55, 45, 25, 25]


public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] arr = new int[A];
        for(int i=0;i<B.length;i++){
            int start = B[i][0]-1;
            int end = B[i][1]-1;
            int value = B[i][2];
            arr[start] = arr[start]+value;
            if(end+1<A){
                arr[end+1] = arr[end+1]-value;
            }
        }

        //Build prefix sum
        int[] pf_arr = new int[A];
        pf_arr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pf_arr[i] = pf_arr[i-1]+arr[i];
        }

        return pf_arr;
    }
}
