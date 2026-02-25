import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.addLast(c); // list.add(c) also works, but addLast makes the intent clear
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Compare and remove the first and last elements simultaneously
            if (list.removeFirst() != list.removeLast()) {
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