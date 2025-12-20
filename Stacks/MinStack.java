/*
Problem Description

Design a stack that supports the following operations in constant time:

  push(x)   -- Push element x onto the stack.
  pop()     -- Removes the element on top of the stack.
  top()     -- Get the top element.
  getMin()  -- Retrieve the minimum element in the stack.

NOTE:
  - All operations must run in O(1) time.
  - getMin() should return -1 if the stack is empty.
  - pop() should return nothing if the stack is empty.
  - top() should return -1 if the stack is empty.

Problem Constraints
  1 <= Number of function calls <= 10^6
  It is guaranteed that at least one call is made to either
  getMin() or top().

Input Format
  Functions will be called automatically by the checker code.

Output Format
  Each function should return values as defined in the
  problem statement.

Example Input

Input 1:
  push(1)
  push(2)
  push(-2)
  getMin()
  pop()
  getMin()
  top()

Input 2:
  getMin()
  pop()
  top()

Example Output

Output 1:
  -2 1 2

Output 2:
  -1 -1

Example Explanation

Explanation 1:
  Initial stack: []
  1) push(1)   → [1]
  2) push(2)   → [1, 2]
  3) push(-2)  → [1, 2, -2]
  4) getMin()  → -2
  5) pop()     → removes -2
  6) getMin()  → 1
  7) top()     → 2

Explanation 2:
  Initial stack: []
  1) getMin()  → -1 (stack is empty)
  2) pop()     → no operation (stack is empty)
  3) top()     → -1 (stack is empty)
*/
