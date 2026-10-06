# Move Zeroes

## Problem

Given an integer array, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

### Example

**Input:**

```text
[1, 0, 2, 0, 0, 1]
```

**Output:**

```text
[1, 2, 1, 0, 0, 0]
```

## Approach

This solution uses the **Two Pointer** technique.

* `i` is used to traverse the array.
* `nonZero` keeps track of the next position where a non-zero element should be placed.
* When a non-zero element is found, swap it with the element at `nonZero`.
* Then increment `nonZero`.

This moves all non-zero elements to the front while pushing zeroes toward the end.

## Code

```java
package Array.MoveZeroes;

public class Solution {

    public static void moveZeroes(int[] nums) {

        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[nonZero];
                nums[nonZero] = temp;

                nonZero++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 2, 0, 0, 1};

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
```

## Dry Run

For:

```text
[1, 0, 2, 0, 0, 1]
```

Initially:

```text
nonZero = 0
```

### Step 1

`i = 0`

`nums[0] = 1` → non-zero.

Swap with `nums[nonZero]`:

```text
[1, 0, 2, 0, 0, 1]
```

`nonZero = 1`

### Step 2

`i = 1`

`nums[1] = 0` → skip.

```text
[1, 0, 2, 0, 0, 1]
```

### Step 3

`i = 2`

`nums[2] = 2` → non-zero.

Swap with `nums[1]`:

```text
[1, 2, 0, 0, 0, 1]
```

`nonZero = 2`

### Step 4

`i = 3`

`nums[3] = 0` → skip.

### Step 5

`i = 4`

`nums[4] = 0` → skip.

### Step 6

`i = 5`

`nums[5] = 1` → non-zero.

Swap with `nums[2]`:

```text
[1, 2, 1, 0, 0, 0]
```

Final result:

```text
[1, 2, 1, 0, 0, 0]
```

## Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

The array is modified **in-place**, so no additional array is required.
