package Day3.Problem1

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class HotelManagementSystem {


//  My Solution LOL:
//
//    private val rooms = mutableListOf<Room>()
//    private val customers = mutableListOf<Customer>()
//    private val bookings = mutableListOf<Booking>()
//    private val checkInDate = mutableMapOf<String, Booking>()
//    private val checkOutDate = mutableMapOf<String, Booking>()
//
//    fun addRoom(
//        roomNumber: String,
//        type: String,
//        pricePerNight: Double,
//        isBooked: Boolean = false
//    ){
//        rooms.add(Room(roomNumber, type, pricePerNight, isBooked))
//    }
//    fun registerCustomer(
//        id: String,
//        name: String,
//        email: String
//    ){
//        customers.add(Customer(id, name, email))
//    }
//    fun bookRoom(
//        bookingId: String,
//        roomNumber: String,
//        customerId: String,
//        checkInDate: String,
//        checkOutDate: String
//    ){
//        bookings.add(Booking(bookingId, roomNumber, customerId, checkInDate, checkOutDate))
//    }
//    fun checkIn(bookingId: String){
//        val booking = bookings.find { it.bookingId == bookingId }
//        if(booking != null){
//            checkInDate[bookingId] = booking
//        }
//    }
//    fun checkOut(bookingId: String){
//        val booking = bookings.find { it.bookingId == bookingId}
//        if(booking != null){
//            checkOutDate[bookingId] = booking
//        }
//    }
//    fun calculateBill(bookingId: String): Double{
//        val book = checkInDate[bookingId]
//        val room =
//    }
//
//    I'm stucked with this  line

    private val rooms = mutableListOf<Room>()
    private val customers = mutableListOf<Customer>()
    private val bookings = mutableListOf<Booking>()
    private val checkInDate = mutableMapOf<String, Booking>()
    private val checkOutDate = mutableMapOf<String, Booking>()

    fun addRoom(
        roomNumber: String,
        type: String,
        pricePerNight: Double,
        isBooked: Boolean = false
    ) {
        rooms.add(Room(roomNumber, type, pricePerNight, isBooked))
    }

    fun registerCustomer(
        id: String,
        name: String,
        email: String
    ) {
        customers.add(Customer(id, name, email))
    }

    fun bookRoom(
        bookingId: String,
        roomNumber: String,
        customerId: String,
        checkInDate: String,
        checkOutDate: String
    ) {
        val room = rooms.find { it.roomNumber == roomNumber && !it.isBooked }
        if (room != null) {
            room.isBooked = true
            bookings.add(Booking(bookingId, roomNumber, customerId, checkInDate, checkOutDate))
            println("Room $roomNumber booked successfully for $checkInDate to $checkOutDate")
        } else {
            println("Room $roomNumber is already booked or does not exist.")
        }
    }

    fun checkIn(bookingId: String) {
        val booking = bookings.find { it.bookingId == bookingId }
        if (booking != null) {
            checkInDate[bookingId] = booking
            println("Customer checked in for booking $bookingId")
        } else {
            println("Booking $bookingId not found.")
        }
    }

    fun checkOut(bookingId: String) {
        val booking = bookings.find { it.bookingId == bookingId }
        if (booking != null) {
            checkOutDate[bookingId] = booking
            println("Customer checked out for booking $bookingId")
        } else {
            println("Booking $bookingId not found.")
        }
    }

    fun calculateBill(bookingId: String): Double {
        val booking = checkInDate[bookingId]
        return if (booking != null) {
            val nights = calculateNights(booking.checkInDate, booking.checkOutDate)
            val room = rooms.find { it.roomNumber == booking.roomNumber }
            if (room != null) {
                nights * room.pricePerNight
            } else {
                println("Room ${booking.roomNumber} not found.")
                0.0
            }
        } else {
            println("Booking $bookingId not found.")
            0.0
        }
    }

    private fun calculateNights(checkInDate: String, checkOutDate: String): Long {
        val startDate = LocalDate.parse(checkInDate)
        val endDate = LocalDate.parse(checkOutDate)
        return ChronoUnit.DAYS.between(startDate, endDate)
    }
}