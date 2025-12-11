/*
Problem Description

You are given an array of N integers, A1, A2, ..., AN and an integer B.
Return the count of distinct numbers in all windows of size B.

Formally, return an array of size (N - B + 1) where the i'th element contains
the number of distinct elements in the sequence:
  Ai, Ai+1, ..., Ai+B-1

NOTE: If B > N, return an empty array.

Problem Constraints
  1 <= N <= 10^6
  1 <= A[i] <= 10^9

Input Format
  First argument is an integer array A.
  Second argument is an integer B.

Output Format
  Return an integer array.

Example Input

Input 1:
  A = [1, 2, 1, 3, 4, 3]
  B = 3

Input 2:
  A = [1, 1, 2, 2]
  B = 1

Example Output

Output 1:
  [2, 3, 3, 2]

Output 2:
  [1, 1, 1, 1]

Example Explanation

Explanation 1:
  A = [1, 2, 1, 3, 4, 3] and B = 3
  All windows of size B are:
    [1, 2, 1]
    [2, 1, 3]
    [1, 3, 4]
    [3, 4, 3]
  So we return the array [2, 3, 3, 2].

Explanation 2:
  Window size is 1, so the output array is [1, 1, 1, 1].
*/


public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        int distinct_elements = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<B; i++){
            if(map.containsKey(A.get(i))){
                int freq = map.get(A.get(i));
                map.put(A.get(i), freq+1);
            }else{
                map.put(A.get(i), 1);
            }
        }
        distinct_elements = map.size();
        arr.add(distinct_elements);

        for(int i=B; i<A.size(); i++){
            int first = A.get(i-B);
            int last = A.get(i);
            if(map.containsKey(first)){
                if(map.get(first) == 1){
                    map.remove(first);
                }else{
                    map.put(first, map.get(first)-1);
                }
            }

            if(map.containsKey(last)){
                int freq2 = map.get(last);
                map.put(last, freq2+1);
            }else{
                map.put(last, 1);
            }
            arr.add(map.size());
        }
        return arr;
    }
}
