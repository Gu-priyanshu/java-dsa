# Merge Sorted Arrays

A Java implementation to merge two **sorted arrays** into a single sorted array using the **two-pointer technique**.

## Problem

Given two sorted arrays, `nums` and `arr`, merge them into one sorted array.

### Example

```text
nums = [1, 2, 3, 4, 5]
arr  = [2, 3, 5, 6, 8, 9]
```

The merged array should be:

```text
[1, 2, 2, 3, 3, 4, 5, 5, 6, 8, 9]
```

## Approach

We use three pointers:

* `i` → points to the current element in `nums`
* `j` → points to the current element in `arr`
* `k` → points to the next position in `mergeArr`

### Step 1: Compare elements

While both arrays have elements remaining:

```java
while (i < n && j < m)
```

Compare `nums[i]` and `arr[j]`.

* If `nums[i]` is smaller, add it to `mergeArr`.
* Otherwise, add `arr[j]`.

Then move the corresponding pointer forward.

### Step 2: Add remaining elements

Once one array is completely processed, the other array may still contain elements.

We copy the remaining elements using two additional `while` loops.

```java
while (i < n) {
    mergeArr[k] = nums[i];
    k++;
    i++;
}

while (j < m) {
    mergeArr[k] = arr[j];
    k++;
    j++;
}
```

## Code

```java
package Array.MergeSortedArray;

public class Solution {

    public static int[] mergeSortedArray(int[] nums, int[] arr) {

        int n = nums.length;
        int m = arr.length;

        int[] mergeArr = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays
        while (i < n && j < m) {

            if (nums[i] < arr[j]) {
                mergeArr[k] = nums[i];
                k++;
                i++;
            } else {
                mergeArr[k] = arr[j];
                k++;
                j++;
            }
        }

        // Add remaining elements from nums
        while (i < n) {
            mergeArr[k] = nums[i];
            k++;
            i++;
        }

        // Add remaining elements from arr
        while (j < m) {
            mergeArr[k] = arr[j];
            k++;
            j++;
        }

        return mergeArr;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int[] arr = {2, 3, 5, 6, 8, 9};

        int[] mergeArr = mergeSortedArray(nums, arr);

        for (int num : mergeArr) {
            System.out.print(num + " ");
        }
    }
}
```

## Output

```text
1 2 2 3 3 4 5 5 6 8 9
```

## Complexity

Let:

* `n` = length of `nums`
* `m` = length of `arr`

### Time Complexity

```text
O(n + m)
```

Each element from both arrays is processed exactly once.

### Space Complexity

```text
O(n + m)
```

A new array of size `n + m` is created to store the merged result.

## Key Concept

This solution uses the **Two-Pointer Technique**.

Instead of comparing every element with every other element, we take advantage of the fact that both input arrays are already sorted.

```text
nums:  1  2  3  4  5
        ↑

arr:   2  3  5  6  8  9
        ↑

Compare 1 and 2 → take 1
Compare 2 and 2 → take 2
Compare 3 and 2 → take 2
Compare 3 and 3 → take 3
...
```

This makes the algorithm efficient with **O(n + m) time complexity**.
