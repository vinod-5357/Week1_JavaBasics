package week1.day1.classroom;

public class OddNumbers
{
    public static void main(final String[] args) {
        for (int i = 1; i <= 20; ++i) {
            if (i % 2 != 0) {
                System.out.println("Odd numbers between 1 to 20 is " + i);
            }
        }
    }
}