package Day2.Problem4

class RestaurantManagementSystem {
    private val menuItems = mutableListOf<MenuItem>()
    private val orders = mutableMapOf<String, Order>()
    private val tables = mutableMapOf<String, Table>()

    fun addMenuItem(name: String, price: Double) {
        val id = "M${menuItems.size + 1}"
        menuItems.add(MenuItem(id, name, price))
        println("Menu item added: $name - $price")
    }

    fun takeOrder(tableId: String, orderItems: List<MenuItem>) {
        val table = tables[tableId]
        if (table != null) {
            val order = Order("O${orders.size + 1}", orderItems)
            orders[tableId] = order
            println("Order taken for table $tableId")
        } else {
            println("Invalid table ID.")
        }
    }

    fun calculateBill(tableId: String): Double {
        val order = orders[tableId]
        return if (order != null) {
            val totalBill = order.items.sumByDouble { it.price }
            println("Bill for table $tableId: $totalBill")
            totalBill
        } else {
            println("No order found for table $tableId")
            0.0
        }
    }

    fun reserveTable(tableId: String) {
        val table = tables[tableId]
        if (table != null) {
            table.reserved = true
            println("Table $tableId reserved.")
        } else {
            println("Invalid table ID.")
        }
    }

    fun cancelReservation(tableId: String) {
        val table = tables[tableId]
        if (table != null) {
            table.reserved = false
            println("Reservation canceled for table $tableId.")
        } else {
            println("Invalid table ID.")
        }
    }

    fun addTable(tableId: String, capacity: Int) {
        tables[tableId] = Table(tableId, capacity, false)
        println("Table added: $tableId - Capacity: $capacity")
    }

    fun displayMenu() {
        println("Menu Items:")
        for (menuItem in menuItems) {
            println("${menuItem.id}: ${menuItem.name} - ${menuItem.price}")
        }
    }

    fun displayTables() {
        println("Tables:")
        for ((id, table) in tables) {
            val status = if (table.reserved) "Reserved" else "Available"
            println("$id: Capacity - ${table.capacity}, Status - $status")
        }
    }
}