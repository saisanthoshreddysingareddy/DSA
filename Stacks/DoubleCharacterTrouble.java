/*
Problem Description

You are given a string A.

To transform the string, perform the following operation repeatedly:
  1) Identify the first occurrence of consecutive identical characters.
  2) Remove this pair of identical characters from the string.
  3) Repeat the above steps until no such consecutive identical pairs exist.

The final string obtained after all removals is the result.

Problem Constraints
  1 <= |A| <= 100000

Input Format
  The first and only argument is the string A.

Output Format
  Return the final transformed string.

Example Input

Input 1:
  A = "abccbc"

Input 2:
  A = "ab"

Example Output

Output 1:
  "ac"

Output 2:
  "ab"

Example Explanation

Explanation 1:
  Given string: "abccbc"

  - Remove the first consecutive identical pair "cc":
      Resulting string = "abbc"
  - Remove the next consecutive identical pair "bb":
      Resulting string = "ac"

  No more consecutive identical pairs exist.
  Final result = "ac"

Explanation 2:
  The string "ab" has no consecutive identical pairs,
  so no removals are performed.
*/
