package Day7.Problem2

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