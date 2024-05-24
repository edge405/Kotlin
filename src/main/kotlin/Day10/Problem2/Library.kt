package Day10.Problem2

class Library {
    private val books = mutableListOf<Book>()
    private val users = mutableListOf<User>()

    fun addBook(book: Book){
        books.add(book)
    }
    fun registerUser(user: User){
        users.add(user)
    }
    fun borrowBook(userId: String, isbn: String): Boolean{
        val user = users.find { it.userId == userId }
        val book = books.find { it.isbn == isbn }
        if (book != null && user != null) {
            if(book.isAvailable){
                user.borrowedBooks.add(book)
                return true
            } else {
                println("Book is not available")
            }
        }
        return false
    }
    fun returnBook(userId: String, isbn: String): Boolean{
        val user = users.find { it.userId == userId }
        val book = books.find { it.isbn == isbn }
        user?.borrowedBooks?.forEach {
            if(it.isbn == isbn){
                book?.isAvailable = false
                return true
            } else {
                println("Book not found")
            }
        }
        return false
    }
    fun viewAvailableBooks(): List<Book>{
        return books.filter { it.isAvailable }
    }
}