// Problem Description
//
// You are given a sorted integer array A.
// Your task is to remove all duplicate elements in-place and return 
// the count of unique elements.
//
// After removal, the first "k" elements of array A (where k is the 
// number of unique elements) should contain all distinct values 
// in the same sorted order.
//
// This is a classic two-pointer problem where:
//     → One pointer (j) scans through the array
//     → Another pointer (i) tracks the position of the next unique value
//
// -----------------------------------------------------------------------------
// Problem Constraints
//
//     1 <= A.size() <= 10^5
//     -10^9 <= A[i] <= 10^9
//     (The array is guaranteed to be sorted in non-decreasing order)
//
// -----------------------------------------------------------------------------
// Input Format
//
// The only argument given is an integer array A.
//
// -----------------------------------------------------------------------------
// Output Format
//
// Return an integer representing the number of unique elements in the array.
//
// -----------------------------------------------------------------------------
// Example Input
//
// Input 1:
//     A = [1, 1, 2, 2, 2, 3, 3, 4]
//
// Input 2:
//     A = [5, 5, 5, 5]
//
// -----------------------------------------------------------------------------
// Example Output
//
// Output 1:
//     4
//
// Output 2:
//     1
//
// -----------------------------------------------------------------------------
// Example Explanation
//
// Explanation 1:
//     Unique elements are [1, 2, 3, 4]. Count = 4.
//     This is done by maintaining two pointers:
//         i → last unique element position
//         j → scanning pointer
//
// Explanation 2:
//     Only one unique element exists → 5.
//     Count = 1.
//
// -----------------------------------------------------------------------------
// Time Complexity:  O(N)
// Space Complexity: O(1)
// Technique Used:   Two Pointers (slow + fast)
// -----------------------------------------------------------------------------


public class Solution {
    public int removeDuplicates(ArrayList<Integer> A) {
        if (A.size() == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < A.size(); j++) {
            if (!A.get(j).equals(A.get(i))) {
                i++;
                A.set(i, A.get(j));
            }
        }
        return i + 1;
    }
}
