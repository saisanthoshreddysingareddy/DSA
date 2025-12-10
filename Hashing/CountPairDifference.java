/*
Problem Description

You are given:
  - An array A of N integers
  - An integer B

Your task is to count the number of pairs (i, j) such that:

      A[i] - A[j] = B
      i ≠ j

Since the value can be very large, return the answer modulo (10^9 + 7).

Important Notes:
  - Order matters because A[i] - A[j] is not the same as A[j] - A[i].
  - You do NOT need to return the actual pairs.

Problem Constraints
  1 <= N <= 10^5
  1 <= A[i] <= 10^9
  1 <= B <= 10^9

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return an integer representing the number of valid (i, j) pairs
  such that A[i] - A[j] = B.

Example Input

Input 1:
  A = [3, 5, 1, 2]
  B = 4

Input 2:
  A = [1, 2, 1, 2]
  B = 1

Example Output

Output 1:
  1

Output 2:
  4

Example Explanation

Explanation 1:
  The only valid pair is (i = 2, j = 3) because 5 - 1 = 4.

Explanation 2:
  The valid pairs where the difference is 1 are:
    (2, 1), (4, 1), (2, 3), and (4, 3)
  Hence, the total count is 4.
*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            int target = A.get(i) - B;
            int target_sum = A.get(i) + B;
            if(map.containsKey(target)){
                ans += map.get(target);
            }
            if(map.containsKey(target_sum)){
                ans += map.get(target_sum);
            }
            if(map.containsKey(A.get(i))){
                int freq = map.get(A.get(i));
                map.put(A.get(i), freq+1);
            }else{
                map.put(A.get(i), 1);
            }
        }
        return ans;
    }
}
