package Day7.Problem1

class VotingSystem(){
    val candidates = mutableListOf<Candidate>()
    var counter = 0

    fun addCandidate(name: String){
        counter++
        candidates.add(Candidate(counter, name))
    }
    fun castVote(candidateId: Int){
        val candidate = candidates.find { it.id == candidateId }
        if(candidate != null){
            candidate.voteCount++
        } else {
            println("Candidate not found")
        }
    }
    fun getWinner(): Candidate{
        return candidates.maxBy { it.voteCount }
    }
}