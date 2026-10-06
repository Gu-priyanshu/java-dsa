# Prefix Sum

## Problem

Given an integer array, create a new array where each element represents the sum of all elements from the beginning of the original array up to that index.

### Example

**Input:**

[1, 2, 3, 4, 5]

**Output:**

[1, 3, 6, 10, 15]

### Explanation

* `prefix[0] = 1`
* `prefix[1] = 1 + 2 = 3`
* `prefix[2] = 1 + 2 + 3 = 6`
* `prefix[3] = 1 + 2 + 3 + 4 = 10`
* `prefix[4] = 1 + 2 + 3 + 4 + 5 = 15`

## Approach

1. Create a new array `prefix` with the same size as the input array.
2. Store the first element of `nums` in `prefix[0]`.
3. Start a loop from index `1`.
4. For each index, add the current element to the previous prefix sum:

prefix[i] = prefix[i - 1] + nums[i];

5. Return the `prefix` array.

## Code

See `Solution.java` in this folder.

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

## Example Output

1 3 6 10 15

