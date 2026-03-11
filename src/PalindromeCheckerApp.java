import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    static class PalindromeService {

        public boolean isPalindrome(String input) {

            String processed = input.toLowerCase().replaceAll("\\s+", "");

            int start = 0;
            int end = processed.length() - 1;

            while (start < end) {

                if (processed.charAt(start) != processed.charAt(end)) {
                    return false;
                }

                start++;
                end--;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        boolean result = service.isPalindrome(input);

        if (result) {
            System.out.println("The given string is a PALINDROME.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}