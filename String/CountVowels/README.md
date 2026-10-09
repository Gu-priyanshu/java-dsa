# Count Vowels in Java

A simple and efficient Java program to count the number of vowels present in a given string.

## 📌 Problem

Given a string, count how many vowels it contains.

The vowels considered in this program are:

```text
a, e, i, o, u
```

### Example

**Input:**

```text
Hello
```

**Output:**

```text
vowels: 2
```

The vowels in `"Hello"` are:

```text
e, o
```

## 💡 Approach

The program uses a **single loop** to traverse the string character by character.

For every character, it checks whether the character is one of:

```text
a, e, i, o, u
```

If it is a vowel, the `count` is increased by `1`.

### Step 1: Convert to Lowercase

The input is converted to lowercase:

```java
str = str.toLowerCase();
```

This allows the program to handle uppercase vowels such as `A`, `E`, `I`, `O`, and `U`.

For example:

```text
"Hello" → "hello"
```

### Step 2: Traverse the String

Each character is accessed using:

```java
char ch = str.charAt(i);
```

### Step 3: Check for Vowel

```java
if (ch == 'a' || ch == 'e' || ch == 'i' ||
    ch == 'o' || ch == 'u') {
    count++;
}
```

If the character is a vowel, the count increases.

## 💻 Code

```java
package String.CountVowels;

public class Solution {

    public static int vowelsCount(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "Hello";

        str = str.toLowerCase();

        int result = vowelsCount(str);

        System.out.println("vowels: " + result);
    }
}
```

## 🔍 Dry Run

For:

```text
str = "Hello"
```

After converting to lowercase:

```text
hello
```

| Index | Character | Vowel? | Count |
| ----: | :-------: | :----: | ----: |
|     0 |    `h`    |    ❌   |     0 |
|     1 |    `e`    |    ✅   |     1 |
|     2 |    `l`    |    ❌   |     1 |
|     3 |    `l`    |    ❌   |     1 |
|     4 |    `o`    |    ✅   |     2 |

Final result:

```text
vowels: 2
```

## ▶️ Output

```text
vowels: 2
```

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The string is traversed once, where `n` is the length of the string.

### Space Complexity

```text
O(1)
```

Only a few variables are used, regardless of the input size.

## 🚀 Why This Approach?

This solution does not require a `HashSet`, `HashMap`, or additional array.

It uses:

* One loop
* One counter
* One character variable
* Simple character comparisons

Therefore, it is a simple and efficient solution for counting vowels.

## 🧠 Key Concepts

* String traversal
* `charAt()`
* `toLowerCase()`
* Character comparison
* Conditional statements
* Time and space complexity
