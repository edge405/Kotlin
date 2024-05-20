package Day7.Problem2

data class Character(
    val name: String,
    val charClass: String,
    var level: Int = 1,
    var health: Int = 100,
    var attackPower: Int = 10,
    var experiencePoints: Int = 0
)