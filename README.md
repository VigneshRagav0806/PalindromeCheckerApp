## Palindrome Checker using Two Pointer Method

### Workflow

1. **Input String**

   * A string is provided as input (example: `"racecar"`).

2. **Method Creation**

   * A method `checkPalindrome(String input)` is used to verify the palindrome.

3. **Pointer Initialization**

   * `start = 0` (first character)
   * `end = input.length() - 1` (last character)

4. **Comparison Process**

   * Compare characters at `start` and `end`.

5. **Pointer Movement**

   * If characters match:

      * Increment `start`
      * Decrement `end`

6. **Mismatch Condition**

   * If characters differ → return `false`.

7. **Completion**

   * If all pairs match → return `true`.

### Example

Input:
racecar

Output:
Is Palindrome? : true

### Concepts Used

* Two pointer technique
* String indexing
* While loop comparison
