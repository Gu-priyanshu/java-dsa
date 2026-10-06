# Two Sum

## Problem

Given an integer array `nums` and an integer `target`, find two different elements in the array whose values add up to the target.

Return the **indices** of those two elements.

### Example

```text
Input:
nums = [1, 2, 3, 4, 5]
target = 9

Output:
[3, 4]
```

Because:

```text
nums[3] + nums[4]
4 + 5 = 9
```

## Approach

This solution uses a **HashMap** to find the required pair efficiently.

The HashMap stores:

```text
value → index
```

For every element `nums[i]`, we calculate its complement:

```java
int compliment = target - nums[i];
```

We then check whether this complement already exists in the HashMap.

### If the complement exists

We have found the two numbers:

```java
return new int[]{map.get(compliment), i};
```

The HashMap gives us the index of the complement, while `i` is the index of the current element.

### If the complement does not exist

We store the current number and its index:

```java
map.put(nums[i], i);
```

We continue until a valid pair is found.

## Java Code

```java
package Array.TwoSum;

import java.util.HashMap;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {

                return new int[]{map.get(compliment), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        int target = 9;

        int[] result = twoSum(nums, target);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
```

## Output

```text
3 4
```

## Step-by-Step Example

Given:

```text
nums = [1, 2, 3, 4, 5]
target = 9
```

### Step 1

```text
i = 0
nums[i] = 1
```

Calculate:

```text
9 - 1 = 8
```

`8` is not in the HashMap.

Store:

```text
1 → 0
```

### Step 2

```text
i = 1
nums[i] = 2
```

Calculate:

```text
9 - 2 = 7
```

`7` is not in the HashMap.

Store:

```text
2 → 1
```

### Step 3

```text
i = 2
nums[i] = 3
```

Calculate:

```text
9 - 3 = 6
```

`6` is not in the HashMap.

Store:

```text
3 → 2
```

### Step 4

```text
i = 3
nums[i] = 4
```

Calculate:

```text
9 - 4 = 5
```

`5` is not in the HashMap.

Store:

```text
4 → 3
```

### Step 5

```text
i = 4
nums[i] = 5
```

Calculate:

```text
9 - 5 = 4
```

`4` **is already in the HashMap** at index `3`.

Therefore:

```text
[3, 4]
```

is returned.

## Complexity

### Time Complexity

`O(n)`

We traverse the array once, and HashMap lookup is `O(1)` on average.

### Space Complexity

`O(n)`

In the worst case, the HashMap can store all elements of the array.

## Key Concept

**HashMap / Complement Technique**

Instead of checking every possible pair with two loops (`O(n²)`), we use a HashMap to remember previously visited elements and find the required complement in `O(1)` average lookup time.

> **Note:** The variable `compliment` in the code is commonly spelled **`complement`** in this algorithm. You may want to rename it to `complement` for cleaner code.
