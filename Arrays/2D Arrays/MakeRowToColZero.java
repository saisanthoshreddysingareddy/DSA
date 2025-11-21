// Problem Description
//
// You are given a 2D integer matrix A.
// If any element A[i][j] is 0, then the entire ith row and jth column
// must be converted to 0.
//
// Your task is to update the matrix accordingly and return the final matrix.
//
// Problem Constraints
//   1 <= A.size() <= 10^3
//   1 <= A[i].size() <= 10^3
//   0 <= A[i][j] <= 10^3
//
// Input Format
//   The first argument is a 2D integer matrix A.
//
// Output Format
//   Return the updated 2D matrix after applying the rules.
//
// Example Input
// Input 1:
//   A = [
//     [1, 2, 3, 4],
//     [5, 6, 7, 0],
//     [9, 2, 0, 4]
//   ]
//
// Example Output
// Output 1:
//   [
//     [1, 2, 0, 0],
//     [0, 0, 0, 0],
//     [0, 0, 0, 0]
//   ]
//
// Example Explanation
//   In the input matrix:
//     A[1][3] = 0  → make entire row 1 and column 3 zero
//     A[2][2] = 0  → make entire row 2 and column 2 zero
//
//   After applying both rules, the final matrix becomes:
//     [1, 2, 0, 0]
//     [0, 0, 0, 0]
//     [0, 0, 0, 0]



public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        //Make the row wise 0's to -1
        for(int i=0;i<A.size();i++){
            boolean isPresent = false;
            for(int j=0; j<A.get(0).size();j++){
                if(A.get(i).get(j) == 0){
                    isPresent = true;
                }
            }
            if(isPresent){
                for(int k=0;k<A.get(0).size(); k++){
                    if(A.get(i).get(k)!=0){
                        A.get(i).set(k,-1);
                    }
                }
            }
        }

        //Make the col wise 0's to -1
        for(int i=0;i<A.get(0).size();i++){
            boolean isTrue = false;
            for(int j=0;j<A.size();j++){
                if(A.get(j).get(i) == 0){
                    isTrue = true;
                }
            }
            if(isTrue){
                for(int k=0; k<A.size();k++){
                    if(A.get(k).get(i)!=0){
                        A.get(k).set(i,-1);
                    }
                }
            }
        }

        //Replace -1's to 0
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).size();j++){
                if(A.get(i).get(j) == -1){
                    A.get(i).set(j,0);
                }
            }
        }
        return A;
    }
}
