import java.util.function.BiFunction;
public class DigitSumLambda {
    public static void main(String[] args) {

        // Lambda Expression:
        // true  -> sum of even digits
        // false -> sum of odd digits
        BiFunction<Integer, Boolean, Integer> digitSum = (num, isEven) -> {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                if (isEven && digit % 2 == 0) {
                    sum += digit;
                } else if (!isEven && digit % 2 != 0) {
                    sum += digit;
                }
                num = num / 10;
            }
            return sum;
        };
        int number = 123456;
        System.out.println("Sum of even digits: " + digitSum.apply(number, true));
        System.out.println("Sum of odd digits: " + digitSum.apply(number, false));
    

