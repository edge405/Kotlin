### Problem: Car Rental System
You need to create a simple car rental system. The system will allow you to perform the following tasks:

* Add cars to the fleet.
* Register customers.
* Rent a car to a customer.
* Return a car from a customer.
* Print a report of all cars, showing their rental status and the customer renting them (if applicable).

##### Requirements:
Car Data Class:

Create a Car data class with the following properties:
* licensePlate: String
model: String
* rentedTo: Customer? (default value is null, meaning the car is available)
#### Customer Data Class:

Create a Customer data class with the following properties:
* id: String
* name: String
* CarRentalSystem Class:

#### Functions:
* addCar(licensePlate: String, model: String): Adds a new car to the fleet.
* registerCustomer(id: String, name: String): Registers a new customer.
* rentCar(licensePlate: String, customerId: String): Rents a car to a customer if the car is available.
* returnCar(licensePlate: String): Returns a car from a customer, making it available again.
* printReport(): Prints a report of all cars, showing their rental status and the customer renting them (if applicable).

#### Reflection:
This problem is actually nice! I haven't actually solve this problem on my own but with the help of AI I've gain some knowledge about it. My main programming language is java and I've build some project around it with the use of spring boot framework, etc. but I think kotlin might be better to use. I just realize that java have a much more boiler plate code compared to kotlin and this is why I love kotlin like there's no getter and setter you just have to create data class then you can do whatever you want just like in java but you have to put getters and setters in order to get and set the data