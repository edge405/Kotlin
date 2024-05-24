### Problem: Library Book Management System

You are tasked with developing a library book management system that allows users to borrow and return books, and for the library to keep track of which books are borrowed and available. The system should provide functionalities for managing book inventory, user accounts, borrowing books, returning books, and viewing the list of available books.

#### Requirements:

1. **Book Data Class**:
    - **Attributes**:
        - `isbn: String`
        - `title: String`
        - `author: String`
        - `isAvailable: Boolean` (default is true)

2. **User Data Class**:
    - **Attributes**:
        - `userId: String`
        - `name: String`
        - `borrowedBooks: MutableList<Book>`

3. **Library Class**:
    - **Attributes**:
        - `books: MutableList<Book>`
        - `users: MutableList<User>`
    - **Methods**:
        - `addBook(book: Book)`: Add a new book to the library's inventory.
        - `registerUser(user: User)`: Register a new user with the library.
        - `borrowBook(userId: String, isbn: String): Boolean`: Allow a user to borrow a book if it is available.
        - `returnBook(userId: String, isbn: String): Boolean`: Allow a user to return a borrowed book.
        - `viewAvailableBooks(): List<Book>`: View the list of available books.

### Example Usage:
```kotlin
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
```
##
#### I asked ChatGPT about my approach and says: *"Your approach to the library management system is a good start. However, there are a few issues and improvements needed in the code".* I guess this is true HAHAHAH it seems like my code are so fucking bad but it's a good start I want to learn more in lamda to make my code more concise and easy to understand