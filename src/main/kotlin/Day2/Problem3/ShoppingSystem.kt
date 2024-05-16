package Day2.Problem3

class ShoppingSystem {
    private val products = mutableListOf<Product>()
    private val users = mutableListOf<User>()
    private val cart = mutableMapOf<String, MutableList<Product>>()
    private val orders = mutableMapOf<String, MutableList<Product>>()

    fun addProduct(id: String, name: String, price: Double){
        products.add(Product(id, name, price))
    }
    fun registerUser(id: String, name: String, email: String){
        users.add(User(id, name, email))
    }
    fun browseProducts(){
        for(product in products){
            println("id: ${product.id}, name: ${product.name}, price: ${product.price}")
        }
    }
    fun addToCart(productId: String, userId: String){
        val product = products.find { it.id == productId }
        if(product!=null){
            cart.getOrPut(userId) { mutableListOf() }.add(product)
            println("${product.name} added to cart")
        } else {
            println("Product not found.")
        }

    }
    fun placeOrder(userId: String){
        val userCart = cart[userId]
        if (userCart != null && userCart.isNotEmpty()) {
            orders.getOrPut(userId) { mutableListOf() }.addAll(userCart)
            cart.remove(userId)
            println("Order placed successfully.")
        } else {
            println("Cart is empty.")
        }
    }
    fun viewOrderHistory(userId: String){
        val userOrders = orders[userId]
        if (userOrders != null && userOrders.isNotEmpty()) {
            println("Order History for ${users.find { it.id == userId }?.name}:")
            for ((index, order) in userOrders.withIndex()) {
                println("${index + 1}. ${order.name} - \$${order.price}")
            }
        } else {
            println("No order history found.")
        }
    }
}