Sure! Here's another problem for you:

### Problem: `Library Book Finder`

#### Problem Statement

You are tasked with creating a system to help users find books in a library. Each book has a title, author, and genre. Users can search for books by specifying a genre and a keyword that could be in the title or author’s name. The program should list all books that match the user's search criteria.

#### Input

The input consists of:
- An integer `b` (1 ≤ b ≤ 100) representing the number of books in the library.
- For each book, a string `title` (1 ≤ length of `title` ≤ 100), a string `author` (1 ≤ length of `author` ≤ 100), and a string `genre` (1 ≤ length of `genre` ≤ 50).
- An integer `q` (1 ≤ q ≤ 50) representing the number of queries.
- For each query, a string `genre` (1 ≤ length of `genre` ≤ 50) and a string `keyword` (1 ≤ length of `keyword` ≤ 50).

#### Output

For each query, display the list of books that match the criteria in the format:
```
Query [query_index]:
[book_title_1] by [book_author_1]
[book_title_2] by [book_author_2]
...
```
If no books match the criteria, display:
```
Query [query_index]:
No matching books found.
```

#### Example

**Input:**
```
5
Harry Potter J.K. Rowling Fantasy
The Hobbit J.R.R. Tolkien Fantasy
1984 George Orwell Dystopian
To Kill a Mockingbird Harper Lee Fiction
The Great Gatsby F. Scott Fitzgerald Fiction
3
Fantasy Potter
Fiction Scott
Dystopian Orwell
```

**Output:**
```
Query 1:
Harry Potter by J.K. Rowling
Query 2:
The Great Gatsby by F. Scott Fitzgerald
Query 3:
1984 by George Orwell
```
This problem will help you practice working with collections, string manipulation, and filtering in Kotlin.