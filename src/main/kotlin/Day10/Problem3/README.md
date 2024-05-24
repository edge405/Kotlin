### Problem: Event Management System

You need to create an event management system that allows users to create events, register attendees, and manage event details. The system should provide functionalities for managing events, attendees, and viewing event details.

#### Requirements:

1. **Event Data Class**:
    - **Attributes**:
        - `eventId: String`
        - `eventName: String`
        - `eventDate: String`
        - `location: String`
        - `attendees: MutableList<Attendee>`
    - No methods required.

2. **Attendee Data Class**:
    - **Attributes**:
        - `attendeeId: String`
        - `name: String`
    - No methods required.

3. **EventManager Class**:
    - **Attributes**:
        - `events: MutableList<Event>`
        - `attendees: MutableList<Attendee>`
    - **Methods**:
        - `createEvent(event: Event)`: Add a new event.
        - `registerAttendee(eventId: String, attendee: Attendee)`: Register an attendee for an event.
        - `getEventDetails(eventId: String): Event?`: Retrieve event details.
        - `viewEvents(): List<Event>`: View all events.

### Example Usage:
```kotlin
fun main() {
    val eventManager = EventManager()

    // Create events
    val event1 = Event("e001", "Tech Conference", "2024-06-15", "Conference Center")
    val event2 = Event("e002", "Music Festival", "2024-07-20", "City Park")

    eventManager.createEvent(event1)
    eventManager.createEvent(event2)

    // Register attendees for events
    val attendee1 = Attendee("a001", "Alice")
    val attendee2 = Attendee("a002", "Bob")
    val attendee3 = Attendee("a003", "Charlie")

    eventManager.registerAttendee("e001", attendee1)
    eventManager.registerAttendee("e001", attendee2)
    eventManager.registerAttendee("e002", attendee3)

    // View event details
    val eventDetails1 = eventManager.getEventDetails("e001")
    println("Event Details for e001: $eventDetails1")

    val eventDetails2 = eventManager.getEventDetails("e002")
    println("Event Details for e002: $eventDetails2")

    // View all events
    val events = eventManager.viewEvents()
    println("All Events: $events")
}
```

This problem should help you practice managing collections of data and implementing basic CRUD (Create, Read, Update, Delete) operations in Kotlin.

##
#### Yo! So I asked again ChatGPT for my approach LOL I got a positive feedback compare to problem 2 here's what ChatGPT response : *"You've encapsulated the event management logic within the EventManager class, and your methods handle adding events, registering attendees, retrieving event details, and viewing events as required. Your implementation is concise, adheres to the specified requirements, and effectively manages events and attendees. Great job!"*
![img.png](img.png)