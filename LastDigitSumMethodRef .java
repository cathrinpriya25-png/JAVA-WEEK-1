import java.util.function.BiFunction;
public class LastDigitSumMethodRef {
    public static void main(String[] args) {
        // Functional Interface (BiFunction) with Method Reference
        BiFunction<Integer, Integer, Integer> sumLastDigit =
                LastDigitSumMethodRef::calculateLastDigitSum;
        int num1 = 123;
        int num2 = 789;
        System.out.println("Sum of last digits: " + sumLastDigit.apply(num1, num2));
    }
    // Method used for Method Reference
    public static int calculateLastDigitSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}
