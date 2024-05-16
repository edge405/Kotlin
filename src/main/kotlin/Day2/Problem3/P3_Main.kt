package Day2.Problem3

fun main() {
    // Initialize the shopping system
    val shoppingSystem = ShoppingSystem()

    // Add products to the system
    shoppingSystem.addProduct("P001", "Laptop", 999.99)
    shoppingSystem.addProduct("P002", "Smartphone", 699.99)
    shoppingSystem.addProduct("P003", "Headphones", 99.99)

    // Register users
    shoppingSystem.registerUser("U001", "Alice", "alice@example.com")
    shoppingSystem.registerUser("U002", "Bob", "bob@example.com")

    // Alice browses products
    shoppingSystem.browseProducts()

    // Alice adds products to her cart
    shoppingSystem.addToCart("P001", "U001")
    shoppingSystem.addToCart("P002", "U001")

    // Alice places an order
    shoppingSystem.placeOrder("U001")

    // Bob browses products
    shoppingSystem.browseProducts()

    // Bob adds products to his cart
    shoppingSystem.addToCart("P002", "U002")

    // Bob places an order
    shoppingSystem.placeOrder("U002")

    // View Alice's order history
    shoppingSystem.viewOrderHistory("U001")

    // View Bob's order history
    shoppingSystem.viewOrderHistory("U002")
}