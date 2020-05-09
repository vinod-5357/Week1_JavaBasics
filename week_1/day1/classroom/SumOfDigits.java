package week1.day1.classroom;

public class SumOfDigits
{
    public static void main(final String[] args) {
        int num = 654;
        int sum = 0;
        while (num > 0) {
            final int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of Digits:" + sum);
    }
}