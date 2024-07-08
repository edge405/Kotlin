package Day41

fun findConnectedComponents(graph: Map<Int, List<Int>>): List<List<Int>> {
    val visited = mutableSetOf<Int>()
    val components = mutableListOf<List<Int>>()

    for (node in graph.keys) {
        if (node !in visited) {
            val component = mutableListOf<Int>()
            dfs(node, graph, visited, component)
            components.add(component)
        }
    }

    return components
}

fun dfs(node: Int, graph: Map<Int, List<Int>>, visited: MutableSet<Int>, component: MutableList<Int>) {
    visited.add(node)
    component.add(node)
    for (neighbor in graph[node] ?: emptyList()) {
        if (neighbor !in visited) {
            dfs(neighbor, graph, visited, component)
        }
    }
}

fun main() {
    val graph = mapOf(
        0 to listOf(1, 2),
        1 to listOf(0),
        2 to listOf(0),
        3 to listOf(4),
        4 to listOf(3)
    )

    val connectedComponents = findConnectedComponents(graph)
    println(connectedComponents)
}
