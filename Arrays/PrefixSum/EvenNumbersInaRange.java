// Problem Description
//
// You are given an array A of length N and Q queries given by the 2D array B of size Q × 2.
// Each query contains two integers B[i][0] and B[i][1].
// For every query, your task is to find the count of even numbers in the range 
// from A[B[i][0]] to A[B[i][1]] (inclusive).
//
// Problem Constraints
// 1 <= N <= 10^5
// 1 <= Q <= 10^5
// 1 <= A[i] <= 10^9
// 0 <= B[i][0] <= B[i][1] < N
//
// Input Format
// First argument A is an array of integers.
// Second argument B is a 2D array of integers containing the queries.
//
// Output Format
// Return an array of integers where each value corresponds to the 
// count of even numbers for that query range.
//
// Example Input
// Input 1:
//   A = [1, 2, 3, 4, 5]
//   B = [
//          [0, 2],
//          [2, 4],
//          [1, 4]
//       ]
//
// Input 2:
//   A = [2, 1, 8, 3, 9, 6]
//   B = [
//          [0, 3],
//          [3, 5],
//          [1, 3],
//          [2, 4]
//       ]
//
// Example Output
// Output 1:
//   [1, 1, 2]
//
// Output 2:
//   [2, 1, 1, 1]
//
// Example Explanation
// For Input 1:
//   Query 1 → [1, 2, 3] → contains 1 even number.
//   Query 2 → [3, 4, 5] → contains 1 even number.
//   Query 3 → [2, 3, 4, 5] → contains 2 even numbers.
//
// For Input 2:
//   Query 1 → [2, 1, 8, 3] → 2 evens.
//   Query 2 → [3, 9, 6] → 1 even.
//   Query 3 → [1, 8, 3] → 1 even.
//   Query 4 → [8, 3, 9] → 1 even.


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        //Build count prefix of evens
        ArrayList<Integer> count_prefix = new ArrayList<>();
        if(A.get(0)%2==0){
            count_prefix.add(1);
        }else{
            count_prefix.add(0);
        }
        for(int i=1;i<A.size();i++){
            if(A.get(i)%2==0){
                count_prefix.add(count_prefix.get(i-1)+1);
            }else{
                count_prefix.add(count_prefix.get(i-1));
            }
        }
        // [1 1 2 2 2 3]
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<B.size();i++){
            int L = B.get(i).get(0);
            int R = B.get(i).get(1);
            int count = 0;
            if(L==0){
                count = count_prefix.get(R);
            }else{
                count = count_prefix.get(R) - count_prefix.get(L-1);
            }
            arr.add(count);
        }
        return arr;
    }
}
