package Day3.Problem3

fun main() {
    val inventory = mutableMapOf(
        "Vanilla" to 24,
        "Chocolate" to 14,
        "Strawberry" to 9,
    )
    val sales = mapOf("Vanilla" to 7, "Chocolate" to 4, "Strawberry" to 5)

    val shipments = mapOf("Chocolate" to 3, "Strawberry" to 7, "Rocky Road" to 5)

    with(inventory) {
        sales.forEach { merge(it.key, it.value, Int::minus) }
        shipments.forEach { merge(it.key, it.value, Int::plus) }
    }

    assertEquals(17, inventory["Vanilla"]) // 24 - 7 + 0
    assertEquals(13, inventory["Chocolate"]) // 14 - 4 + 3
    assertEquals(11, inventory["Strawberry"]) // 9 - 5 + 7
    assertEquals(5, inventory["Rocky Road"]) // 0 - 0 + 5
}

fun assertEquals(i: Int, i1: Int?) {
    if(i == i1){
        println("$i : $i1")
        println(true)
    }else{
        println(false)
    }
}
/**
 * This is not my code I've studying the hashmap documentation here : https://www.baeldung.com/kotlin/maps
 * I'm gonna display it here so that I can review it later, the documentation is actually good it refreshed my mind on how the hashmap works, but I'm gonna learn more about hashmap so that I can perform concisely when implementing the hashmap
 */