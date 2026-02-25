import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c); // addLast() builds it in the correct forward order
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Compare and remove the first and last elements simultaneously
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is NOT a palindrome.");
        }
    }
}