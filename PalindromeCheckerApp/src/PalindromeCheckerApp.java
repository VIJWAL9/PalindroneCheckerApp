public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Input text: " + original);
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Input text: " + original);
            System.out.println("Is it a Palindrome? : false");
        }
    }
}