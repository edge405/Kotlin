package Day7.Problem1

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

    println("Winner: ${votingSystem.getWinner().name}") // Expected: Candidate A
}