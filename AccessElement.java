import java.util.Scanner;
public class Solution {
    public static int isEven(int n) {
        if (n % 2 == 0) {
            return 2;   // Even
        } else {
            return 1;   // Odd
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read input number
        int n = sc.nextInt();
        // Call function and print result
        System.out.println(isEven(n));
        sc.close();
    }
}
