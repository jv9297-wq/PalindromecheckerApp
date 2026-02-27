public class PalindromecheckerApp {

    public static void main(String[] args) {
        PalindromecheckerApp app = new PalindromecheckerApp();
        app.runUseCase("madam");
        app.runUseCase("hello");
        app.runUseCase("racecar");
    }

    public void runUseCase(String input) {
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    private boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
