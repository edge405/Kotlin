package Day12.Problem1

fun main() {
    val bank = Bank()

    // Creating accounts
    bank.createAccount("Alice", 1000.0)
    bank.createAccount("Bob", 500.0)
    println()

    // Depositing money
    bank.deposit(1, 200.0)
    bank.deposit(2, 100.0)
    println()

    // Withdrawing money
    bank.withdraw(1, 300.0)
    bank.withdraw(2, 600.0)  // Should display an error for insufficient balance
    println()

    // Checking balance
    bank.checkBalance(1)
    bank.checkBalance(2)
    println()

    // Displaying all accounts
    bank.displayAllAccounts()
}