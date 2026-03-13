## Palindrome Checker using Strategy Pattern (Stack Implementation)

### Workflow

1. **Strategy Interface**

    * `PalindromeStrategy` defines a method `check(String input)`.

2. **Concrete Strategy**

    * `StackStrategy` implements the interface.
    * Uses a **Stack (LIFO)** to reverse characters.

3. **Push Characters**

    * Each character of the string is pushed into the stack.

4. **Comparison**

    * Characters are popped from the stack and compared with the original string.

5. **Mismatch Handling**

    * If any character differs → return `false`.

6. **Main Class**

    * `UseCase12PalindromeCheckerApp` creates the strategy object.
    * Calls the `check()` method to verify palindrome.

### Example

Input:
level

Output:
Is Palindrome? : true

### Concepts Used

* Strategy Design Pattern
* Stack Data Structure
* LIFO Principle
