## Palindrome Checker (Ignoring Spaces and Case)

### Workflow

1. **Input Sentence**

   * A sentence is provided as input
   * Example: `"A man a plan a canal Panama"`

2. **Normalization**

   * Remove spaces using `replaceAll("\\s+", "")`
   * Convert all letters to lowercase using `toLowerCase()`

3. **Palindrome Check**

   * Compare characters from both ends of the string.

4. **Loop Condition**

   * Loop runs from index `0` to `length/2`.

5. **Character Comparison**

   * Compare `charAt(i)` with `charAt(length - 1 - i)`.

6. **Mismatch Handling**

   * If characters differ → Not a palindrome.

7. **Result**

   * If all symmetric characters match → Palindrome.

### Example

Input:
A man a plan a canal Panama

Output:
Is Palindrome? : true

### Concepts Used

* String normalization
* Character comparison
* Two-pointer technique
