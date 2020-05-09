package week1.day2.assignment;

public class ChangeOddIndexToUpperCase
{
    public static void main(final String[] args) {
        final String a = "selenium";
        final char[] array = a.toCharArray();
        for (int i = 0; i < array.length; ++i) {
            final char c = array[i];
            if (i % 2 != 0) {
                System.out.print(Character.toUpperCase(c));
            }
            else {
                System.out.print(Character.toLowerCase(c));
            }
        }
    }
}