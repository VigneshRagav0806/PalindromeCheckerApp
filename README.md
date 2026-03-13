## Palindrome Checker using Stack (Java)

### Workflow

1. **Input Initialization**
  - A string input is defined (example: `"noon"`).

2. **Stack Creation**
  - A `Stack<Character>` is created to store characters of the string.

3. **Push Operation**
  - Each character from the string is pushed into the stack.
  - This reverses the order of characters internally.

4. **Palindrome Assumption**
  - A boolean variable `isPalindrome` is initialized as `true`.

5. **Comparison Process**
  - The program loops through the string again.
  - Each character is compared with the character popped from the stack.

6. **Mismatch Detection**
  - If any character does not match the popped character, `isPalindrome` becomes `false`.

7. **Result Output**
  - If all characters match, the string is a **Palindrome**.
  - Otherwise, it is **Not a Palindrome**.

### Example

Input: