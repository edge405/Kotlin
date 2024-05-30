package Day16.Problem1

fun main() {

    val items = mapOf(
        "S" to 30, // Soda
        "C" to 20, // Chips
        "Y" to 15  // Candy
    )

    var runningTotal = 0.0

    while (true) {
        println("Welcome to the Vending Machine!")
        println("Available items:")
        items.forEach { (code, price) -> println("$code - ₱$price") }

        print("Enter your choice: ")
        val itemCode = readLine()?.uppercase() ?: ""
        if (itemCode !in items.keys) {
            println("Invalid item code. Try again")
            continue
        }

        val itemPrice = items[itemCode]!!
        println("You chose $itemCode (₱$itemPrice).")

        while (runningTotal < itemPrice) {
            print("Please insert money: ")
            val moneyStr = readLine() ?: ""
            val money = try {
                moneyStr.toDouble()
            } catch (e: NumberFormatException) {
                0.0
            }

            if (money <= 0) {
                println("Invalid amount, It should be a positive number")
                continue
            }

            runningTotal += money
            println("Current total: ₱$runningTotal")
        }

        val change = runningTotal - itemPrice
        println("Dispensing $itemCode.")
        if (change > 0.0) {
            println("Your change is ₱$change.")
        }

        runningTotal = 0.0
        break
    }

    println("Thanks for using the Vending Machine")
}
