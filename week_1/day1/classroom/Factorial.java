package week1.day1.classroom;

public class Factorial
{
    public static void main(final String[] args) {
        final int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; ++i) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}