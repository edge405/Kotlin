package Day38

fun romanNumeral(num: Int): String {
    val romanNumerals = arrayOf(
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    )
    val values = arrayOf(
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    )

    var number = num
    val result = StringBuilder()

    for (i in values.indices) {
        while (number >= values[i]) {
            number -= values[i]
            result.append(romanNumerals[i])
        }
    }

    return result.toString()
}

fun main() {
    println(romanNumeral(3))
    println(romanNumeral(4))
    println(romanNumeral(9))
    println(romanNumeral(58))
    println(romanNumeral(1994))
}
