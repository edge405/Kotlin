### Problem: `Invoice Generator`

#### Problem Statement

You are tasked with creating a simple invoice generator for a small business. Each invoice contains multiple items, and each item has a name, quantity, and price per unit. The program should calculate the total amount for each item and the overall total for the invoice. The output should be formatted to show the item details and the overall total.

#### Input

The input consists of:
- An integer `n` (1 ≤ n ≤ 100) representing the number of items in the invoice.
- For each item, a string `name` (1 ≤ length of `name` ≤ 50), an integer `quantity` (1 ≤ quantity ≤ 1000), and a double `price` (0.01 ≤ price ≤ 1000.00).

#### Output

The output should display the details of each item and the total amount for the invoice, formatted to two decimal places. The format should be as follows:
```
Item: [name], Quantity: [quantity], Unit Price: [price], Total: [item_total]
...
Overall Total: [total]
```

#### Example

**Input:**
```
3
Apple 2 1.50
Banana 5 0.30
Orange 3 0.80
```

**Output:**
```
Item: Apple, Quantity: 2, Unit Price: 1.50, Total: 3.00
Item: Banana, Quantity: 5, Unit Price: 0.30, Total: 1.50
Item: Orange, Quantity: 3, Unit Price: 0.80, Total: 2.40
Overall Total: 6.90
```