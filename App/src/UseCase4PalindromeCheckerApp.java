public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "radar";

        // Convert the string into a character array.
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            // If characters at the pointers don't match, it's not a palindrome
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit the loop early
            }
            // Move pointers inward
            start++;
            end--;
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is NOT a palindrome.");
        }
    }
}