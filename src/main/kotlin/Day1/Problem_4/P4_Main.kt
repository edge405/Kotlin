package Day1.Problem_4

fun main() {
    val inventory = Inventory()

    inventory.addProduct("Laptop", 999.99, 5)
    inventory.addProduct("Phone", 599.99, 10)

    println(inventory.listProducts())
    // Output: ["Laptop: 999.99 (5)", "Phone: 599.99 (10)"]

    inventory.updateQuantity("Laptop", 3)

    println(inventory.listProducts())
    // Output: ["Laptop: 999.99 (3)", "Phone: 599.99 (10)"]

    val totalValue = inventory.getTotalValue()
    println(totalValue)
    // Output: 8999.869999999999
}