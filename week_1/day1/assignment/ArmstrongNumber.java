package week1.day1.assignment;

public class ArmstrongNumber
{
    public static void main(final String[] args) {
        int n = 153;
        int sum = 0;
        final int temp = n;
        while (n > 0) {
            final int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("number is Armstrong");
        }
        else {
            System.out.println("number is not an Armstrong");
        }
    }
}