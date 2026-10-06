# Array Palindrome

## Problem

Given an integer array, determine whether the array reads the same from left to right and right to left.

An array is considered a **palindrome** if the first element is equal to the last element, the second element is equal to the second-last element, and so on.

### Example

```text
Input:  [1, 2, 3, 2, 1]
Output: true
```

```text
Input:  [1, 2, 3, 4]
Output: false
```

## Approach

This solution uses the **two-pointer technique** with a `while` loop.

* `left` starts at the first element.
* `right` starts at the last element.
* Compare `nums[left]` with `nums[right]`.
* If they are different, the array is not a palindrome.
* Move `left` forward and `right` backward.
* Continue until the two pointers meet.

## Java Code

```java
package Array.Palindrome;

public class Solution {

    public static boolean isPalindrome(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] != nums[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 1, 1};

        boolean result = isPalindrome(nums);

        System.out.println(result);
    }
}
```

## Example Walkthrough

For:

```text
[1, 2, 2, 1, 1]
```

The algorithm compares:

```text
1 ↔ 1  ✓
2 ↔ 1  ✗
```

Since `2 != 1`, the method returns:

```text
false
```

## Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

The array is checked from both ends, so only about half of the elements need to be compared.

## Key Concept

**Two Pointers**

This problem is a good example of the two-pointer technique, which is commonly used for arrays and strings when comparing elements from opposite ends.
