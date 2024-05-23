package Day10.Problem1

data class Goal(
    val description: String,
    val targetDate: String,
    var isArchived: Boolean = false
){
    fun markArchived(){
        isArchived = true
    }
}