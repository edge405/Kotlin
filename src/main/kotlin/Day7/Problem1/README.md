### Problem: Voting System

You are tasked with creating a simplified voting system for a small community. The system should allow adding candidates, casting votes for candidates, and determining the winner of the election. Each candidate has a unique ID, a name, and a count of received votes.

#### Requirements:
1. Implement a data class `Candidate` with the following properties:
    - `id`: Int (unique identifier for the candidate)
    - `name`: String
    - `voteCount`: Int (default is 0)

2. Implement a class `VotingSystem` with the following methods:
    - `addCandidate(name: String)`: Adds a new candidate to the system.
    - `castVote(candidateId: Int)`: Casts a vote for the specified candidate.
    - `getWinner()`: Returns the candidate with the highest number of votes.

#### Example Usage:

```kotlin
fun main() {
    val votingSystem = VotingSystem()

    votingSystem.addCandidate("Candidate A")
    votingSystem.addCandidate("Candidate B")
    votingSystem.addCandidate("Candidate C")

    votingSystem.castVote(1)
    votingSystem.castVote(2)
    votingSystem.castVote(1)
    votingSystem.castVote(3)
    votingSystem.castVote(1)

    println("Winner: ${votingSystem.getWinner()}") // Expected: Candidate A
}
```

### Explanation of Methods:
1. **`addCandidate(name: String)`**: Adds a new candidate with the given name to the voting system. Each candidate gets a unique ID.
2. **`castVote(candidateId: Int)`**: Casts a vote for the specified candidate by incrementing their vote count.
3. **`getWinner()`**: Returns the candidate with the highest number of votes.

This problem simulates a simple voting system, allowing you to practice object-oriented programming and basic list management in Kotlin.

### Reflection:
Still easy af, but I got confused a little by getWinner method I don't know how to get the most vote of the candidate concisely like declarative approach so I ask ChatGPT to do it, and I found out maxOf function is the solution to this problem. If I go for loop to check the highest vote of the candidate I saw it dirty code coz it has a lot of line of code so declarative approach is better :))