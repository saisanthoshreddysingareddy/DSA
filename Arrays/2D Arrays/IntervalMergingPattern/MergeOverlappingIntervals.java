// Problem Description
//
// You are given a collection of intervals A in a 2-D array format,
// where each interval is represented by a pair of integers [start, end].
// The intervals are already sorted based on their start values.
//
// Your task is to merge all overlapping intervals and return the resulting
// set of non-overlapping intervals.
//
//
// Problem Constraints
//   1 <= len(A) <= 100000
//   1 <= A[i][0] <= A[i][1] <= 100000
//
//   A is sorted based on the start value (A[i][0]).
//
//
// Input Format
//   The first argument is a list of intervals in a 2-dimensional array.
//
//
// Output Format
//   Return the sorted list of intervals after merging all overlapping intervals.
//
//
// Example Input
// Input 1:
//   [ [1, 3], [2, 6], [8, 10], [15, 18] ]
//
// Input 2:
//   [ [2, 10], [4, 9], [6, 7] ]
//
//
// Example Output
// Output 1:
//   [ [1, 6], [8, 10], [15, 18] ]
//
// Output 2:
//   [ [2, 10] ]
//
//
// Example Explanation
//   Overlapping intervals are merged to produce the final list of
//   non-overlapping, sorted intervals.
