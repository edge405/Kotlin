package Day46

fun main() {
    val n = readLine()!!.toInt()
    val items = mutableListOf<Item>()

    repeat(n) {
        val input = readLine()!!.split(" ")
        val name = input[0]
        val quantity = input[1].toInt()
        val price = input[2].toDouble()
        items.add(Item(name, quantity, price))
    }

    var overallTotal = 0.0
    for (item in items) {
        val itemTotal = item.quantity * item.price
        println("Item: ${item.name}, Quantity: ${item.quantity}, Unit Price: ${"%.2f".format(item.price)}, Total: ${"%.2f".format(itemTotal)}")
        overallTotal += itemTotal
    }
    println("Overall Total: ${"%.2f".format(overallTotal)}")
}
