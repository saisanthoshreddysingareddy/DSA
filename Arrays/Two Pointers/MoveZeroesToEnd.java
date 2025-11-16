// Problem Description
//
// Given an integer array A, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note: You must do this in-place without making a copy of the array.

// Problem Constraints
//   1 <= |A| <= 10^5
//
// Input Format
//   First argument is an array of integers A.
//
// Output Format
//   Return an array of integers which satisfies the above property.
//
// Example Input
// Input 1:   A = [0, 1, 0, 3, 12]
// Input 2:   A = [0]

// Example Output
// Output 1:   [1, 3, 12, 0, 0]
// Output 2:   [0]

// Example Explanation
//   Explanation 1: Shift all zeroes to the end.
//   Explanation 2: Only one zero, so no shifting needed.


public class Solution {
    public int[] solve(int[] A) {
        int writeIndex = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]!=0){
                A[writeIndex] = A[i];
                writeIndex++;
            }
        }
      // Add remaining zeroes
        for(int i = writeIndex; i<A.length;i++){
            A[i]=0;
        }
        return A;
    }
}
