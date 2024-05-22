package Day8.Problem2

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
    val itemsForSale = marketplace.browseItem()
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