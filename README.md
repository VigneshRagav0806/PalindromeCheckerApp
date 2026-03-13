## Palindrome Checker with Execution Time Benchmark

### Workflow

1. **Input String**

   * Define a string to test for palindrome (example: "level").

2. **Start Time Measurement**

   * Use `System.nanoTime()` to record the start time.

3. **Palindrome Check**

   * A two-pointer technique compares characters from both ends.

4. **End Time Measurement**

   * `System.nanoTime()` is used again after the check.

5. **Execution Time Calculation**

   * Execution Time = `endTime - startTime`.

6. **Output**

   * Displays the input string.
   * Shows whether it is a palindrome.
   * Prints the execution time in nanoseconds.

### Example

Input:
level

Output:
Is Palindrome? : true
Execution Time : 85200 ns

### Concepts Used

* Algorithm benchmarking
* System.nanoTime()
* Two-pointer palindrome algorithm
