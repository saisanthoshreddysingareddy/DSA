/*
Problem Description

You are given two integer arrays:
  - A of size N
  - B of size M

Your task is to find all the common elements present in both arrays.

Important Notes:
  - Each element in the result should appear as many times as it appears
    in both arrays (i.e., minimum frequency in A and B).
  - The result can be returned in any order.

Problem Constraints
  1 <= N, M <= 10^5
  1 <= A[i] <= 10^9

Input Format
  The first argument is an integer array A.
  The second argument is an integer array B.

Output Format
  Return an integer array containing all elements that appear in both arrays.

Example Input

Input 1:
  A = [1, 2, 2, 1]
  B = [2, 3, 1, 2]

Input 2:
  A = [2, 1, 4, 10]
  B = [3, 6, 2, 10, 10]

Example Output

Output 1:
  [1, 2, 2]

Output 2:
  [2, 10]

Example Explanation

Explanation 1:
  The common elements between A and B are (1, 2, 2).
  Note that 2 appears twice in both arrays, so it appears twice in the output.

Explanation 2:
  The common elements between A and B are (2, 10).
*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> map_A = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            if(map_A.containsKey(A.get(i))){
                int freq = map_A.get(A.get(i));
                map_A.put(A.get(i), freq+1);
            }else{
                map_A.put(A.get(i), 1);
            }
        }

        HashMap<Integer, Integer> map_B = new HashMap<>();
        for(int i=0; i<B.size(); i++){
            if(map_B.containsKey(B.get(i))){
                int freq1 = map_B.get(B.get(i));
                map_B.put(B.get(i), freq1+1);
            }else{
                map_B.put(B.get(i),1);
            }
        }

        // map_A = [1: 2, 2: 2]
        // map_B = [1: 1, 2: 2, 3: 1]
        ArrayList<Integer> arr = new ArrayList<>();
        for(int key : map_A.keySet()){
            if(map_B.containsKey(key)){
                int count = Math.min(map_A.get(key), map_B.get(key));
                for(int i=0;i<count;i++){
                    arr.add(key);
                }
            }
        }
        return arr;
    }
}
