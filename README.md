## Palindrome Checker using LinkedList

### Workflow

1. **Input Initialization**
   - Define the input string to test (example: "level").

2. **LinkedList Creation**
   - A `LinkedList<Character>` is created to store characters.

3. **Insert Characters**
   - Each character of the string is added to the linked list.

4. **Comparison Process**
   - The program removes characters from both ends:
      - `removeFirst()` → first character
      - `removeLast()` → last character

5. **Palindrome Check**
   - If both characters match, the checking continues.
   - If they do not match, the string is not a palindrome.

6. **Termination Condition**
   - The process stops when one or zero elements remain.

7. **Result**
   - If no mismatch occurs → **Palindrome**
   - Otherwise → **Not a Palindrome**

### Concepts Used
- LinkedList data structure
- Two-end comparison
- Character traversal
