package Day10.Problem3

class EventManager {
    private val events = mutableListOf<Event>()
    private val attendees = mutableListOf<Attendee>()

    fun createEvent(event: Event){
        events.add(event)
    }
    fun registerAttendee(eventId: String, attendee: Attendee){
        events.find { it.eventId == eventId }?.attendees?.add(attendee)
    }
    fun getEventDetails(eventId: String): Event?{
        return events.find { it.eventId == eventId }
    }
    fun viewEvents(): List<Event>{
        return events
    }
}