# String Reverse in Java

A simple Java program that reverses a given string without using Java's built-in `reverse()` method.

## 📌 Problem

Given a string, reverse the characters and return the reversed string.

### Example

**Input:**

```text
hello
```

**Output:**

```text
olleh
```

## 💡 Approach

The program uses a `for` loop to traverse the string from the **last character to the first character**.

For example, for `"hello"`:

```text
h e l l o
        ↓
o l l e h
```

Each character is added to the `reversed` string.

## 💻 Code

```java
package String.ReverseString;

public class Solution {

    public static String reverse(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String str = "hello";

        System.out.println(reverse(str));
    }
}
```

## ▶️ Output

```text
olleh
```

## ⏱️ Complexity

* **Time Complexity:** `O(n²)` because string concatenation inside the loop creates new `String` objects.
* **Space Complexity:** `O(n)` for the resulting reversed string.

> **Note:** For better performance, `StringBuilder` can be used instead of repeatedly concatenating strings.

## 🧠 Key Concepts

* Java `String`
* `charAt()`
* `length()`
* `for` loop
* String manipulation
* Time and space complexity

## 🚀 Alternative Using StringBuilder

A more efficient implementation is:

```java
public static String reverse(String str) {
    return new StringBuilder(str).reverse().toString();
}
```
