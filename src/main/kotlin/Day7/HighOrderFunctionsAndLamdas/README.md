##### Documentation for functional programming: https://kotlinlang.org/docs/lambdas.html
##### SimpliLearn link for explaning functional programming: https://www.youtube.com/watch?v=obN78NEd47g
### Higher-order functions
A higher-order function is a function that takes functions as parameters, or returns a function.

A good example of a higher-order function is the functional programming idiom fold for collections. It takes an initial accumulator value and a combining function and builds its return value by consecutively combining the current accumulator value with each collection element, replacing the accumulator value each time:
```kotlin
fun <T, R> Collection<T>.fold(
initial: R,
combine: (acc: R, nextElement: T) -> R
): R {
var accumulator: R = initial
for (element: T in this) {
accumulator = combine(accumulator, element)
}
return accumulator
}
```
In the code above, the combine parameter has the function type (R, T) -> R, so it accepts a function that takes two arguments of types R and T and returns a value of type R. It is invoked inside the for loop, and the return value is then assigned to accumulator.

### Lambda expressions and anonymous functions﻿

Lambda expressions and anonymous functions are function literals. Function literals are functions that are not declared but are passed immediately as an expression. Consider the following example:
````
max(strings, { a, b -> a.length < b.length })
````
The function max is a higher-order function, as it takes a function value as its second argument. This second argument is an expression that is itself a function, called a function literal, which is equivalent to the following named function:
````
fun compare(a: String, b: String): Boolean = a.length < b.length
````
### Lambda expression syntax
The full syntactic form of lambda expressions is as follows:
````
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
````
A lambda expression is always surrounded by curly braces.

Parameter declarations in the full syntactic form go inside curly braces and have optional type annotations.

The body goes after the ->.

If the inferred return type of the lambda is not Unit, the last (or possibly single) expression inside the lambda body is treated as the return value.

If you leave all the optional annotations out, what's left looks like this:
````
val sum = { x: Int, y: Int -> x + y }
````