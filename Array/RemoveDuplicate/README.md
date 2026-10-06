# Remove Duplicates from Array

## Problem

Given a **sorted integer array**, remove the duplicate elements while keeping only one occurrence of each element.

The modification is performed **in-place**, meaning we use the same array without creating another array.

After removing the duplicates, the remaining positions in the array are filled with `0`.

### Example

```text
Input:
[1, 2, 2, 3, 4, 56, 56]

Output:
[1, 2, 3, 4, 56, 0, 0]
```

## Approach

This solution uses the **two-pointer technique**.

We use:

* `i` — traverses the array.
* `unique` — keeps track of the position where the next unique element should be placed.

The first element `nums[0]` is automatically considered unique.

```java
int unique = 1;
```

We start the loop from index `1`:

```java
for (int i = 1; i < nums.length; i++)
```

For every element, we compare it with the last unique element:

```java
if (nums[i] != nums[unique - 1])
```

If the elements are different, we copy the current element to the `unique` position:

```java
nums[unique] = nums[i];
unique++;
```

After all duplicates have been processed, the remaining positions are filled with `0`.

## Java Code

```java
package Array.RemoveDuplicate;

public class Solution {

    public static void removeDuplicate(int[] nums) {

        int unique = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[unique - 1]) {

                nums[unique] = nums[i];
                unique++;
            }
        }

        for (int i = unique; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 4, 56, 56};

        removeDuplicate(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
```

## Output

```text
1 2 3 4 56 0 0
```

## Example Walkthrough

Given:

```text
[1, 2, 2, 3, 4, 56, 56]
```

The algorithm keeps:

```text
1
1, 2
1, 2
1, 2, 3
1, 2, 3, 4
1, 2, 3, 4, 56
1, 2, 3, 4, 56
```

The final unique elements are:

```text
[1, 2, 3, 4, 56]
```

Since the original array has 7 positions, the remaining two positions are filled with `0`:

```text
[1, 2, 3, 4, 56, 0, 0]
```

## Important Note

This approach assumes that the array is **sorted**.

For example:

```text
[1, 1, 2, 2, 3, 3]
```

works because duplicate values are next to each other.

An unsorted array such as:

```text
[1, 2, 1, 3, 2]
```

would require a different approach.

## Complexity

### Time Complexity

`O(n)`

The array is traversed once to find unique elements and once more to fill the remaining positions.

### Space Complexity

`O(1)`

No additional array or data structure is used. The modification is done directly inside the original array.

## Key Concept

**Two Pointers / In-Place Array Modification**

This problem is useful for understanding how to modify a sorted array without creating a second array.
