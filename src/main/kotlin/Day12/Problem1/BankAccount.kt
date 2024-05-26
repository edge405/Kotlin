package Day12.Problem1

class BankAccount(val accountNumber: Int, val accountHolder: String, var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount into account $accountNumber. New balance: $$balance")
        } else {
            println("Invalid deposit amount: $$amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $$amount from account $accountNumber. New balance: $$balance")
        } else {
            println("Invalid withdrawal amount or insufficient balance: $$amount")
        }
    }

    fun displayAccountDetails() {
        println("Account Number: $accountNumber, Account Holder: $accountHolder, Balance: $$balance")
    }
}