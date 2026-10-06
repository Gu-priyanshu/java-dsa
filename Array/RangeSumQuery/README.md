# Range Sum Query Using Prefix Sum

## Problem

Given an array of integers, answer the sum of elements between two indices `L` and `R` efficiently.

The range is **inclusive**, meaning both `L` and `R` are included.


## Example

text
Input:
nums = [1, 2, 3, 4, 5]
L = 1
R = 3

Output:
9

Explanation:

text
nums[1] + nums[2] + nums[3]
= 2 + 3 + 4
= 9

## Approach

First, create a **prefix sum array**.

For each index:

text
prefix[i] = prefix[i - 1] + nums[i]


For the given array:

text
nums   = [1, 2, 3, 4, 5]
prefix = [1, 3, 6, 10, 15]


To find the sum from `L` to `R`:

text
If L == 0:
    sum = prefix[R]

Otherwise:
    sum = prefix[R] - prefix[L - 1]


For `L = 1` and `R = 3`:

text
sum = prefix[3] - prefix[0]
    = 10 - 1
    = 9


---

## Code

See [`Solution.java`](./Solution.java).

The solution contains two methods:

* `prefixSum()` — creates the prefix sum array.
* `rangeSum()` — calculates the sum between indices `L` and `R`.

## Complexity

### Prefix Sum Construction

* **Time:** `O(n)`
* **Space:** `O(n)`

### Range Sum Query

* **Time:** `O(1)`
* **Space:** `O(1)`

This makes prefix sums useful when there are **multiple range sum queries** on the same array.

## Example Output

text
9
