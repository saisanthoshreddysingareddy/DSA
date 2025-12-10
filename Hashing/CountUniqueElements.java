/*
Problem Description

You are given an array A of N integers.
Your task is to return the count of elements that have a frequency of exactly 1
in the given array.

Problem Constraints
  1 <= N <= 10^5
  1 <= A[i] <= 10^9

Input Format
  The first argument is the integer array A.

Output Format
  Return an integer representing the number of elements that appear
  exactly once in the array.

Example Input

Input 1:
  A = [3, 4, 3, 6, 6]

Input 2:
  A = [3, 3, 3, 9, 0, 1, 0]

Example Output

Output 1:
  1

Output 2:
  2

Example Explanation

Explanation 1:
  Only the element 4 appears exactly once in the array.

Explanation 2:
  The elements 9 and 1 appear exactly once in the array.
*/


public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            if(map.containsKey(A.get(i))){
                int freq = map.get(A.get(i));
                map.put(A.get(i), freq+1);
            }else{
                map.put(A.get(i), 1);
            }
        }
        // [3: 3] [0: 2] [1: 1] [9: 1]
        int count = 0;
        for(int key: map.keySet()){
            if(map.get(key) == 1){
                count++;
            }
        }
        return count; 
    }
}
