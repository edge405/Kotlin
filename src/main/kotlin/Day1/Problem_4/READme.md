## Problem: Product Inventory Management
class Inventory in Kotlin to manage a collection of products. Each product has a name (String), price (Double), and quantity (Int). Your class should support adding products, updating product quantities, listing all products, and calculating the total value of the inventory.

### Requirements:
Data Class:

*Product(name: String, price: Double, quantity: Int)*
#### Class: Inventory

Methods:
* fun addProduct(name: String, price: Double, quantity: Int): Adds a new product to the inventory.
* fun updateQuantity(name: String, quantity: Int): Boolean: Updates the quantity of a product. Returns true if the product exists and the quantity is updated, otherwise false.
* fun listProducts(): List<String>: Returns a list of products with their details formatted as "Name: Price (Quantity)".
* fun getTotalValue(): Double: Calculates and returns the total value of the inventory (sum of price * quantity for all products).
