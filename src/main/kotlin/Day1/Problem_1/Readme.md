I ask chatgpt to generate a kotlin problem and here's the response:

    Problem: Expense Tracker
    Implement a class ExpenseTracker in Kotlin to manage a list of expenses. Each expense has a description (String) and an amount (Double). Your class should support adding, removing, and listing expenses.

    Requirements:

    Data Class:
    Expense(description: String, amount: Double)

    Class: ExpenseTracker
    Methods:
    fun addExpense(description: String, amount: Double): Adds a new expense.
    fun removeExpense(description: String): Boolean: Removes an expense by description, returns true if removed, otherwise false.
    fun listExpenses(): List<String>: Returns a list of expenses as strings formatted "Description: $Amount".
