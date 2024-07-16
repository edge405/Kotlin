package Day44

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
