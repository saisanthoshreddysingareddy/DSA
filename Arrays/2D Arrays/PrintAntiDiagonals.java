// Problem Description
//
// Given a N x N square matrix A, return an array containing all of its
// anti-diagonals. See the example for more details.
//
// The anti-diagonal of a matrix consists of elements A[i][j] such that
// i + j = constant.
//
// You must return a 2D array of size (2*N - 1) x N, where unused positions
// should be filled with 0.
//
// Problem Constraints
//   1 <= N <= 1000
//   1 <= A[i][j] <= 1e9
//
// Input Format
//   The first and only argument is a 2D integer matrix A (N x N).
//
// Output Format
//   Return a 2D integer array of size (2*N - 1) x N,
//   where each row represents one anti-diagonal.
//   All empty cells must be filled with 0.
//
// Example Input
// Input 1:
//   A = [
//     [1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]
//   ]
//
// Input 2:
//   A = [
//     [1, 2],
//     [3, 4]
//   ]
//
// Example Output
// Output 1:
//   [
//     [1, 0, 0],
//     [2, 4, 0],
//     [3, 5, 7],
//     [6, 8, 0],
//     [9, 0, 0]
//   ]
//
// Output 2:
//   [
//     [1, 0],
//     [2, 3],
//     [4, 0]
//   ]
//
// Example Explanation
//   For Input 1:
//     Anti-diagonals are:
//       [1]
//       [2, 4]
//       [3, 5, 7]
//       [6, 8]
//       [9]
//     Remaining positions padded with 0.
//
//   For Input 2:
//     Anti-diagonals are:
//       [1]
//       [2, 3]
//       [4]
//     Remaining positions padded with 0.


public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> final_array = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            ArrayList<Integer> getRowStartDiagonals = antiDiagonals(0, i, A);
            while(getRowStartDiagonals.size() < A.size()){
                getRowStartDiagonals.add(0);
            }
            final_array.add(getRowStartDiagonals);
        }

        for(int i=1;i<A.size();i++){
            ArrayList<Integer> getColStartDiaganols = antiDiagonals(i, A.size()-1, A);
            while (getColStartDiaganols.size() < A.size()){
                getColStartDiaganols.add(0);
            }
            final_array.add(getColStartDiaganols);
        }
        return final_array;
    }
    public ArrayList<Integer> antiDiagonals(int r, int c, ArrayList<ArrayList<Integer>> A){
        int row = r;
        int col = c;
        ArrayList<Integer> arr = new ArrayList<>();
        while(row<A.size() && col>=0){
            arr.add(A.get(row).get(col));
            row++;
            col--;
        }
        return arr;
    }
}
