# Problem: Library Book Management
Implement a class Library in Kotlin to manage a collection of books. Each book has a title (String), author (String), and year of publication (Int). Your class should support adding books, removing books by title, and listing all books.

## Requirements:

## Data Class:

Book(title: String, author: String, year: Int)

## Class: Library
## Methods:

fun addBook(title: String, author: String, year: Int): Adds a new book.

fun removeBook(title: String): Boolean: Removes a book by title, returns true if removed, otherwise false.

fun listBooks(): List<String>: Returns a list of books as strings formatted "Title by Author (Year)".
