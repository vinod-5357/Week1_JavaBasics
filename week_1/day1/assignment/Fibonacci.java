package week1.day1.assignment;

public class Fibonacci
{
    public static void main(final String[] args) {
        int a = 1;
        int b = 1;
        int n = 0;
        System.out.println(" 1  1 ");
        while (n <= 50) {
            n = a + b;
            System.out.println(n);
            a = b;
            b = n;
        }
    }
}