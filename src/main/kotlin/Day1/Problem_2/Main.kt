package Day1.Problem_2

fun main() {
    val library = Library()

    library.addBook("1984", "George Orwell", 1949)
    library.addBook("To Kill a Mockingbird", "Harper Lee", 1960)

    println(library.listBooks())
    // Output: ["1984 by George Orwell (1949)", "To Kill a Mockingbird by Harper Lee (1960)"]

    val removed = library.removeBook("1984")
    println(removed)
    // Output: true

    println(library.listBooks())
    // Output: ["To Kill a Mockingbird by Harper Lee (1960)"]

    val notRemoved = library.removeBook("Brave New World")
    println(notRemoved)
    // Output: false
}