package Day9.Problem1

class RecipeManagementSystem {
    val recipes = mutableListOf<Recipe>()

    fun createRecipe(title: String): Recipe{
        val recipe = Recipe(title = title)
        recipes.add(recipe)
        return recipe
    }
    fun getRecipe(title: String): Recipe?{
        return recipes.find { it.title == title }
    }
    fun searchRecipes(query: String): List<Recipe>{
        return recipes.filter { recipe ->
            recipe.title.contains(query, ignoreCase = true) ||
                    recipe.ingredients.any { it.contains(query, ignoreCase = true) } ||
                    recipe.instructions.any { it.contains(query, ignoreCase = true) } ||
                    recipe.categories.any { it.contains(query, ignoreCase = true) }
        }
    }
}