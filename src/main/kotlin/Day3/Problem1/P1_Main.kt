package Day3.Problem1

fun main() {
    val hotelSystem = HotelManagementSystem()

    // Add rooms to the hotel
    hotelSystem.addRoom("101", "Single", 50.0)
    hotelSystem.addRoom("102", "Double", 80.0)
    hotelSystem.addRoom("103", "Suite", 120.0)

    // Register customers
    hotelSystem.registerCustomer("C001", "Alice", "alice@example.com")
    hotelSystem.registerCustomer("C002", "Bob", "bob@example.com")

    // Book rooms for customers
    hotelSystem.bookRoom("B001", "101", "C001", "2024-05-20", "2024-05-22")
    hotelSystem.bookRoom("B002", "102", "C002", "2024-05-21", "2024-05-25")

    // Check-in and check-out customers
    hotelSystem.checkIn("B001")
    hotelSystem.checkOut("B001")

    // Calculate bill for completed stay
    val bill = hotelSystem.calculateBill("B002")
    println("Total Bill for Booking B002: $$bill")
}