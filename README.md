## Palindrome Checker using Queue and Stack

### Workflow

1. **Input String**
    - Define a string to check if it is a palindrome (example: "civic").

2. **Create Data Structures**
    - A **Queue** is used to store characters in FIFO order.
    - A **Stack** is used to store characters in LIFO order.

3. **Insert Characters**
    - Each character of the string is inserted into both the queue and the stack.

4. **Comparison Process**
    - Characters are removed from the queue and stack simultaneously.
    - Queue gives characters from the **start** of the string.
    - Stack gives characters from the **end** of the string.

5. **Palindrome Check**
    - If both characters match, continue checking.
    - If any mismatch occurs, the string is **not a palindrome**.

6. **Result**
    - If all characters match → **Palindrome**
    - Otherwise → **Not a Palindrome**

### Concepts Used
- Stack (LIFO)
- Queue (FIFO)
- String traversal
- Data structure comparison
