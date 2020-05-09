package week1.day2.assignment;

public class Palindrome
{
    public static void main(final String[] args) {
        final String A = "madam";
        String R = "";
        final int lenght = A.length();
        for (int i = lenght - 1; i >= 0; --i) {
            R = String.valueOf(R) + A.charAt(i);
        }
        if (A.equals(R)) {
            System.out.println(String.valueOf(A) + " " + "is a palindrome");
        }
        else {
            System.out.println(String.valueOf(A) + " " + "is not a palindrome");
        }
    }
}