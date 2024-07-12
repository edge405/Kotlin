
---

### Problem Statement

Create a program that manages a collection of movies. The program should allow users to add new movies, list all movies, and search for movies by title or director. Each movie should have a title, director, release year, and rating.

### Requirements

1. **Movie Class**:
    - Properties:
        - `title`: String
        - `director`: String
        - `year`: Int
        - `rating`: Double
    - Constructor:
        - Initialize the properties with the provided values.
    - Methods:
        - `toString()`: Returns a string representation of the movie in the format "Title (Year) - Director: [Director], Rating: [Rating]".

2. **MovieCollection Class**:
    - Properties:
        - `movies`: MutableList<Movie> (initialize as an empty list)
    - Methods:
        - `addMovie(movie: Movie)`: Adds a new movie to the collection.
        - `listMovies()`: Prints all movies in the collection.
        - `searchByTitle(title: String)`: Prints all movies that contain the given title (case-insensitive).
        - `searchByDirector(director: String)`: Prints all movies directed by the given director (case-insensitive).

### Instructions

1. Implement the `Movie` class.
2. Implement the `MovieCollection` class.
3. Create a `main` function to demonstrate the usage of the `MovieCollection` class:
    - Add at least 3 movies to the collection.
    - List all movies.
    - Search for movies by title.
    - Search for movies by director.

### Example

```kotlin
fun main() {
    val movieCollection = MovieCollection()

    val movie1 = Movie("Inception", "Christopher Nolan", 2010, 8.8)
    val movie2 = Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, 8.7)
    val movie3 = Movie("Interstellar", "Christopher Nolan", 2014, 8.6)

    movieCollection.addMovie(movie1)
    movieCollection.addMovie(movie2)
    movieCollection.addMovie(movie3)

    println("All Movies:")
    movieCollection.listMovies()

    println("\nSearch by Title 'Inception':")
    movieCollection.searchByTitle("Inception")

    println("\nSearch by Director 'Christopher Nolan':")
    movieCollection.searchByDirector("Christopher Nolan")
}
```

### Expected Output

```
All Movies:
Inception (2010) - Director: Christopher Nolan, Rating: 8.8
The Matrix (1999) - Director: Lana Wachowski, Lilly Wachowski, Rating: 8.7
Interstellar (2014) - Director: Christopher Nolan, Rating: 8.6

Search by Title 'Inception':
Inception (2010) - Director: Christopher Nolan, Rating: 8.8

Search by Director 'Christopher Nolan':
Inception (2010) - Director: Christopher Nolan, Rating: 8.8
Interstellar (2014) - Director: Christopher Nolan, Rating: 8.6
```

---

This problem covers object-oriented programming principles, including class design, object instantiation, method creation, and string manipulation in Kotlin.