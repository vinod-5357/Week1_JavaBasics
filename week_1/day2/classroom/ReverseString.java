package week1.day2.classroom;

public class ReverseString
{
    public static void main(final String[] args) {
        final String original = "Reverse a String";
        String reverse = "";
        final int length = original.length();
        for (int i = length - 1; i >= 0; --i) {
            reverse = String.valueOf(reverse) + original.charAt(i);
        }
        System.out.println("Reverse of the string: " + reverse);
    }
}