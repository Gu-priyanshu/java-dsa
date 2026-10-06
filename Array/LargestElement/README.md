# Largest Element in an Array

## Problem

Given an integer array, find the largest element in the array.

### Example

Input:
[1, 2, 3, 4, 5]

Output:
5

## Approach

Initialize `max` with `Integer.MIN_VALUE`.

Traverse through the array and compare each element with `max`.

If the current element is greater than `max`, update `max`.

After traversing the entire array, return `max`.

## Complexity

- Time: O(n)
- Space: O(1)