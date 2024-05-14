import Day1.Problem_1.ExpenseTracker

fun main(){
    val tracker = ExpenseTracker()

    tracker.addExpense("Coffee", 2.50)
    tracker.addExpense("Books", 30.00)

    println(tracker.listExpenses())
    // Output: ["Coffee: $2.50", "Books: $30.00"]

    val removed = tracker.removeExpense("Coffee")
    println(removed)
    // Output: true

    println(tracker.listExpenses())
    // Output: ["Books: $30.00"]

    val notRemoved = tracker.removeExpense("Tea")
    println(notRemoved)

}