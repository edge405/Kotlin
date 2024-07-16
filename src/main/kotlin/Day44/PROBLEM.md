## Problem Statement

**Task: Implement a Simple Queue**

You need to implement a simple queue data structure in Kotlin. A queue is a collection of elements that supports two main operations:

1. **Enqueue**: Add an element to the end of the queue.
2. **Dequeue**: Remove an element from the front of the queue and return it.

Additionally, you should implement the following auxiliary operations:

1. **isEmpty**: Check if the queue is empty.
2. **size**: Return the number of elements in the queue.
3. **peek**: Return the element at the front of the queue without removing it.

### Requirements:

1. **enqueue(element: T)**: Adds the element to the end of the queue.
2. **dequeue(): T?**: Removes and returns the element at the front of the queue. Returns `null` if the queue is empty.
3. **isEmpty(): Boolean**: Returns `true` if the queue is empty, `false` otherwise.
4. **size(): Int**: Returns the number of elements in the queue.
5. **peek(): T?**: Returns the element at the front of the queue without removing it. Returns `null` if the queue is empty.

### Example:

```kotlin
fun main() {
    val queue = SimpleQueue<Int>()
    
    println(queue.isEmpty()) // true
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    println(queue.size())    // 3
    println(queue.peek())    // 1
    println(queue.dequeue()) // 1
    println(queue.dequeue()) // 2
    println(queue.size())    // 1
    println(queue.isEmpty()) // false
    println(queue.dequeue()) // 3
    println(queue.dequeue()) // null
    println(queue.isEmpty()) // true
}
```