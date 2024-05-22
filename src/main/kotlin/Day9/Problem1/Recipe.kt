package Day9.Problem1

class Recipe(
    val title: String,
    val ingredients: MutableList<String> = mutableListOf(),
    val instructions: MutableList<String> = mutableListOf(),
    val categories: MutableList<String> = mutableListOf()
) {
    fun addIngredient(ingredient: String){
        ingredients.add(ingredient)
    }
    fun addInstruction(instruction: String){
        instructions.add(instruction)
    }
    fun addCategory(category: String){
        categories.add(category)
    }
}