import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove spaces
        String processed = input.toLowerCase().replaceAll("\\s+", "");

        String reversed = "";

        // Reverse the processed string
        for (int i = processed.length() - 1; i >= 0; i--) {
            reversed = reversed + processed.charAt(i);
        }

        if (processed.equals(reversed)) {
            System.out.println("The given string is a PALINDROME.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}