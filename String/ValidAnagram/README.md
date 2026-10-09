# Valid Anagram in Java

A Java program to check whether two strings are **anagrams** using a frequency array.

## 📌 Problem

Given two strings, determine whether they contain the same characters with the same frequency, regardless of the order.

### Example

```text
str1 = "listen"
str2 = "silent"
```

Both strings contain:

```text
l → 1
i → 1
s → 1
t → 1
e → 1
n → 1
```

Therefore, they are anagrams.

**Output:**

```text
true
```

## 💡 Approach

This solution uses an integer array of size `26` to store the frequency of each lowercase English letter.

```java
int[] count = new int[26];
```

The index represents a character:

```text
'a' → 0
'b' → 1
'c' → 2
...
'z' → 25
```

The character is converted to an array index using:

```java
str.charAt(i) - 'a'
```

### Step 1: Check Length

If the strings have different lengths, they cannot be anagrams.

```java
if (str1.length() != str2.length()) {
    return false;
}
```

### Step 2: Count Characters

For every character in `str1`, increment its count:

```java
count[str1.charAt(i) - 'a']++;
```

For every character in `str2`, decrement its count:

```java
count[str2.charAt(i) - 'a']--;
```

If the strings are anagrams, the increments and decrements will cancel each other out.

### Step 3: Check the Array

Finally, check every value in the `count` array:

```java
for (int value : count) {
    if (value != 0) {
        return false;
    }
}
```

If every value is `0`, the strings are anagrams.

## 💻 Code

```java
package String.ValidAnagram;

public class Solution {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {

            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int value : count) {

            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagram(str1, str2));
    }
}
```

## ▶️ Output

```text
true
```

## 🔍 Dry Run

For:

```text
str1 = "listen"
str2 = "silent"
```

The algorithm adds characters from `str1` and subtracts characters from `str2`.

```text
Character    str1    str2    Final Count
----------------------------------------
l             +1      -1        0
i             +1      -1        0
s             +1      -1        0
t             +1      -1        0
e             +1      -1        0
n             +1      -1        0
```

All character counts become `0`, so the result is:

```text
true
```

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The first loop processes all characters, and the second loop checks only 26 elements.

### Space Complexity

```text
O(1)
```

The array always contains only 26 integers, regardless of the input size.

## ⚠️ Limitation

This implementation assumes that the strings contain only **lowercase English letters (`a-z`)**.

For example:

```text
"listen" → valid
"silent" → valid
```

But strings containing uppercase letters, spaces, numbers, or special characters require a different approach.

## 🧠 Key Concepts

* String traversal
* Character frequency
* Arrays
* ASCII/Unicode character values
* `charAt()`
* Anagram detection
* Time and space complexity
