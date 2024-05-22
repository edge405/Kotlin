package Day9.Problem1

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