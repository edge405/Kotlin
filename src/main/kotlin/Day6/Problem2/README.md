### Problem: Product Inventory Management System

You are tasked with creating a simplified product inventory management system. The system should allow adding products, updating product quantities, and listing all products with their details. Each product has a unique ID, a name, a price, and a quantity.

#### Requirements:
1. Implement a data class `Product` with the following properties:
    - `id`: Int (unique identifier for the product)
    - `name`: String
    - `price`: Double
    - `quantity`: Int

2. Implement a class `InventoryManager` with the following methods:
    - `addProduct(name: String, price: Double, quantity: Int)`: Adds a new product to the inventory.
    - `updateQuantity(id: Int, quantity: Int)`: Updates the quantity of the specified product.
    - `getAllProducts()`: Returns a list of all products in the inventory.

#### Example Usage:

```kotlin
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
```

### Explanation of Methods:
1. **`addProduct(name: String, price: Double, quantity: Int)`**: Adds a new product with the given name, price, and quantity to the inventory. Each product gets a unique ID.
2. **`updateQuantity(id: Int, quantity: Int)`**: Updates the quantity of the specified product with the given ID.
3. **`getAllProducts()`**: Returns a list of all products in the inventory.

This problem simulates a simple product inventory management system, allowing you to practice object-oriented programming and basic list management in Kotlin.

## Comment:
Dang this problem is too easy