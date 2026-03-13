public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Start time measurement
        long startTime = System.nanoTime();

        // Palindrome check using two-pointer technique
        boolean isPalindrome = checkPalindrome(input);

        // End time measurement
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    // Method to check palindrome
    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}