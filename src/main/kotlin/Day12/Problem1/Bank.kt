package Day12.Problem1

class Bank {
    private val accounts = mutableListOf<BankAccount>()
    private var nextAccountNumber = 1

    fun createAccount(accountHolder: String, initialDeposit: Double) {
        if (initialDeposit >= 0) {
            val account = BankAccount(nextAccountNumber++, accountHolder, initialDeposit)
            accounts.add(account)
            println("Account created for $accountHolder with account number ${account.accountNumber}")
        } else {
            println("Initial deposit must be non-negative.")
        }
    }

    fun deposit(accountNumber: Int, amount: Double) {
        val account = findAccount(accountNumber)
        account?.deposit(amount) ?: println("Account number $accountNumber not found.")
    }

    fun withdraw(accountNumber: Int, amount: Double) {
        val account = findAccount(accountNumber)
        account?.withdraw(amount) ?: println("Account number $accountNumber not found.")
    }

    fun checkBalance(accountNumber: Int) {
        val account = findAccount(accountNumber)
        if (account != null) {
            println("Balance for account $accountNumber: $${account.balance}")
        } else {
            println("Account number $accountNumber not found.")
        }
    }

    fun displayAllAccounts() {
        if (accounts.isEmpty()) {
            println("No accounts in the bank.")
        } else {
            println("All accounts in the bank:")
            accounts.forEach { it.displayAccountDetails() }
        }
    }

    private fun findAccount(accountNumber: Int): BankAccount? {
        return accounts.find { it.accountNumber == accountNumber }
    }
}
