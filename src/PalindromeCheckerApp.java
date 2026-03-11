import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    interface PalindromeStrategy {
        boolean checkPalindrome(String input);
    }

    // Strategy 1: Reverse String Method
    static class ReverseStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String input) {

            String reversed = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }

            return input.equals(reversed);
        }
    }

    // Strategy 2: Two Pointer Method
    static class TwoPointerStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String input) {

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

    // Context Class
    static class PalindromeContext {

        private PalindromeStrategy strategy;

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.checkPalindrome(input);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.println("Choose Palindrome Algorithm:");
        System.out.println("1. Reverse String Strategy");
        System.out.println("2. Two Pointer Strategy");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (choice == 1) {
            context.setStrategy(new ReverseStrategy());
        } else {
            context.setStrategy(new TwoPointerStrategy());
        }

        boolean result = context.execute(input);

        if (result) {
            System.out.println("The given string is a PALINDROME.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}

