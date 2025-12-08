/*
Problem Description

In the classic Tower of Hanoi problem, you are given 3 towers numbered 
from 1 to 3 (left to right) and A disks of different sizes numbered 
from 1 (smallest) to A (largest). All disks start on tower 1, arranged 
in ascending order of size from top to bottom.

The objective is to move all disks from tower 1 to tower 3, following 
these rules:

  • Only one disk may be moved at a time.
  • A disk can be moved only from the top of one tower to another tower.
  • A disk may never be placed on top of a smaller disk.

You must return the sequence of moves required to solve the puzzle using 
the minimum number of moves.

Return a 2D array of dimensions M x 3, where M is the minimum number 
of moves required. Each row contains three integers:

  disk  – the disk number being moved  
  start – the tower from which the disk is moved  
  end   – the tower to which the disk is moved  


Problem Constraints
  1 <= A <= 18


Input Format
  The first argument is an integer A.


Output Format
  Return a 2D array of size M x 3, representing the moves required 
  to solve the Tower of Hanoi.


Example Input

Input 1:
  A = 2

Input 2:
  A = 3


Example Output

Output 1:
  [1 1 2]  
  [2 1 3]  
  [1 2 3]

Output 2:
  [1 1 3]  
  [2 1 2]  
  [1 3 2]  
  [3 1 3]  
  [1 2 1]  
  [2 2 3]  
  [1 1 3]


Example Explanation

Explanation 1:
  Move disk 1 from tower 1 to tower 2.  
  Move disk 2 from tower 1 to tower 3.  
  Move disk 1 from tower 2 to tower 3.

Explanation 2:
  The sequence shown is the unique minimal set of moves required 
  to transfer all disks from tower 1 to tower 3 using the rules 
  of the Tower of Hanoi puzzle.
*/


public class Solution {
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        moveDisks(A, 1, 3, 2, result);
        return result;
    }

    private void moveDisks(int n, int from, int to, int aux, ArrayList<ArrayList<Integer>> result) {
        if (n == 0) return;

        // Step 1: Move n-1 disks from 'from' to 'aux' using 'to' as helper
        moveDisks(n - 1, from, aux, to, result);

        // Step 2: Move disk 'n' from 'from' to 'to'
        result.add(new ArrayList<>(Arrays.asList(n, from, to)));

        // Step 3: Move n-1 disks from 'aux' to 'to' using 'from' as helper
        moveDisks(n - 1, aux, to, from, result);
    }
}
