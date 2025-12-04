/*
Problem Description

Given a non-negative number represented as an array of digits, add 1 to the number
(i.e., increment the number represented by the digits).

The digits are stored such that the most significant digit is at the head of the list.

NOTE:
  Certain things are intentionally left unclear in this question, which you are
  expected to clarify during an interview. For example:

  Q: Can the input contain leading zeros (e.g., 0 1 2 3)?
  A: For this problem, YES.

  Q: Can the output contain leading zeros (e.g., 0 1 2 4)?
  A: For this problem, NO. Even if the input has leading zeros, 
     the output must not have them.

Problem Constraints
  1 <= size of the array <= 1,000,000

Input Format
  The first argument is an array of digits.

Output Format
  Return the array of digits after adding 1 to the number.

Example Input

Input 1:
  [1, 2, 3]

Example Output

Output 1:
  [1, 2, 4]

Example Explanation

Explanation 1:
  The given digits represent the number 123.
  After adding 1, the result is 124.
*/


public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        while(A.size()>0 && A.get(0)==0){
            A.remove(0);
        }
        for(int i=A.size()-1; i>=0; i--){
            int val = A.get(i);
            if(val < 9){
                A.set(i, A.get(i)+1);
                return A;
            }else{
                A.set(i,0);
            }
        }
        A.add(0,1);
        return A;
    }
}
