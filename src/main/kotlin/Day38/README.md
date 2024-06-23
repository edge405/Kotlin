### Challenge: Roman Numeral Converter

#### Problem Statement:
Write a function in Kotlin that converts a given integer (between 1 and 3999) to its Roman numeral equivalent.

#### Roman Numeral Reference:
The numerals are based on seven symbols:
- I: 1
- V: 5
- X: 10
- L: 50
- C: 100
- D: 500
- M: 1000

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not "IIII". Instead, the number four is written as "IV". Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as "IX". There are six instances where subtraction is used:
- I can be placed before V (5) and X (10) to make 4 and 9.
- X can be placed before L (50) and C (100) to make 40 and 90.
- C can be placed before D (500) and M (1000) to make 400 and 900.

#### Examples:
- `romanNumeral(3)` should return `"III"`
- `romanNumeral(4)` should return `"IV"`
- `romanNumeral(9)` should return `"IX"`
- `romanNumeral(58)` should return `"LVIII"` (L = 50, V = 5, III = 3)
- `romanNumeral(1994)` should return `"MCMXCIV"` (M = 1000, CM = 900, XC = 90, IV = 4)

#### Function Signature:
```kotlin
fun romanNumeral(num: Int): String {
    // your code here
}
```

#### Requirements:
1. The function should handle numbers between 1 and 3999 inclusive.
2. The function should return a string representing the Roman numeral of the input number.
3. You should not use any built-in functions that directly convert numbers to Roman numerals.

#### Solution Outline:
1. Define arrays of Roman numerals and their corresponding values.
2. Iterate through the values, subtracting from the number and appending the corresponding numeral to the result string until the number is reduced to zero.
