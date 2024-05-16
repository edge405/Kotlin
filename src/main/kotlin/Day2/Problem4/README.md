## Problem: Restaurant Management System
You are tasked with developing a software solution for a restaurant to streamline its operations and improve efficiency. The system should facilitate menu management, order handling, bill calculation, and table reservation.

### Requirements:
#### MenuItem Data Class:

Define a MenuItem data class with the following properties:
* id: String - unique identifier for the menu item.
* name: String - name of the menu item.
* price: Double - price of the menu item.
#### Order Data Class:

Implement an Order data class with the following properties:
* id: String - unique identifier for the order.
* items: List<MenuItem> - list of menu items included in the order.
#### Table Data Class:

Create a Table data class with the following properties:
* id: String - unique identifier for the table.
* capacity: Int - maximum seating capacity of the table.
* reserved: Boolean - indicates whether the table is reserved or not.
#### RestaurantManagementSystem Class:

#### Define a RestaurantManagementSystem class to manage restaurant operations.
Functions:
* addMenuItem(name: String, price: Double): Adds a new menu item to the system.
* takeOrder(tableId: String, orderItems: List<MenuItem>): Records an order for a specific table.
* calculateBill(tableId: String): Double: Calculates the total bill for a table based on the items ordered.
* reserveTable(tableId: String): Reserves a table for future use.
* cancelReservation(tableId: String): Cancels a previously made reservation for a table.
* addTable(tableId: String, capacity: Int): Adds a new table to the restaurant with the specified seating capacity.
* displayMenu(): Displays the list of available menu items with their prices.
* displayTables(): Displays the list of tables along with their current status (reserved or available).
#### Main Program:
Your main program should demonstrate the functionality of the RestaurantManagementSystem class by performing the following tasks:

* Add menu items to the system.
* Add tables to the restaurant.
* Display the menu and available tables.
* Take orders for tables.
* Calculate bills for tables.
* Reserve and cancel table reservations.
* Display updated table status after reservation or cancellation.
#### Additional Notes:
Ensure proper error handling for scenarios such as invalid table IDs or unavailable menu items.
Consider implementing additional features such as modifying menu items, updating table capacities, or generating reports for management purposes.

### Reflection:
Damn dude! this is a high level problem, I felt frustrating when solving this problem I don't understand how to solve it, like how to structure my code and that's why I ended up being frustrated!!! FUCK. Okay, I think I have to learn this shitting HashMap for one day and then explore some problem on it. I just felt frustrated it's because I'm not familiar with this type of shit HashMap. Okay I think this is the last problem I'm gonna solve for this Day 2, I think I have to learn slow in this case so that I can catch up easily. In the next day I'll be focusing on the HashMap, FUCKING HASHMAP!!! see yuh!