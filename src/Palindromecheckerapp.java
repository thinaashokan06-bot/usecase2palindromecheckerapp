public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;

        System.out.println("Input text: " + input);

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
