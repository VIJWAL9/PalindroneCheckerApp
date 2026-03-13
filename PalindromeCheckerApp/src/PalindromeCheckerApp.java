import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
    public static boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanInput.isEmpty()) return true;

        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : cleanInput.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            Character front = deque.removeFirst();
            Character rear = deque.removeLast();

            if (!front.equals(rear)) {
                return false;
            }
        }

        return true;
    }
}