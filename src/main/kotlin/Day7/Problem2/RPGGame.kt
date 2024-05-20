package Day7.Problem2

import kotlin.random.Random

class RPGGame {
    private val characters = mutableListOf<Character>()

    // Method to create a new character and add it to the game
    fun createCharacter(charClass: String, name: String) {
        val character = Character(name, charClass)
        characters.add(character)
    }

    // Method to simulate exploring a location and encountering enemies
    fun explore(location: String) {
        println("Exploring $location...")
        val enemyCount = Random.nextInt(1, 4) // Simulate encountering 1 to 3 enemies
        println("Encountered $enemyCount enemies!")

        // Simulate battles with enemies
        repeat(enemyCount) {
            val enemy = createEnemy()
            println("Battle: ${characters[0].name} vs ${enemy.name}")
            simulateBattle(characters[0], enemy)
        }
    }

    // Method to create a random enemy for battles
    private fun createEnemy(): Character {
        val enemyClasses = listOf("Goblin", "Skeleton", "Orc")
        val enemyClass = enemyClasses.random()
        return Character("$enemyClass ${Random.nextInt(1, 100)}", enemyClass)
    }

    // Method to simulate a battle between two characters
    private fun simulateBattle(player: Character, enemy: Character) {
        while (player.health > 0 && enemy.health > 0) {
            // Player attacks enemy
            val playerDamage = Random.nextInt(1, player.attackPower)
            println("${player.name} attacks ${enemy.name} for $playerDamage damage!")
            enemy.health -= playerDamage
            if (enemy.health <= 0) {
                println("${enemy.name} defeated!")
                player.experiencePoints += 10
                break
            }

            // Enemy attacks player
            val enemyDamage = Random.nextInt(1, enemy.attackPower)
            println("${enemy.name} attacks ${player.name} for $enemyDamage damage!")
            player.health -= enemyDamage
            if (player.health <= 0) {
                println("${player.name} defeated! Game Over!")
                break
            }
        }
    }

    // Method to level up characters based on experience points
    fun levelUpCharacters() {
        characters.forEach { character ->
            if (character.experiencePoints >= 100) {
                character.level++
                character.health += 50
                character.attackPower += 10
                character.experiencePoints -= 100
                println("${character.name} leveled up to level ${character.level}!")
            }
        }
    }

    // Method to display details of all characters
    fun displayCharacterDetails() {
        println("Character Details:")
        characters.forEach { character ->
            println("${character.name} - Class: ${character.charClass}, Level: ${character.level}, " +
                    "Health: ${character.health}, Attack Power: ${character.attackPower}, " +
                    "Experience Points: ${character.experiencePoints}")
        }
    }

    // Method to simulate a battle between the player's character and enemies
    fun battle() {
        val player = characters[0]
        println("Battle Begins!")
        val enemies = mutableListOf<Character>()
        repeat(Random.nextInt(1, 4)) {
            enemies.add(createEnemy())
        }
        for (enemy in enemies) {
            simulateBattle(player, enemy)
        }
        println("Battle Ends!")
    }

    // Method to simulate purchasing items from a shop
    fun buyItems(playerName: String) {
        val player = characters.find { it.name == playerName }
        if (player != null) {
            // Simulate buying items
            println("Items purchased for ${player.name}!")
            player.health += 20
            player.attackPower += 5
        } else {
            println("Player not found!")
        }
    }
}