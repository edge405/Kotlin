package Day6.Problem2

class InventoryManager {
    val products = mutableListOf<Product>()
    var counter = 0

    fun addProduct(name: String, price: Double, quantity: Int){
        counter++
        products.add(Product(counter, name, price, quantity))
    }
    fun updateQuantity(id: Int, quantity: Int){
        val product = products.find { it.id == id }
        if(product != null){
            product.quantity = quantity
        }
    }
    fun getAllProducts(): List<Product>{
        return products
    }
}