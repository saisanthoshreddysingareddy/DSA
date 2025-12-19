/*
Problem Description

You are given a linked list A.

Each node in the linked list contains two pointers:
  - A next pointer, which points to the next node in the list.
  - A random pointer, which can point to any node in the list or can be NULL.

Your task is to create a deep copy of the linked list A.

The copied list should be a completely separate linked list from the original
list, but it should have the same node values and random pointer connections
as the original list.

You should create a new linked list B, where:
  - Each node in B has the same value as the corresponding node in A.
  - The next and random pointers of each node in B point to the corresponding
    nodes in B (and not to nodes in A).

Problem Constraints
  0 <= |A| <= 10^6

Input Format
  The first argument contains a pointer to the head of the linked list A.

Output Format
  Return a pointer to the head of the newly created linked list B.

Example Input

Given list:
  1 -> 2 -> 3

With random pointers:
  1 -> 3
  2 -> 1
  3 -> 1

Example Output

Copied list:
  1 -> 2 -> 3

With random pointers:
  1 -> 3
  2 -> 1
  3 -> 1
*/

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode temp = head;
        while(temp!=null){
            RandomListNode cloned = new RandomListNode(temp.label);
            cloned.next = temp.next;
            temp.next = cloned;
            temp = cloned.next;
        }

        RandomListNode curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random =  curr.random.next;
            }
            curr = curr.next.next;
        }

        RandomListNode dummy = new RandomListNode(0);
        RandomListNode present = head;
        RandomListNode copy = dummy;
        while(present != null){
            copy.next = present.next; // 0->1
            present = present.next.next;
            copy = copy.next;
        }
        dummy = dummy.next;
        return dummy;

    }
}
