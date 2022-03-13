package recursion;

// Q: number = 12321 -> sum of digits = 9
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(productOfDigits(100));
    }

    public static int sumOfDigits(int number) {
        if (number % 10 == 0) {
            return 0;
        }

        return number%10 + sumOfDigits(number / 10);


    }

    public static int productOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 * sumOfDigits(number / 10);


    }
}
