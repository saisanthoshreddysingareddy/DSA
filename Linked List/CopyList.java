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
