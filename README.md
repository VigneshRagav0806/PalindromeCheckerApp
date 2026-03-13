## Palindrome Checker using Deque

### Workflow

1. **Input Initialization**
   - Define a string to check (example: "refer").

2. **Deque Creation**
   - A `Deque<Character>` is created using `ArrayDeque`.

3. **Insert Characters**
   - Each character of the string is added to the deque.

4. **Comparison Process**
   - The program removes characters from both ends:
      - `removeFirst()` → front character
      - `removeLast()` → last character

5. **Palindrome Check**
   - If both characters are equal, continue.
   - If they differ, the string is not a palindrome.

6. **Termination**
   - The process continues until only one or zero characters remain.

7. **Result**
   - If no mismatch occurs → **Palindrome**
   - Otherwise → **Not a Palindrome**

### Concepts Used

- Deque (Double Ended Queue)
- Front and Rear comparison
- String traversal
