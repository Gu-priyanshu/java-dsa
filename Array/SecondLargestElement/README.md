# Second Largest Element

This Java program finds the second largest element in an array.

## Example

Input:
```text
[1, 2, 3, 4, 5]
```

Output:
```text
4
```

## Approach

- Keep two variables: `largest` and `secondLargest`.
- Traverse the array once.
- If the current element is greater than `largest`, update both variables.
- Otherwise, update `secondLargest` if needed.

## Code

```java
public static int secondLargest(int[] nums) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : nums) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num < largest) {
            secondLargest = num;
        }
    }

    return secondLargest;
}
```

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Note

This program finds the **second largest distinct element**.

Example:

```text
Input:  [5, 5, 4, 3]
Output: 4
```