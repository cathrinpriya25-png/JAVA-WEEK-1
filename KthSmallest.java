import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (k > 0 && k <= arr.length) {
            Arrays.sort(arr);
            System.out.println("Kth smallest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of K");
        }
    }
}
