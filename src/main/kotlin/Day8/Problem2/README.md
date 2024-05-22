### Problem: Online Marketplace

You are tasked with developing a simple online marketplace where users can create accounts, list items for sale, and purchase items. The platform should provide basic functionalities for managing user accounts, listing items, browsing items, and handling purchases.

#### Requirements:

1. **User Account Management**:
    - **Class**: `User`
        - Attributes:
            - `username: String`
            - `name: String`
            - `balance: Double` (default is 0.0)
            - `itemsForSale: MutableList<Item>` (default is an empty list)
            - `purchasedItems: MutableList<Item>` (default is an empty list)
        - Methods:
            - `addItemForSale(item: Item)`: Add an item to the user's items for sale.
            - `purchaseItem(item: Item)`: Add an item to the user's purchased items and deduct the item's price from the user's balance.

2. **Listing Items for Sale**:
    - **Data Class**: `Item`
        - Attributes:
            - `itemId: String`
            - `name: String`
            - `description: String`
            - `price: Double`
        - No methods required.

3. **Online Marketplace Management**:
    - **Class**: `OnlineMarketplace`
        - Attributes:
            - `users: MutableList<User>` (default is an empty list)
            - `items: MutableList<Item>` (default is an empty list)
        - Methods:
            - `createUser(username: String, name: String): User`: Create a new user and add to the marketplace.
            - `listItemForSale(user: User, itemId: String, name: String, description: String, price: Double)`: Create a new item and add it to the user's items for sale.
            - `browseItems(): List<Item>`: Return a list of all items available for sale.
            - `purchaseItem(buyer: User, itemId: String)`: Facilitate the purchase of an item by a user.
            - `displayUserDetails(user: User)`: Display the details of a user.

#### Example Usage:
```kotlin
fun main() {
    val marketplace = OnlineMarketplace()

    // Create user accounts
    val user1 = marketplace.createUser("johndoe", "John Doe")
    val user2 = marketplace.createUser("janedoe", "Jane Doe")

    // Add balance to user accounts
    user1.balance = 100.0
    user2.balance = 200.0

    // User1 lists items for sale
    marketplace.listItemForSale(user1, "1", "Laptop", "A high-end gaming laptop", 150.0)
    marketplace.listItemForSale(user1, "2", "Headphones", "Noise-cancelling headphones", 50.0)

    // User2 lists items for sale
    marketplace.listItemForSale(user2, "3", "Smartphone", "Latest model smartphone", 300.0)

    // Browse all items listed for sale
    println("Items for Sale:")
    val itemsForSale = marketplace.browseItems()
    itemsForSale.forEach { item ->
        println("Item ID: ${item.itemId}, Name: ${item.name}, Price: ${item.price}")
    }

    // User2 purchases an item from User1
    marketplace.purchaseItem(user2, "1")

    // Display updated user details
    println("User Details After Purchase:")
    marketplace.displayUserDetails(user1)
    marketplace.displayUserDetails(user2)
}
```

This problem requires implementing the following classes and methods to simulate a basic online marketplace where users can interact by buying and selling items.

### // lil bit confusing but I got it :))