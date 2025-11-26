// Problem Description
//
// You are given an integer array A of size N.
// Your task is to count how many elements in the array
// have at least one other element that is strictly greater than them.
//
// In simple terms:
//     → Count all elements that are NOT equal to the maximum element in the array.
//
// -----------------------------------------------------------------------------
// Problem Constraints
//
//     1 <= N <= 10^3
//     1 <= A[i] <= 10^9
//
// -----------------------------------------------------------------------------
// Input Format
//
// The only argument is an integer array A.
//
// -----------------------------------------------------------------------------
// Output Format
//
// Return an integer representing the count of elements that have
// at least one greater element in the array.
//
// -----------------------------------------------------------------------------
// Example Input
//
// Input 1:
//     A = [3, 1, 2]
//
// Input 2:
//     A = [5, 5, 3]
//
// -----------------------------------------------------------------------------
// Example Output
//
// Output 1:
//     2
//
// Output 2:
//     1
//
// -----------------------------------------------------------------------------
// Example Explanation
//
// Explanation 1:
//     The elements 1 and 2 have at least one greater element (which is 3).
//     Therefore, the answer is 2.
//
// Explanation 2:
//     The element 3 has at least one greater element (which is 5).
//     Elements 5 and 5 are the maximum and do not count.
//     Therefore, the answer is 1.
//


// TC  - O(N)
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE; 
        for(int i=0;i<A.size();i++){
            if(A.get(i) > max){
                max = A.get(i);
            }
        }
        int count = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<max){
                count++;
            }
        }
        return count;
    }
}



// TC - O(NlogN)
public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A); 
        int count =0;
        int max = A.get(A.size()-1);
        for(int i=0; i<A.size()-1; i++){
            if(A.get(i) < max){
                count++;
            }
        }
        return count;
    }
}
