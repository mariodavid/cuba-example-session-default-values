## CUBA example: Default Values for session

This example shows how to define default values for a given user. Those default values will be used in other screens where those values can be placed into.

Example:

A `Customer` has an attribute `name`. In the default values screen a global `name` attribute value can be entered (e.g. "Fred"). For every invocation of the customer editor screen, the `name` field of the Customer will be set to the value "Fred".

The `Order` and an `Invoice` entities both have values for `dueDate` and `customer`. In the default values screen a global `dueDate` and `customer` attribute value can be entered (e.g. "01/02/2019" & "Customer: Fred"). For every invocation of the invoice and order editor screen, the `dueDate` field  will be set to the value "01/02/2019" and the `customer` field  will be set to the value "Customer: Fred" .

### How it works

