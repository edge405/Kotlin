package Day1.Problem_2

class Library {
    val books = mutableListOf<Book>()

    fun addBook(title: String, author: String, date: Int){
        books.add(Book(title, author, date))
    }

    fun removeBook(title: String): Boolean{
        val iterator = books.iterator()
        while(iterator.hasNext()){
            val b = iterator.next()
            if(b.title == title){
                iterator.remove()
                println("Successfully remove $title")
                return true;
            }
        }
        return false;
    }

    fun listBooks(): List<String>{
        return books.map{
            "Title: ${it.title} Author: ${it.author} Date: ${it.author}"
        }
    }
}