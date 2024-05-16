package Day2.Problem2

class CarRentalSystem {
    val cars = mutableListOf<Car>()
    val customers = mutableListOf<Customer>()

    fun addCar(licensePlate: String, model: String){
        cars.add(Car(licensePlate, model, null))
    }
    fun registerCustomer(id: String, name: String){
        customers.add(Customer(id, name))
    }
    fun rentCar(licensePlate: String, customerId: String){
        val car = cars.find { it.licensePlate == licensePlate && it.rentedTo == null }
        val customer = customers.find { it.id == customerId }
        if (car != null && customer != null) {
            car.rentedTo = customer
            println("Car ${car.licensePlate} rented to ${customer.name}.")
        } else {
            println("Car rental failed. Either the car is not available or the customer ID is incorrect.")
        }
    }
    fun returnCar(licensePlate: String){
        val car = cars.find { it.licensePlate == licensePlate && it.rentedTo != null }
        if (car != null) {
            println("Car ${car.licensePlate} returned by ${car.rentedTo?.name}.")
            car.rentedTo = null
        } else {
            println("Car return failed. Either the car was not rented or the license plate is incorrect.")
        }
    }
    fun printReport(){
        println("Car Report:")
        for (car in cars) {
            val rentalStatus = if (car.rentedTo != null) "Rented to ${car.rentedTo?.name}" else "Available"
            println("Car: ${car.licensePlate}, Model: ${car.model}, Status: $rentalStatus")
        }
    }
}