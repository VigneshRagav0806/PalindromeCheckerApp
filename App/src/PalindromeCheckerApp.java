public interface PalindromeStrategy {

    // Method to check if a string is palindrome
    boolean check(String input);
}
import java.util.Stack;

/**
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using stack.
     *
     * @param input string to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Create strategy object
        PalindromeStrategy strategy = new StackStrategy();

        // Perform palindrome check
        boolean result = strategy.check(input);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
