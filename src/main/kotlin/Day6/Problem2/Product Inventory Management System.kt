package Day6.Problem2

fun main() {
    val inventoryManager = InventoryManager()

    inventoryManager.addProduct("Laptop", 999.99, 10)
    inventoryManager.addProduct("Smartphone", 599.99, 20)
    inventoryManager.addProduct("Headphones", 99.99, 50)

    println("All Products: ${inventoryManager.getAllProducts()}")
    // Expected: [Product(id=1, name="Laptop", price=999.99, quantity=10), Product(id=2, name="Smartphone", price=599.99, quantity=20), Product(id=3, name="Headphones", price=99.99, quantity=50)]

    inventoryManager.updateQuantity(2, 5)
    println("Updated Products: ${inventoryManager.getAllProducts()}")
    // Expected: [Product(id=1, name="Laptop", price=999.99, quantity=10), Product(id=2, name="Smartphone", price=599.99, quantity=25), Product(id=3, name="Headphones", price=99.99, quantity=50)]
}
