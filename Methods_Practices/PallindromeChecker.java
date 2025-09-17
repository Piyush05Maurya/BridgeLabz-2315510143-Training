package oops;

public class PallindromeChecker {
    String text;

    PallindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleantext = text.replaceAll("\\s", "").toLowerCase();
        String reverseText = new StringBuilder(cleantext).reverse().toString();
        return cleantext.equals(reverseText);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        PallindromeChecker checker1 = new PallindromeChecker("A man a plan a canal Panama");
        checker1.displayResult();

        PallindromeChecker checker2 = new PallindromeChecker("Hello");
        checker2.displayResult();
    }
}

