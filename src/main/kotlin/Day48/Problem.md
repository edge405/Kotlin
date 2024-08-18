### Problem: **Word Frequency Counter**

Write a Kotlin program that reads a string and counts the frequency of each word in the string. The program should then print each word along with its frequency, sorted by the frequency in descending order. If two words have the same frequency, they should be sorted alphabetically.

#### Input:
A single string containing words separated by spaces. Words may contain punctuation, but the punctuation should be ignored when counting the words.

#### Output:
Print each word and its frequency in the format:
```
word: frequency
```

#### Example:

**Input:**
```
"Hello, world! Hello, Kotlin. Kotlin is awesome. Kotlin is fun."
```

**Output:**
```
kotlin: 3
hello: 2
is: 2
awesome: 1
fun: 1
world: 1
```

### Requirements:
1. Ignore case sensitivity (e.g., "Hello" and "hello" should be counted as the same word).
2. Ignore punctuation (e.g., "Kotlin." and "Kotlin" should be counted as the same word).
3. Words with the same frequency should be printed in alphabetical order.

--- 