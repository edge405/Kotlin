package Day2.Problem4

fun main() {
    val restaurant = RestaurantManagementSystem()
    restaurant.addMenuItem("Pizza", 12.99)
    restaurant.addMenuItem("Burger", 8.99)
    restaurant.addMenuItem("Salad", 6.99)
    restaurant.addTable("T1", 4)
    restaurant.addTable("T2", 6)

    restaurant.displayMenu()
    restaurant.displayTables()

    restaurant.takeOrder("T1", listOf(MenuItem("M1", "Pizza", 12.99), MenuItem("M2", "Salad", 6.99)))
    restaurant.takeOrder("T2", listOf(MenuItem("M1", "Pizza", 12.99), MenuItem("M3", "Burger", 8.99)))

    restaurant.calculateBill("T1")
    restaurant.calculateBill("T2")

    restaurant.reserveTable("T1")
    restaurant.displayTables()

    restaurant.cancelReservation("T1")
    restaurant.displayTables()
}