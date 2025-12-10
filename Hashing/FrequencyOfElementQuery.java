/*
Problem Description

SCALER organizes a series of coding contests to help learners improve their skills. 
Each learner may participate multiple times, and every participation is recorded as 
an integer in array A (each integer represents a learner ID).

Given:
  - An array A that records learner participation,
  - An array B that contains specific learners for whom we want to check participation frequency,

Your task is to determine how many times each learner in B appears in A.
Return an array where each element corresponds to the frequency of the respective learner in B.

Problem Constraints
  1 <= |A| <= 100000
  1 <= |B| <= 100000
  1 <= A[i] <= 100000
  1 <= B[i] <= 100000

Input Format
  The first argument is array A.
  The second argument is array B (the list of learners for which frequency is queried).

Output Format
  Return an array of integers where each value represents the frequency of the corresponding learner in B, based on array A.

Example Input

Input 1:
  A = [1, 2, 1, 1]
  B = [1, 2]

Input 2:
  A = [2, 5, 9, 2, 8]
  B = [3, 2]

Example Output

Output 1:
  [3, 1]

Output 2:
  [0, 2]

Example Explanation

For Input 1:
  - Learner 1 appears 3 times in A → frequency = 3
  - Learner 2 appears 1 time in A → frequency = 1

For Input 2:
  - Learner 3 does not appear in A → frequency = 0
  - Learner 2 appears 2 times in A → frequency = 2
*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            if(map.containsKey(A.get(i))){
                int freq = map.get(A.get(i));
                map.put(A.get(i), freq+1);
            }else{
                map.put(A.get(i),1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<B.size(); i++){
            if(map.containsKey(B.get(i))){
                arr.add(map.get(B.get(i)));
            }else{
                arr.add(0);
            }
        }
        return arr;
    }
}
