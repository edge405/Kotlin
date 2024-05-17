**Hotel Management System**

**Problem:**

You need to create a software solution for managing a hotel's operations, including room management, customer registration, booking, check-in, check-out, and bill calculation.

**Requirements:**

**Room Data Class:**

Create a `Room` data class with:

- `roomNumber`: Unique identifier for the room.
- `type`: Type of the room (e.g., Single, Double, Suite).
- `pricePerNight`: Cost per night for staying in the room.
- `isBooked`: Indicates whether the room is currently booked or not.

**Customer Data Class:**

Implement a `Customer` data class with:

- `id`: Unique identifier for the customer.
- `name`: Name of the customer.
- `email`: Email address of the customer.

**Booking Data Class:**

Create a `Booking` data class with:

- `bookingId`: Unique identifier for the booking.
- `roomNumber`: Room number associated with the booking.
- `customerId`: Customer ID who made the booking.
- `checkInDate`: Check-in date in YYYY-MM-DD format.
- `checkOutDate`: Check-out date in YYYY-MM-DD format.

**HotelManagementSystem Class:**

Define a `HotelManagementSystem` class to manage hotel operations with functions to:

- `addRoom(roomNumber, type, pricePerNight)`: Adds a new room to the hotel.
- `registerCustomer(id, name, email)`: Registers a new customer.
- `bookRoom(bookingId, roomNumber, customerId, checkInDate, checkOutDate)`: Books a room for a customer.
- `checkIn(bookingId)`: Checks a customer into a booked room.
- `checkOut(bookingId)`: Checks a customer out of a booked room.
- `calculateBill(bookingId)`: Calculates the bill for a completed stay based on the number of nights.
- `calculateNights(checkInDate, checkOutDate)`: Calculates the number of nights between the check-in and check-out dates.

**Main Program:**

Demonstrate the functionality of the `HotelManagementSystem` class by:

- Adding rooms to the hotel.
- Registering customers.
- Booking rooms for customers.
- Checking customers in and out.
- Calculating bills for completed stays.

**Additional Notes:**

Ensure proper error handling for scenarios such as invalid room numbers, overlapping bookings, and invalid booking IDs. You may consider implementing additional features such as modifying room details, updating customer information, or generating reports for management purposes.

### Reflection
it's getting hard huh HAHAHAH alright I haven't learnt today see yuh tomorrow HAHAHAHAH