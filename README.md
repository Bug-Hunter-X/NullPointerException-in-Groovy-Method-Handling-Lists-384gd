# Groovy NullPointerException Handling in List Methods

This repository demonstrates a common Groovy error: a `NullPointerException` when a method receives a `null` list. The provided code shows the error and its solution.

## Bug
The `myMethod` function does not handle the case where the input list is `null`. This leads to a `NullPointerException` when the method tries to access the list's properties or methods.

## Solution
The solution involves adding a check for a `null` input and returning an empty list or handling the null appropriately to avoid the exception. This makes the method more robust and prevents unexpected crashes.