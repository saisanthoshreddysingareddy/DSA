// Problem Description
//
// You are given a n x n 2D matrix A representing an image.
// Rotate the image by 90 degrees (clockwise).
// You must perform the rotation in place.
//
// Note:
//   If you use an additional array, you will receive only partial score.
//
// Problem Constraints
//   1 <= n <= 1000
//
// Input Format
//   The first argument is a 2D matrix A of integers.
//
// Output Format
//   Return the 2D rotated matrix.
//
// Example Input
// Input 1:
//   [
//      [1, 2],
//      [3, 4]
//   ]
// Input 2:
//   [
//      [1, 2, 3],
//      [4, 5, 6],
//      [7, 8, 9]
//   ]
//
// Example Output
// Output 1:
//   [
//      [3, 1],
//      [4, 2]
//   ]
// Output 2:
//   [
//      [7, 4, 1],
//      [8, 5, 2],
//      [9, 6, 3]
//   ]
//
// Example Explanation
//   Explanation 1:
//     After rotating the matrix by 90 degrees:
//     1 → 2, 2 → 4
//     4 → 3, 3 → 1
//
//   Explanation 2:
//     After rotating the matrix by 90 degrees:
//     1 → 3, 3 → 9
//     2 → 6, 6 → 8
//     9 → 7, 7 → 1
//     8 → 4, 4 → 2



public class Solution {
    public void solve(ArrayList<ArrayList<Integer>> A) {
        //Find Transpose
        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }

        // Reverse row wise
        for(int i=0;i<A.size();i++){
            int start = 0;
            int end = A.size()-1;
            while(start<end){
                int temp1 = A.get(i).get(end);
                A.get(i).set(end, A.get(i).get(start));
                A.get(i).set(start, temp1);
                start++;
                end--;
            }
        }

    }
}
