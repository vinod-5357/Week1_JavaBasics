package week1.day2.classroom;

public class FindTypes
{
    public static void main(final String[] args) {
        final String test = "$$ Welcome to 2nd Class of Automation $$ ";
        final int letter = 0;
        final int space = 0;
        final int num = 0;
        final int specialChar = 0;
        final char[] array = test.toCharArray();
        for (int i = 0; i < array.length - 1; ++i) {
            if (Character.isLetter(i)) {
                System.out.println("Letter" + letter);
            }
            if (Character.isDigit(i)) {
                System.out.println("Digit :" + num);
            }
            if (Character.isSpaceChar(i)) {
                System.out.println("Space : " + space);
            }
            else {
                System.out.println("Special character :" + specialChar);
            }
        }
    }
}