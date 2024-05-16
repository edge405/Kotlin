package Day2.Problem2

fun main() {
    // Initialize the car rental system
    val carRentalSystem = CarRentalSystem()

    // Add cars to the fleet
    carRentalSystem.addCar("ABC123", "Toyota Camry")
    carRentalSystem.addCar("XYZ789", "Honda Accord")
    carRentalSystem.addCar("LMN456", "Ford Mustang")

    // Register customers
    carRentalSystem.registerCustomer("C001", "Alice Johnson")
    carRentalSystem.registerCustomer("C002", "Bob Smith")

    // Rent a car to a customer
    carRentalSystem.rentCar("ABC123", "C001")

    // Print report
    carRentalSystem.printReport()

    // Return a car from a customer
    carRentalSystem.returnCar("ABC123")

    // Print report again
    carRentalSystem.printReport()
}