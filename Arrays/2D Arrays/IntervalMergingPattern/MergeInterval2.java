// Problem Description
//
// You are given a set of non-overlapping intervals. 
// You are also given a new interval [start, end].
// Your task is to insert this new interval into the existing set of intervals 
// and merge if necessary.
//
// You may assume that the intervals are already sorted 
// based on their start values.
//
//
// Problem Constraints
//    0 <= |intervals| <= 10^5
//
//    Each interval consists of two integers [start, end]
//
//
// Input Format
//    The first argument is a list of intervals (2-D array format).
//    The second argument is the new interval to be inserted and merged.
//
//
// Output Format
//    Return the list of intervals after inserting and merging the new interval.
//
//
// Example Input
// Input 1:
//    Given intervals [1, 3], [6, 9] insert and merge [2, 5].
//
// Input 2:
//    Given intervals [1, 3], [6, 9] insert and merge [2, 6].
//
//
// Example Output
// Output 1:
//    [ [1, 5], [6, 9] ]
//
// Output 2:
//    [ [1, 9] ]
//
//
// Example Explanation
// Explanation 1:
//    (2, 5) overlaps partially with [1, 3], producing [1, 5],
//    and does not overlap with [6, 9].
//
// Explanation 2:
//    (2, 6) overlaps with both existing intervals, 
//    resulting in a complete merge that produces [1, 9].


public class Solution {
    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        boolean isFound = false;
        for(int i=0;i<A.size();i++){
            int L = A.get(i).get(0);
            int R = A.get(i).get(1);
            if(!isFound && (B.get(0)<=L) ){
                isFound = true;
                arr.add(new ArrayList<>(B));
            }
            arr.add(new ArrayList<>(A.get(i)));
            
        }
        if(isFound == false){
            arr.add(new ArrayList<>(B));
        }

        //[1,3] [2,5] [6,9]
        ArrayList<ArrayList<Integer>> final_arr = new ArrayList<>();
        int a1 = arr.get(0).get(0);
        int b1 = arr.get(0).get(1);
        for(int i=0;i<arr.size();i++){
            int a2 = arr.get(i).get(0);
            int b2 = arr.get(i).get(1);
            if(a2>b1){
                ArrayList<Integer> arr1 = new ArrayList<>();
                arr1.add(a1);
                arr1.add(b1);
                final_arr.add(arr1);
                a1 = a2;
                b1 = b2;
            }else{
                a1 = Math.min(a1, a2);
                b1 = Math.max(b1, b2);
            }
        }
        ArrayList<Integer> last = new ArrayList<>();
        last.add(a1);
        last.add(b1);
        final_arr.add(last);
        return final_arr;
    }
}
