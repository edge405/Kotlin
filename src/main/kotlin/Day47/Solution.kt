package Day47

fun main() {

    val b = readLine()!!.toInt()
    val books = mutableListOf<Book>()

    repeat(b) {
        val input = readLine()!!.split(" ")
        val title = input.subList(0, input.size - 2).joinToString(" ")
        val author = input[input.size - 2]
        val genre = input.last()
        books.add(Book(title, author, genre))
    }

    val q = readLine()!!.toInt()

    repeat(q) { queryIndex ->
        val query = readLine()!!.split(" ")
        val genre = query[0]
        val keyword = query[1]

        val matchingBooks = books.filter {
            it.genre.equals(genre, ignoreCase = true) &&
                    (it.title.contains(keyword, ignoreCase = true) || it.author.contains(keyword, ignoreCase = true))
        }

        println("Query ${queryIndex + 1}:")
        if (matchingBooks.isEmpty()) {
            println("No matching books found.")
        } else {
            matchingBooks.forEach { println("${it.title} by ${it.author}") }
        }
    }
}
