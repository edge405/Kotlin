package Day44

class SimpleQueue<T> {
    private val elements = mutableListOf<T>()

    fun enqueue(element: T) {
        elements.add(element)
    }

    fun dequeue(): T? {
        return if (elements.isEmpty()) {
            null
        } else {
            elements.removeAt(0)
        }
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    fun size(): Int {
        return elements.size
    }

    fun peek(): T? {
        return elements.firstOrNull()
    }
}
