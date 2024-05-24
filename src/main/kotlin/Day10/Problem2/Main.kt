package Day10.Problem2

fun main() {
    val library = Library()

    // Add books to the library
    library.addBook(Book("978-0134685991", "Effective Java", "Joshua Bloch"))
    library.addBook(Book("978-0201633610", "Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"))
    library.addBook(Book("978-0132350884", "Clean Code", "Robert C. Martin"))

    // Register users
    library.registerUser(User("u001", "Alice"))
    library.registerUser(User("u002", "Bob"))

    // Borrow books
    library.borrowBook("u001", "978-0134685991") // Alice borrows "Effective Java"
    library.borrowBook("u002", "978-0132350884") // Bob borrows "Clean Code"

    // View available books
    val availableBooks = library.viewAvailableBooks()
    println("Available Books: $availableBooks")

    // Return books
    library.returnBook("u001", "978-0134685991") // Alice returns "Effective Java"

    // View available books again
    val availableBooksAfterReturn = library.viewAvailableBooks()
    println("Available Books after return: $availableBooksAfterReturn")
}