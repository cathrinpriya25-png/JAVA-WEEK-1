import java.util.function.Predicate;
public class PalindromeMethodRef {
    public static void main(String[] args) {
        // Functional Interface (Predicate) with Method Reference
        Predicate<Integer> isPalindrome = PalindromeMethodRef::checkPalindrome;
        int number = 121;
        if (isPalindrome.test(number)) {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is NOT a Palindrome number");
        }
    }
    // Method used for Method Reference
    public static boolean checkPalindrome(int num) {
        int reverse = 0, temp = num;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return num == reverse;
    }
}
