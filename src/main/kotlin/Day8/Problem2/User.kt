package Day8.Problem2

class User(
    val username: String,
    val name: String,
    var balance: Double = 0.0,
    val itemsForSale: MutableList<Item> = mutableListOf(),
    val purchasedItem: MutableList<Item> = mutableListOf()
){
    fun addItemsForSale(item: Item){
        itemsForSale.add(item)
    }
    fun purchaseItem(item: Item){
        purchasedItem.add(item)
        balance -= item.price
    }
}