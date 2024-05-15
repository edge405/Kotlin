package Day1.Problem_4


class Inventory {
    val products = mutableListOf<Product>()

    fun addProduct(name: String, price: Double, quantity: Int){
        products.add(Product(name, price, quantity))
    }

    fun updateQuantity(name: String, quantity: Int): Boolean{
        val product = products.find { it.name == name }
        if(product != null){
         product.quantity = quantity
         return true
        }
        return false
    }

    fun listProducts(): List<String>{
        return products.map {
            "${it.name}: ${it.price} (${it.quantity})"
        }
    }

    fun getTotalValue(): Double{
        val total = products.sumByDouble { it.price * it.quantity }
        return total
    }
}