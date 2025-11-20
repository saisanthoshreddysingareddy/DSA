// -----------------------------------------------------------------------------
// Problem Description
// -----------------------------------------------------------------------------
//
// You are given an integer array A.  
// Your task is to determine whether there exists an integer **p** in the array
// such that:
//
//        → The number of integers strictly greater than p
//               == p
//
// If such an integer exists, return **1**, otherwise return **-1**.
//
// The array can contain positive, negative, and duplicate values.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// -----------------------------------------------------------------------------
// 1 <= |A| <= 2 * 10^5
// -10^8 <= A[i] <= 10^8
//
// -----------------------------------------------------------------------------
// Input Format
// -----------------------------------------------------------------------------
// The first and only argument is an integer array A.
//
// -----------------------------------------------------------------------------
// Output Format
// -----------------------------------------------------------------------------
// Return **1** if any such integer p exists, else return **-1**.
//
// -----------------------------------------------------------------------------
// Example Input
// -----------------------------------------------------------------------------
//
// Input 1:
//   A = [3, 2, 1, 3]
//
// Input 2:
//   A = [1, 1, 3, 3]
//
// -----------------------------------------------------------------------------
// Example Output
// -----------------------------------------------------------------------------
//
// Output 1:
//   1
//
// Output 2:
//   -1
//
// -----------------------------------------------------------------------------
// Example Explanation
// -----------------------------------------------------------------------------
//
// Explanation 1:
//   For p = 2:
//       Numbers greater than 2 are: {3, 3} → count = 2  
//       Since count == p, p = 2 is a noble integer.
//   Therefore, output = 1.
//
// Explanation 2:
//   No integer satisfies the property:
//       Number of integers > p  != p
//   Therefore, output = -1.
//
// -----------------------------------------------------------------------------


public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        // 0 1 2 3
        // 1 2 3 3
        int count = 0;
        int ans = -1;
        for(int i=0; i<A.size(); i++){
            if(i<A.size()-1 && A.get(i) == A.get(i+1)){
               continue;
            }
            int greater = A.size()-i-1;
            if(greater == A.get(i)){
                return 1;
            }
        }   
        return -1;
    }
}
