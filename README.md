## Palindrome Checker using Recursion

### Workflow

1. **Input String**

   * Define a string to check (example: `"madam"`).

2. **Recursive Function**

   * A method `check(String s, int start, int end)` is used to check the palindrome.

3. **Base Condition**

   * If `start >= end`, the string is a palindrome.

4. **Character Comparison**

   * Compare the characters at positions `start` and `end`.

5. **Mismatch Condition**

   * If characters are not equal, return `false`.

6. **Recursive Step**

   * Call the function again with:
   * `start + 1`
   * `end - 1`

7. **Termination**

   * The recursion continues until all characters are checked.

### Example

Input:
madam

Output:
Is Palindrome? : true

### Concepts Used

* Recursion
* String indexing
* Base condition and recursive calls
