// -----------------------------------------------------------------------------
// Problem Description
// -----------------------------------------------------------------------------
//
// Given an array of integers A, a subarray is said to be good if it satisfies
// **any** of the following criteria:
//
// 1. The length of the subarray is even, and the sum of all elements
//    in the subarray is less than B.
//
// 2. The length of the subarray is odd, and the sum of all elements
//    in the subarray is greater than B.
//
// Your task is to find the count of good subarrays in A.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// -----------------------------------------------------------------------------
// 1 <= len(A) <= 5 x 10^3
// 1 <= A[i] <= 10^3
// 1 <= B <= 10^7
//
// -----------------------------------------------------------------------------
// Input Format
// -----------------------------------------------------------------------------
// The first argument given is the integer array A.
// The second argument given is an integer B.
//
// -----------------------------------------------------------------------------
// Output Format
// -----------------------------------------------------------------------------
// Return the count of good subarrays in A.
//
// -----------------------------------------------------------------------------
// Example Input
// -----------------------------------------------------------------------------
//
// Input 1:
//   A = [1, 2, 3, 4, 5]
//   B = 4
//
// Input 2:
//   A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
//   B = 65
//
// -----------------------------------------------------------------------------
// Example Output
// -----------------------------------------------------------------------------
//
// Output 1:
//   6
//
// Output 2:
//   36
//
// -----------------------------------------------------------------------------
// Example Explanation
// -----------------------------------------------------------------------------
//
// Explanation 1:
//   Even-length good subarrays = {1, 2}
//   Odd-length good subarrays  = {1, 2, 3}, {1, 2, 3, 4, 5},
//                                 {2, 3, 4}, {3, 4, 5}, {5}
//
// Explanation 2:
//   There are 36 good subarrays.
//
// -----------------------------------------------------------------------------


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        //Prefix sum
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(A.get(0));
        for(int i=1;i<A.size();i++){
            arr.add(arr.get(i-1) + A.get(i));
        }
        //Prefix sub array is [1,3,6,10,15]
        int even_length = 0;
        int odd_length = 0;
        for(int i=0; i<A.size(); i++){
            int len = 0;
            int sum =0;
            for(int j=i; j<A.size(); j++){
                if(i==0){
                    sum = arr.get(j);
                }else{
                    sum = arr.get(j) - arr.get(i-1);
                }
                len = j-i+1;
                if(len%2==0 && sum<B){
                    even_length++;
                }
                if(len%2==1 && sum>B){
                    odd_length++;
                }
            }
        }
        return even_length + odd_length;

    }
}
