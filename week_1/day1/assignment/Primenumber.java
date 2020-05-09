package week1.day1.assignment;

public class Primenumber
{
    public static void main(final String[] args) {
        final int n = 7;
        boolean isPrime = true;
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is a prime");
        }
        else {
            System.out.println("Number is not a prime");
        }
    }
}