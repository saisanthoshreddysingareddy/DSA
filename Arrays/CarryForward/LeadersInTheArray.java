// Problem Description
//
// Given an integer array A containing N distinct integers, 
// you must find all the *leaders* in the array.
// An element is a leader if it is strictly greater than all elements to its right.
//
// NOTE:
// The rightmost element of the array is always a leader.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// 1 <= N <= 10^5
// 1 <= A[i] <= 10^8
//
// -----------------------------------------------------------------------------
// Input Format
// A single input argument: an integer array A.
//
// -----------------------------------------------------------------------------
// Output Format
// Return an integer array containing all the leaders of A.
// The order of leaders in the output does not matter.
//
// -----------------------------------------------------------------------------
// Example Input
//
// Input 1:
//   A = [16, 17, 4, 3, 5, 2]
//
// Input 2:
//   A = [5, 4]
//
// -----------------------------------------------------------------------------
// Example Output
//
// Output 1:
//   [17, 2, 5]
//
// Output 2:
//   [5, 4]
//
// -----------------------------------------------------------------------------
// Example Explanation
//
// Explanation 1:
//   • 17 is greater than all elements to its right.
//   • 2 is greater than all elements to its right.
//   • 5 is greater than all elements to its right.
//   Therefore, valid outputs include [17, 2, 5], [5, 2, 17], etc.
//
// Explanation 2:
//   • 5 is greater than all elements to its right.
//   • 4 is greater than all elements to its right.
//   Any ordering like [5, 4] or [4, 5] is acceptable.


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();
        int currentMax = 0;
        for(int i=A.size()-1; i>=0; i--){
            if(A.get(i)>currentMax){
                currentMax = A.get(i);
                arr.add(A.get(i));
            }
        }
        return arr;
    }
}
