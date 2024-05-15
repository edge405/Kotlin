package Day1.Problem_5

fun main() {
    val account = BankAccount("123456789", 1000.0, "John Doe")

    println(account.displayDetails())
    println(account.getBalance())

    account.deposit(500.0)
    println(account.getBalance())

    val withdrawn = account.withdraw(700.0)
    println(withdrawn)

    println(account.getBalance())

    val insufficientFunds = account.withdraw(1000.0)
    println(insufficientFunds)
}