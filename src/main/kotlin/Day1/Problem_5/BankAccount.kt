package Day1.Problem_5

class BankAccount(
    val accountNumber: String,
    var balance: Double,
    val accountHolderName: String
) {

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        }
        return false
    }

    fun getBalance(): Any {
        return balance
    }

    fun displayDetails(): String {
        return "Account Number: $accountNumber, Holder: $accountHolderName, Balance: $$balance"
    }
}