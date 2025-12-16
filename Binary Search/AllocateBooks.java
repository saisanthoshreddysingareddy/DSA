/*
Problem Description

Given an array of integers A of size N and an integer B.

The college library has N books, where the i-th book has A[i] number of pages.
You have to allocate these books to B students such that the maximum number
of pages allocated to any student is minimized.

Rules:
  - Each book must be allocated to exactly one student.
  - Each student must be allocated at least one book.
  - Books must be allocated in contiguous order.
    (A student cannot be allocated book 1 and book 3 while skipping book 2.)

Calculate and return the minimum possible value of the maximum pages assigned
to any student.

NOTE:
  - Return -1 if a valid assignment is not possible.

Problem Constraints
  1 <= N <= 10^5
  1 <= A[i], B <= 10^5

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return the minimum possible number.
  If allocation is not possible, return -1.

Example Input

Input 1:
  A = [12, 34, 67, 90]
  B = 2

Input 2:
  A = [12, 15, 78]
  B = 4

Example Output

Output 1:
  113

Output 2:
  -1

Example Explanation

Explanation 1:
  There are two students. Books can be distributed in the following ways:

  1) [12] and [34, 67, 90]
     Maximum pages = 34 + 67 + 90 = 191

  2) [12, 34] and [67, 90]
     Maximum pages = 67 + 90 = 157

  3) [12, 34, 67] and [90]
     Maximum pages = 12 + 34 + 67 = 113

  Among all possibilities, the minimum of the maximum pages is 113.

Explanation 2:
  Each student must be allocated at least one book.
  Since the number of students exceeds the number of books,
  a valid allocation is not possible.

  Therefore, the result is -1.
*/


public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        if (B > A.size()) return -1;
        int maxValue = maxOfArray(A);
        long lastValue = sumOfArray(A);

        long start = maxValue;
        long end = lastValue;
        long ans = 0;
        while(start<=end){
            long mid = (start+end)/2; //146
            boolean possible = isPossible(A, mid, B);
            if(possible){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        if(ans==0){
            return -1;
        }
        return (int)ans;
    }

    public boolean isPossible(ArrayList<Integer> arr, long mid, int B){
        int no_of_painters =1;
        long sum =0L;
        for(int val:arr){
            sum+=val;
            if(sum>mid){
                sum=val;
                no_of_painters++;
            }
        }
        if(no_of_painters>B){
            return false;
        }
        return true;
    }

    private int maxOfArray(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int v : arr) if (v > max) max = v;
        return max;
    }

    private long sumOfArray(ArrayList<Integer> arr) {
        long sum = 0L;
        for (int v : arr) sum += v;
        return sum;
    }
}
