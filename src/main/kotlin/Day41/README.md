## Problem: Connected Components in an Undirected Graph

You are given an undirected graph represented by an adjacency list. Write a function to find all connected components in the graph. Each connected component should be represented as a list of nodes.

### Function Signature
```kotlin
fun findConnectedComponents(graph: Map<Int, List<Int>>): List<List<Int>>
```

### Input
- `graph`: A map where the key is a node (an integer) and the value is a list of integers representing the nodes connected to the key node.

### Output
- A list of lists, where each inner list contains the nodes in a connected component.

### Example
```kotlin
val graph = mapOf(
    0 to listOf(1, 2),
    1 to listOf(0),
    2 to listOf(0),
    3 to listOf(4),
    4 to listOf(3)
)

val connectedComponents = findConnectedComponents(graph)
// Output: [[0, 1, 2], [3, 4]]
```

### Explanation
In the given graph, there are two connected components: one consisting of nodes 0, 1, and 2, and another consisting of nodes 3 and 4.

### Constraints
- The graph will not contain self-loops or multiple edges.
- The graph can have isolated nodes (nodes with no edges).

### Hints
1. Use a Depth-First Search (DFS) to traverse the graph.
2. Keep track of visited nodes to avoid reprocessing them.
3. Start a new DFS traversal for each unvisited node to find all nodes in its connected component.