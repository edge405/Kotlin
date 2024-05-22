package Day8.Problem2

class OnlineMarketplace {
    private val users = mutableListOf<User>()
    private val items = mutableListOf<Item>()

    fun createUser(username: String, name: String): User{
        val user = User(username = username, name = name)
        users.add(user)
        return user
    }
    fun listItemForSale(
        user: User,
        itemId: String,
        name: String,
        description: String,
        price: Double
    ){
        val item = Item(itemId, name, description, price)
        user.addItemsForSale(item)
        items.add(item)
    }
    fun browseItem(): List<Item>{
        return items
    }
    fun purchaseItem(buyer: User, itemId: String){
        val item = items.find { it.itemId == itemId }
        if(item != null && buyer.balance >= item.price){
            buyer.purchasedItem.add(item)
            val seller = users.find { it.itemsForSale.contains(item) }
            seller?.balance = seller?.balance?.plus(item.price) ?: 0.0
            seller?.itemsForSale?.remove(item)
            items.remove(item)
        }
    }
    fun displayUserDetails(user: User) {
        println("Username: ${user.username}")
        println("Name: ${user.name}")
        println("Balance: ${user.balance}")
        println("Items for Sale: ${user.itemsForSale.map { it.name }}")
        println("Purchased Items: ${user.purchasedItem.map { it.name }}")
    }
}