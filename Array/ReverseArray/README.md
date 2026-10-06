# Reverse Array In-Place in Java

This program reverses an integer array **in place** using the **two-pointer technique**.

## 📌 Description

The `reverse()` method reverses the given array without creating a new array.

It uses two pointers:

* `left` starts at the first element.
* `right` starts at the last element.
* The elements at `left` and `right` are swapped.
* `left` moves forward and `right` moves backward.
* The process continues until `left` and `right` meet.

## 💻 Code

```java
public class Solution {
    public static void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 34, 4};

        reverse(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
```

## 🔍 Example

### Input

```text
[1, 2, 34, 4]
```

### Output

```text
4 34 2 1
```

## 🧠 Approach

For the array:

```text
[1, 2, 34, 4]
 ↑          ↑
left      right
```

First, swap `1` and `4`:

```text
[4, 2, 34, 1]
```

Then move the pointers:

```text
[4, 2, 34, 1]
    ↑     ↑
  left  right
```

Swap `2` and `34`:

```text
[4, 34, 2, 1]
```

Now the pointers have crossed, so the array is reversed.

## ⏱️ Complexity

| Complexity | Value  |
| ---------- | ------ |
| Time       | `O(n)` |
| Space      | `O(1)` |

The array is reversed **in place**, so no additional array is required.

## 🚀 Key Concept

This solution demonstrates the **Two-Pointer Technique**, which is commonly used for array and string problems where elements need to be processed from both ends.
