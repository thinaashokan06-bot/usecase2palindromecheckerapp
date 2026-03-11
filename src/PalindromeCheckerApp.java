import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    // Reverse String Method
    public static boolean reverseMethod(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    // Two Pointer Method
    public static boolean twoPointerMethod(String input) {

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

    // Recursive Method
    public static boolean recursiveMethod(String input, int start, int end) {

        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return recursiveMethod(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse Method Performance
        long startTime1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long endTime1 = System.nanoTime();

        // Two Pointer Performance
        long startTime2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long endTime2 = System.nanoTime();

        // Recursive Performance
        long startTime3 = System.nanoTime();
        boolean result3 = recursiveMethod(input, 0, input.length() - 1);
        long endTime3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Reverse Method: " + result1 + " | Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("Two Pointer Method: " + result2 + " | Time: " + (endTime2 - startTime2) + " ns");

        System.out.println("Recursive Method: " + result3 + " | Time: " + (endTime3 - startTime3) + " ns");

        scanner.close();
    }
}