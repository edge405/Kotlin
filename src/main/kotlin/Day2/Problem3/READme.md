### Problem: Online Shopping System

You need to create an online shopping system. The system will allow users to browse products, add them to their cart,
place orders, and view order history.

#### Requirements:

Product Data Class:

Create a Product data class with the following properties:

* id: String
* name: String
* price: Double

#### User Data Class:

Create a User data class with the following properties:

* id: String
* name: String
* email: String

#### ShoppingSystem Class:

Functions:

* addProduct(name: String, price: Double): Adds a new product to the system.
* registerUser(name: String, email: String): Registers a new user.
* browseProducts(): Displays all available products.
* addToCart(productId: String, userId: String): Adds a product to the user's cart.
* placeOrder(userId: String): Places an order for all items in the user's cart.
* viewOrderHistory(userId: String): Displays the order history of a user.

#### Reflection:

LOL I ask ChatGPT to generate more complicated problem and it gave me this :(( HAHAHAH. It indeed complicated problem,
damn I can't solved it on my own. It becomes complicated because there's a mutableMapOf which is new to me, I've already
study that in java but I can't still catch up. It's okay I think I'm gonna learn more about HashMap in kotlin and
practice coding. I've been solving this problem for 1hour for now then after that I ask chatgpt to solve it, The
solution is actually mind blowing I mean I understand the code but the coding style is too damn good which it gives me
good insight about how to structure a code more maintainable and easy to understand