@FunctionalInterface
interface DigitSum {
    int calculate(int number, String option);
}
public class DigitSumLambda {
    public static void main(String[] args) {
        DigitSum ds = (num, opt) -> {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                if (opt.equalsIgnoreCase("even") && digit % 2 == 0)
                    sum += digit;
                else if (opt.equalsIgnoreCase("odd") && digit % 2 != 0)
                    sum += digit;
                num /= 10;
            }
            return sum;
        };
        System.out.println("Sum of even digits: " + ds.calculate(12345, "even"));
        System.out.println("Sum of odd digits: " + ds.calculate(12345, "odd"));
    }
}
