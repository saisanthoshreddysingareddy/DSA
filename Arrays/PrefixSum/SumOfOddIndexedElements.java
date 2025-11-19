// Problem Description
//
// You are given:
// 1. An integer array A of size N.
// 2. A 2D array B of size Q, where each row B[i] contains two integers B[i][0] and B[i][1],
//    representing the range [L, R].
//
// For each query in B, calculate the sum of elements in A that are located at ODD indices
// within the inclusive range [L, R]. Return all query results as a list.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// 1 <= N <= 10^5
// -10^5 <= A[i] <= 10^5
// 1 <= Q <= 10^5
// 0 <= B[i][0], B[i][1] < N
// B[i][0] <= B[i][1]
//
// -----------------------------------------------------------------------------
// Input Format
// First argument: integer array A.
// Second argument: 2D array B, where each sub-array B[i] = [L, R] represents one query.
//
// -----------------------------------------------------------------------------
// Output Format
// Return an integer list where each element is the sum of A[k] for all odd indices k
// such that L <= k <= R for each query.
//
// -----------------------------------------------------------------------------
// Example Input
//
// Input 1:
//   A = [2, 8, 3, 9, 15]
//   B = [
//          [1, 4],
//          [0, 2],
//          [2, 3]
//       ]
//
// Input 2:
//   A = [5, 15, 25, 35, 45]
//   B = [
//          [2, 2],
//          [2, 4]
//       ]
//
// -----------------------------------------------------------------------------
// Example Output
//
// Output 1:
//   [17, 8, 9]
//
// Output 2:
//   [0, 35]
//
// -----------------------------------------------------------------------------
// Example Explanation
//
// Explanation 1:
//   Query [1, 4] → Odd indices = 1 and 3 → 8 + 9 = 17
//   Query [0, 2] → Odd index = 1 → 8
//   Query [2, 3] → Odd index = 3 → 9
//   Final result → [17, 8, 9]
//
// Explanation 2:
//   Query [2, 2] → No odd indices → 0
//   Query [2, 4] → Odd index = 3 → 35
//   Final result → [0, 35]


public class Solution {
    public ArrayList<Integer> sumOfOddIndexedElements(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        //PRefix off array 
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        for(int i=1;i<A.size();i++){
            if(i%2==1){
                arr.add(arr.get(i-1) + A.get(i));
            }else{
                arr.add(arr.get(i-1));
            }
        }
        ArrayList<Integer> odd_Arr = new ArrayList<>();
        for(int i=0;i<B.size();i++){
            int L = B.get(i).get(0);
            int R = B.get(i).get(1);
            int ans=0;
            if(L==0){
                ans = arr.get(R);
            }else{
                ans = arr.get(R) - arr.get(L-1);
            }
            odd_Arr.add(ans);
        }
        return odd_Arr;
    }
}
