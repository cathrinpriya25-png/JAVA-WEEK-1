@FunctionalInterface
interface Fibonacci {
    int find(int n);
}
public class FibonacciLambda {
    public static void main(String[] args) {
        Fibonacci fib = n -> {
            if (n <= 1)
                return n;
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        };
        System.out.println("5th Fibonacci number: " + fib.find(5));
        System.out.println("8th Fibonacci number: " + fib.find(8));
    }
}
