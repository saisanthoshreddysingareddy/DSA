// Problem Description
//
// You are given:
// 1. An integer array A of size N.
// 2. A 2D array B of size Q, where each row B[i] = [L, R]
//    represents a query asking for the sum of elements
//    at EVEN indices in the range [L, R].
//
// For each query, compute:
//     A[L] + A[L+1] + ... + A[R]
// but ONLY include those indices 'k' such that k % 2 == 0.
//
// Return the results in an array of size Q.
//
// ----------------------------------------------------------------------
//
// Problem Constraints
// 1 <= N <= 10^5
// -10^5 <= A[i] <= 10^5
// 1 <= Q <= 10^5
// 0 <= B[i][0], B[i][1] < N
// B[i][0] <= B[i][1]
//
// ----------------------------------------------------------------------
//
// Input Format
//
// First argument: Integer array A
// Second argument: 2D integer array B
//                  where each B[i] = [L, R] represents a range.
//
// ----------------------------------------------------------------------
//
// Output Format
//
// Return an integer array of length Q,
// where each element is the sum of EVEN-indexed elements
// within the range [L, R].
//
// ----------------------------------------------------------------------
//
// Example Input
//
// Input 1:
//   A = [2, 8, 3, 9, 15]
//   B = [
//         [1, 4],
//         [0, 2],
//         [2, 3]
//       ]
//
// Input 2:
//   A = [5, 15, 25, 35, 45]
//   B = [
//         [1, 1],
//         [0, 0]
//       ]
//
// -------------------------------------------------------------


public class Solution {
    public ArrayList<Integer> sumOfEvenIndexedElements(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        //Build prefix sum
        ArrayList<Integer> prefix_arr = new ArrayList<>();
        prefix_arr.add(A.get(0));
        for(int i=1; i<A.size();i++){
            if(i%2==0){
                prefix_arr.add(prefix_arr.get(i-1) + A.get(i));
            }else{
                prefix_arr.add(prefix_arr.get(i-1));
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<B.size();i++){
            int L = B.get(i).get(0);
            int R = B.get(i).get(1);
            int val = 0;
            if(L==0){
                val = prefix_arr.get(R);
            }else{
                val = prefix_arr.get(R) - prefix_arr.get(L-1);
            }
            arr.add(val);
        }
        return arr;

    }
}
