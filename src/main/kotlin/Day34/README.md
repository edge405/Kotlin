### Problem Statement: Handling Nulls in a List of Nullable Strings

You are given a list of nullable strings representing user input from a survey. Your task is to clean this list by performing the following operations:

1. Remove all `null` entries.
2. Trim leading and trailing whitespace from each string.
3. Convert all strings to lowercase.
4. Remove any empty strings (strings that become empty after trimming).

### Input
- A list of nullable strings, `List<String?>`, representing user inputs.

### Output
- A list of non-nullable strings, `List<String>`, that have been cleaned according to the rules specified above.

### Example

#### Input
```kotlin
val inputs: List<String?> = listOf(" Alice ", null, "BOB", "  ", "  Charlie  ", null, "  dave  ", "Eve")
```

#### Output
```kotlin
val cleanedInputs: List<String> = listOf("alice", "bob", "charlie", "dave", "eve")
```

### Function Signature
```kotlin
fun cleanUserInputs(inputs: List<String?>): List<String>
```

### Constraints
- The input list can contain up to `1000` elements.
- Each string in the input list can have a maximum length of `100` characters.

### Instructions
1. Implement the `cleanUserInputs` function.
2. Ensure your solution handles all edge cases, such as lists containing only `null` values or strings with only whitespace.

### Solution Template
```kotlin
fun cleanUserInputs(inputs: List<String?>): List<String> {
    // Implement the function here
}
```

Implement the function and test it with the provided example to ensure it works correctly.