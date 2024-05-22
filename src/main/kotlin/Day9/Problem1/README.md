### Problem: Recipe Management System

You are tasked with developing a recipe management system that allows users to create, view, and search for recipes. The system should provide functionalities for managing recipes, including adding ingredients, instructions, and categories.

#### Requirements:

1. **Recipe Class**:
    - **Attributes**:
        - `title: String`
        - `ingredients: MutableList<String>`
        - `instructions: MutableList<String>`
        - `categories: MutableList<String>`
    - **Methods**:
        - `addIngredient(ingredient: String)`: Add an ingredient to the recipe.
        - `addInstruction(instruction: String)`: Add an instruction to the recipe.
        - `addCategory(category: String)`: Add a category to the recipe.

2. **Recipe Management System Class**:
    - **Attributes**:
        - `recipes: MutableList<Recipe>`
    - **Methods**:
        - `createRecipe(title: String): Recipe`: Create a new recipe with the given title and add it to the system.
        - `getRecipe(title: String): Recipe?`: Retrieve a recipe by its title.
        - `searchRecipes(query: String): List<Recipe>`: Search for recipes containing the given query string in their titles, ingredients, instructions, or categories.

#### Example Usage:
```kotlin
fun main() {
    val recipeManager = RecipeManagementSystem()

    // Create recipes
    val recipe1 = recipeManager.createRecipe("Pasta Carbonara")
    recipe1.addIngredient("Spaghetti")
    recipe1.addIngredient("Bacon")
    recipe1.addIngredient("Eggs")
    recipe1.addIngredient("Parmesan cheese")
    recipe1.addInstruction("Cook spaghetti according to package instructions.")
    recipe1.addInstruction("Fry bacon until crispy.")
    recipe1.addInstruction("Whisk eggs and Parmesan cheese together.")
    recipe1.addInstruction("Toss cooked spaghetti with bacon and egg mixture.")
    recipe1.addCategory("Italian")
    recipe1.addCategory("Main Course")

    val recipe2 = recipeManager.createRecipe("Chicken Stir-Fry")
    recipe2.addIngredient("Chicken breast")
    recipe2.addIngredient("Bell peppers")
    recipe2.addIngredient("Broccoli")
    recipe2.addIngredient("Soy sauce")
    recipe2.addInstruction("Slice chicken breast into thin strips.")
    recipe2.addInstruction("Stir-fry chicken until cooked.")
    recipe2.addInstruction("Add sliced bell peppers and broccoli.")
    recipe2.addInstruction("Season with soy sauce and cook until vegetables are tender.")
    recipe2.addCategory("Asian")
    recipe2.addCategory("Main Course")

    // Search for recipes
    val searchResults = recipeManager.searchRecipes("pasta")
    println("Search Results:")
    searchResults.forEach { recipe ->
        println("Title: ${recipe.title}, Ingredients: ${recipe.ingredients}, Instructions: ${recipe.instructions}, Categories: ${recipe.categories}")
    }

    // Search for recipes by category
    val categoryResults = recipeManager.searchRecipes("Main Course")
    println("\nCategory Search Results:")
    categoryResults.forEach { recipe ->
        println("Title: ${recipe.title}, Ingredients: ${recipe.ingredients}, Instructions: ${recipe.instructions}, Categories: ${recipe.categories}")
    }
}
```
This problem challenges you to create a recipe management system with functionalities for creating recipes, adding ingredients and instructions, and searching for recipes based on title, ingredients, or categories. It allows you to practice object-oriented programming, managing collections, and implementing search functionalities in Kotlin.

### LOOL I almost got this problem! I've actually confused by searchRecipes method in RecipeManagementSystem class. I'm finding method that fits to this problem but I don't find any, I'm stuck to this problem for 20mins so I asked chatgpt to do it, I've found out that *".filter()"* method is suitable for this problem. It's amazing lol, simple and concise. I frkin love kotlin!! *(for now lol)*