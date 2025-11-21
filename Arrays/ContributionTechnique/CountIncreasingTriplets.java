// Problem Description
//
// You are given an array A of N elements.
// Find the number of triplets (i, j, k) such that:
//     i < j < k
// and
//     A[i] < A[j] < A[k]
//
// Problem Constraints
//   1 <= N <= 10^3
//   1 <= A[i] <= 10^9
//
// Input Format
//   The first argument A is an array of integers.
//
// Output Format
//   Return an integer representing the number of valid triplets.
//
// Example Input
// Input 1:
//   A = [1, 2, 4, 3]
//
// Input 2:
//   A = [2, 1, 2, 3]
//
// Example Output
// Output 1:
//   2
//
// Output 2:
//   1
//
// Example Explanation
//   For Input 1:
//     Valid triplets are: [1, 2, 3] and [1, 2, 4].
//     Therefore, the answer is 2.
//
//   For Input 2:
//     The valid triplet is: [1, 2, 3].
//     Therefore, the answer is 1.


public class Solution {
    public int solve(ArrayList<Integer> A) {

        int count =0;
        for(int i=1;i<A.size();i++){
            int left_count = 0 ;
            int right_count =0;
            //left count
            for(int j=0;j<i;j++){
                if(A.get(j)<A.get(i)){
                    left_count++;
                }
            }
            //right count
            for(int k=i+1;k<A.size();k++){
                if(A.get(k)>A.get(i)){
                    right_count++;
                }
            }
            count += left_count * right_count;
        }
        return count;
    }
}
