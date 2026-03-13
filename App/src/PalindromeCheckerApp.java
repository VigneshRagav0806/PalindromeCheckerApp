public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "racecar";

        // Call the palindrome checking method
        boolean result = checkPalindrome(input);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    public static boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
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
