# String Palindrome in Java

A Java program to check whether a given string is a **palindrome** using the **two-pointer approach**.

## 📌 Problem

A string is called a **palindrome** if it reads the same from left to right and from right to left.

### Example

```text
Input:
helloolleh

Output:
true
```

The string:

```text
helloolleh
```

reads the same in both directions, so it is a palindrome.

### More Examples

```text
madam  → true
racecar → true
hello → false
```

## 💡 Approach

The solution uses two pointers:

* `left` starts at the beginning of the string.
* `right` starts at the end of the string.

```java
int left = 0;
int right = str.length() - 1;
```

Then compare the characters at both positions:

```java
if (str.charAt(left) != str.charAt(right)) {
    return false;
}
```

If the characters are different, the string is **not a palindrome**.

If they are equal, move the pointers toward the center:

```java
left++;
right--;
```

Continue until:

```java
left < right
```

becomes false.

If no mismatch is found, the string is a palindrome.

## 🔍 Dry Run

For:

```text
str = "helloolleh"
```

The comparison happens like this:

```text
h e l l o o l l e h
↑                 ↑
L                 R
```

`h == h` ✅

Move pointers:

```text
h e l l o o l l e h
  ↑             ↑
  L             R
```

`e == e` ✅

Move pointers:

```text
h e l l o o l l e h
    ↑         ↑
    L         R
```

`l == l` ✅

Move pointers:

```text
h e l l o o l l e h
      ↑     ↑
      L     R
```

`l == l` ✅

Move pointers:

```text
h e l l o o l l e h
        ↑ ↑
        L R
```

`o == o` ✅

No mismatch was found, so:

```text
true
```

## 💻 Code

```java
package String.Palindrome;

public class Solution {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "helloolleh";

        boolean result = isPalindrome(str);

        System.out.println(result);
    }
}
```

## ▶️ Output

```text
true
```

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The algorithm checks each character at most once.

### Space Complexity

```text
O(1)
```

No additional data structure is used. Only two variables, `left` and `right`, are used.

## 🧠 Key Concepts

* String traversal
* `charAt()`
* Two-pointer technique
* `while` loop
* Palindrome checking
* Time and space complexity

## 🚀 Why Use Two Pointers?

Instead of creating a reversed copy of the string, we compare characters directly from both ends.

This makes the solution:

* Efficient
* Simple
* Memory efficient
* Suitable for coding interviews

## ⚠️ Note

This implementation is **case-sensitive** and considers spaces/special characters.

For example:

```text
"Madam" → false
```

because `'M'` and `'m'` are different characters.
