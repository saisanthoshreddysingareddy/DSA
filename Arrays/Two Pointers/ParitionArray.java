// Problem Description
//
// You are given an integer array A and a pivot value P.
// Your task is to rearrange (partition) the array such that:
//
//     → All elements strictly less than P appear on the LEFT side
//     → All elements greater than or equal to P appear on the RIGHT side
//     → The relative order inside left/right sections does not matter
//
// This uses the classic **Two Pointer Partition Technique** 
// from the QuickSort algorithm, where:
//
//     i → moves from left side (looking for elements >= P)
//     j → moves from right side (looking for elements < P)
//     Swap A[i] and A[j] when they are on the wrong sides
//
// The process stops when the pointers cross.
// After partitioning, all small elements will be on the left.
//
// -----------------------------------------------------------------------------
// Problem Constraints
//
//     1 <= A.size() <= 10^5
//     -10^9 <= A[i] <= 10^9
//     -10^9 <= P       <= 10^9
//
// -----------------------------------------------------------------------------
// Input Format
//
// The first argument is an integer array A.
// The second argument is an integer pivot P.
//
// -----------------------------------------------------------------------------
// Output Format
//
// Return the array A after partitioning around pivot P.
// (Partition is done in-place)
//
// -----------------------------------------------------------------------------
// Example Input
//
// Input:
//     A = [7, 2, 9, 4, 3]
//     P = 5
//
// -----------------------------------------------------------------------------
// Example Output
//
// Output:
//     [3, 2, 4, 9, 7]
//     (Any valid partition is accepted, as long as all <5 are on the left)
//
// -----------------------------------------------------------------------------
// Example Explanation
//
// Before partition:
//     [7, 2, 9, 4, 3]
//
// After partition around pivot = 5:
//     Elements < 5 → [3, 2, 4]
//     Elements >= 5 → [9, 7]
//
// One possible valid result is:
//     [3, 2, 4, 9, 7]
//
// -----------------------------------------------------------------------------
// Time Complexity:  O(N)
// Space Complexity: O(1)
// Technique Used:   Two Pointers (Partitioning / QuickSort Partition)
// -----------------------------------------------------------------------------


public class Solution {
    public ArrayList<Integer> partition(ArrayList<Integer> A, int pivot) {
        int i = 0;
        int j = A.size() - 1;
        while (i <= j) {
            while (i <= j && A.get(i) < pivot) {
                i++;
            }
          
            while (i <= j && A.get(j) >= pivot) {
                j--;
            }

            // Swap if both pointers point to incorrect positions
            if (i < j) {
                int temp = A.get(i);
                A.set(i, A.get(j));
                A.set(j, temp);
                i++;
                j--;
            }
        }

        return A;
    }
}
