package Day1.Problem_1

class ExpenseTracker {
    val expenses = mutableListOf<Expense>()

    fun addExpense(description: String, amount: Double){
        expenses.add(Expense(description, amount))
    }

    fun removeExpense(description: String): Boolean {
        val iterator = expenses.iterator()
        while (iterator.hasNext()) {
            val expense = iterator.next()
            if (expense.description == description) {
                iterator.remove()
                return true
            }
        }
        return false
    }

    fun listExpenses(): List<String> {
        return expenses.map { "${it.description}: $${"%.2f".format(it.amount)}" }
    }
}