### Problem: Text-Based RPG Game

You are tasked with developing a text-based RPG (Role-Playing Game) where players can create characters, explore different locations, engage in battles with enemies, and purchase items from a shop. The game should provide an immersive experience where players can progress their characters through leveling up and acquiring new gear.

#### Requirements:
1. **Character Creation**:
    - Players should be able to create characters with the following attributes:
        - Name: String
        - Class: String (e.g., Warrior, Mage, Archer)
        - Level: Int (default is 1)
        - Health: Int (default is 100)
        - Attack Power: Int (default is 10)
        - Experience Points (XP): Int (default is 0)

2. **Exploration**:
    - Players should be able to explore different locations in the game world.
    - Each location may have encounters with enemies, leading to battles.

3. **Battles**:
    - Implement a turn-based battle system where players can engage in battles with enemies.
    - Battles should involve attacks between the player's character and enemy characters.
    - Determine the winner based on their health points.

4. **Leveling Up**:
    - Characters gain experience points (XP) after winning battles.
    - Upon reaching a certain XP threshold, characters should level up, increasing their level, health, and attack power.

5. **Shop Interaction**:
    - Implement a shop where players can purchase items to improve their character's stats.
    - Allow players to buy items such as health potions or weapons.
    - Items purchased should enhance the player's health and attack power.

#### Example Usage:
```kotlin
fun main() {
    val game = RPGGame()

    // Create player characters
    game.createCharacter("Warrior", "Conan")
    game.createCharacter("Mage", "Merlin")

    // Explore locations and engage in battles
    game.explore("Forest")
    game.explore("Cave")
    game.explore("Castle")

    // Display character details after exploration
    game.displayCharacterDetails()

    // Simulate battles and gaining experience points
    repeat(3) {
        game.battle()
    }

    // Display updated character details after battles
    game.displayCharacterDetails()

    // Level up characters if they meet the XP threshold
    game.levelUpCharacters()

    // Simulate purchasing items from a shop
    game.buyItems("Conan")
    game.buyItems("Merlin")

    // Display final character details after shopping
    game.displayCharacterDetails()
}
```

This problem challenges you to create a text-based RPG game with various interactions, including character creation, exploration, battles, leveling up, and shopping for items. It allows you to practice object-oriented programming, game logic, and user interaction in Kotlin.

### Reflection:
I don't know what's going on here HAHAHA I think this is a simple algorithm for a game, am gonna review it later