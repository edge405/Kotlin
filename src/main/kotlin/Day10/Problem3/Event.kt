package Day10.Problem3

data class Event(
    val eventId: String,
    val eventName: String,
    val eventDate: String,
    val location: String,
    val attendees: MutableList<Attendee>
)
