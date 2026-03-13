public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Call recursive method
        boolean result = check(input, 0, input.length() - 1);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base case: if start crosses end, palindrome confirmed
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call for next inner characters
        return check(s, start + 1, end - 1);
    }
}
